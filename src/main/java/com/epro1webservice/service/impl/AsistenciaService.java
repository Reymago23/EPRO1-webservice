package com.epro1webservice.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epro1webservice.entity.Asistencia;
import com.epro1webservice.repository.IAsistenciaRepository;
import com.epro1webservice.service.IAsistenciaService;


@Service("asistenciaService")
public class AsistenciaService implements IAsistenciaService {

	@Autowired
	private IAsistenciaRepository asitenciaRepository;
	
	
	@Override
	public Asistencia addAsistencia(Asistencia asistencia) {
		
		
		return asitenciaRepository.save(asistencia);
	}

	@Override
	public List<Asistencia> getAllAsistencias() {
		
		return asitenciaRepository.findAll();
	}

	@Override
	public List<Asistencia> getAsistenciasByCarne(String carne) {
		
		return asitenciaRepository.getAsistenciasByCarneOrderByFechaHoraDesc(carne);
	}

	@Override
	public List<Asistencia> validateAsistencia(String carne, String asignatura) {
		
		return asitenciaRepository.getAsisteciaByCarneAndAsignaturaAndFechaHora(carne, asignatura);
	}

}
