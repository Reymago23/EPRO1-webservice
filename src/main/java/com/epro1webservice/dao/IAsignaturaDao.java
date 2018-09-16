package com.epro1webservice.dao;

import java.util.List;

import com.epro1webservice.model.AsignaturaModel;

public interface IAsignaturaDao {

	public abstract int insertAsignatura(AsignaturaModel asignatura);
	public abstract AsignaturaModel getAsignaturaById(int id);
	public abstract List<AsignaturaModel> getAllAsignaturas();
	public abstract List<AsignaturaModel> getAsignaturaByDocenteId(int id);
}
