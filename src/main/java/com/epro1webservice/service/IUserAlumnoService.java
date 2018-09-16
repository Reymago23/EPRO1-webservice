package com.epro1webservice.service;

import java.util.List;

import com.epro1webservice.model.UserAlumnoModel;

public interface IUserAlumnoService {

	public abstract UserAlumnoModel getUserAlumnoByCarne(String carne);
	public abstract int insertUserAlumno(UserAlumnoModel userAlumno);
	public abstract List<UserAlumnoModel> getAllUsersAlumno();
	public abstract List<UserAlumnoModel> getAlumnosByAsignaturaId(int asignaturaId);
}
