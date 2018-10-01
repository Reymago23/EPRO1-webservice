package com.epro1webservice.repository;

import java.util.List;

import com.epro1webservice.entity.Docente;

public interface IDocenteRepository {

	
	public abstract int insertUserDocenteAdmin(Docente userDocenteAdmin);
	public abstract Docente getUserDocenteAdminById(int id);
	public abstract Docente getUserDocenteByEmailAndPassword(String email, String password);
	public abstract List<Docente> getAllUserDocenteAdmin();
	
}
