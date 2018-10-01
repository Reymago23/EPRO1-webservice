package com.epro1webservice.repository;

import java.util.List;

import com.epro1webservice.entity.Inscripcion;

public interface IInscripcionRepository {

	public abstract int insertInscripcion(Inscripcion inscripcion);
	public abstract Inscripcion getInscripcionById();
	public abstract List<Inscripcion> getInscripcionesByAlumnoCarne(String carne);
	
}
