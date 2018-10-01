package com.epro1webservice.service;

import com.epro1webservice.entity.Alumno;

public interface IAlumnoService {

	
	public abstract Alumno getAlumnoByCarneAndPassword(String carne, String password);
}
