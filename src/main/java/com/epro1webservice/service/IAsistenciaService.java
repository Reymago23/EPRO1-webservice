package com.epro1webservice.service;

import java.util.List;

import com.epro1webservice.entity.Asistencia;

public interface IAsistenciaService {

	
	public abstract Asistencia addAsistencia(Asistencia asistencia);
	public abstract List<Asistencia> getAllAsistencias();
	public abstract List<Asistencia> getAsistenciasByCarne(String carne);
}
