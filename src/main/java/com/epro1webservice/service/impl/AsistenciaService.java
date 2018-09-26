package com.epro1webservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epro1webservice.entity.AsistenciaEntity;
import com.epro1webservice.repository.IAsistenciaRepository;
import com.epro1webservice.service.IAsistenciaService;


@Service
public class AsistenciaService implements IAsistenciaService {

	@Autowired
	private IAsistenciaRepository asitenciaRepository;
	
	
	@Override
	public boolean addAsistencia(AsistenciaEntity asistencia) {
		
		
		if (asitenciaRepository.save(asistencia) != null) {
			
			return true;
		}
		
		return false;
	}

	@Override
	public List<AsistenciaEntity> getAllAsistencias() {
		
		return asitenciaRepository.findAll();
	}

	@Override
	public List<AsistenciaEntity> getAsistenciasByCarne(String carne) {
		// TODO Auto-generated method stub
		return null;
	}

}
