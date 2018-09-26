package com.epro1webservice.repository;

import java.util.List;

import com.epro1webservice.entity.AlumnoEntity;

public interface IAlumnoRepository {

	public abstract AlumnoEntity getUserAlumnoByCarne(String carne);
	public abstract AlumnoEntity getAluByCarAndPw(String carne, String password);
	public abstract int insertUserAlumno(AlumnoEntity userAlumno);
	public abstract List<AlumnoEntity> getAllUsersAlumno();
	public abstract List<AlumnoEntity> getAlumnosByAsignaturaId(int asignaturaId);
}
