package com.epro1webservice.dao;

import java.util.List;

import com.epro1webservice.model.InscripcionModel;

public interface IInscripcionDao {

	public abstract int insertInscripcion(InscripcionModel inscripcion);
	public abstract InscripcionModel getInscripcionById();
	public abstract List<InscripcionModel> getInscripcionesByAlumnoCarne(String carne);
	
}
