package com.epro1webservice.repository;

import java.util.List;

import com.epro1webservice.entity.InscripcionEntity;

public interface IInscripcionRepository {

	public abstract int insertInscripcion(InscripcionEntity inscripcion);
	public abstract InscripcionEntity getInscripcionById();
	public abstract List<InscripcionEntity> getInscripcionesByAlumnoCarne(String carne);
	
}
