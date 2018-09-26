package com.epro1webservice.repository;

import java.util.List;

import com.epro1webservice.entity.AsignaturaEntity;

public interface IAsignaturaRepository {

	public abstract int insertAsignatura(AsignaturaEntity asignatura);
	public abstract AsignaturaEntity getAsignaturaById(int id);
	public abstract List<AsignaturaEntity> getAllAsignaturas();
	public abstract List<AsignaturaEntity> getAsignaturaByDocenteId(int id);
}
