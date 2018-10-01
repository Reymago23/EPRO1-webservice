package com.epro1webservice.repository;

import java.util.List;

import com.epro1webservice.entity.Alumno;

public interface IAlumnoRepository {

	public abstract Alumno getUserAlumnoByCarne(String carne);
	public abstract Alumno getAluByCarAndPw(String carne, String password);
	public abstract int insertUserAlumno(Alumno userAlumno);
	public abstract List<Alumno> getAllUsersAlumno();
	public abstract List<Alumno> getAlumnosByAsignaturaId(int asignaturaId);
}
