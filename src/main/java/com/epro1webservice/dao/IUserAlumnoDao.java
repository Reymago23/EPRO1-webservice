package com.epro1webservice.dao;

import java.util.List;

import com.epro1webservice.model.UserAlumnoModel;

public interface IUserAlumnoDao {

	public abstract UserAlumnoModel getUserAlumnoByCarne(String carne);
	public abstract int insertUserAlumno(UserAlumnoModel userAlumno);
	public abstract List<UserAlumnoModel> getAllUsersAlumno();
	public abstract List<UserAlumnoModel> getAlumnosByAsignaturaId(int asignaturaId);
}
