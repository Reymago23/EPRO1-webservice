package com.epro1webservice.service;

import java.util.List;

import com.epro1webservice.entity.AsistenciaEntity;

public interface IAsistenciaService {

	
	public abstract boolean addAsistencia(AsistenciaEntity asistencia);
	public abstract List<AsistenciaEntity> getAllAsistencias();
	public abstract List<AsistenciaEntity> getAsistenciasByCarne(String carne);
}
