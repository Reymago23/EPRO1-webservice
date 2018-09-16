package com.epro1webservice.dao;

import java.util.List;

import com.epro1webservice.model.AsistenciaModel;

public interface IAsistenciaDao {

	public abstract int insertAsistencia(AsistenciaModel asistencia);
	public abstract List<AsistenciaModel> getAsistenciaByAlumnoCarne(String carne);
	public abstract List<AsistenciaModel> getAllAsistencias();
}
