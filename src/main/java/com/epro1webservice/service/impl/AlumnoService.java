package com.epro1webservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epro1webservice.entity.Alumno;
import com.epro1webservice.repository.IAlumnoRepository;
import com.epro1webservice.service.IAlumnoService;

@Service("alumnoService")
public class AlumnoService implements IAlumnoService {

	
	@Autowired
	private IAlumnoRepository alumnoRepository;
	
	
	@Override
	public Alumno getAlumnoByCarneAndPassword(String carne, String password) {
		
		return alumnoRepository.getAlumnoByCarneAndPassword(carne, password);
	}

}
