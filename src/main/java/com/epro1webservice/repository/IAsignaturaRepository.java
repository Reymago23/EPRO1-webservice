package com.epro1webservice.repository;

import java.util.List;

import com.epro1webservice.entity.Asignatura;

public interface IAsignaturaRepository {

	public abstract int insertAsignatura(Asignatura asignatura);
	public abstract Asignatura getAsignaturaById(int id);
	public abstract List<Asignatura> getAllAsignaturas();
	public abstract List<Asignatura> getAsignaturaByDocenteId(int id);
}
