package com.epro1webservice.repository;

import java.util.List;

import com.epro1webservice.entity.DocenteEntity;

public interface IDocenteRepository {

	
	public abstract int insertUserDocenteAdmin(DocenteEntity userDocenteAdmin);
	public abstract DocenteEntity getUserDocenteAdminById(int id);
	public abstract DocenteEntity getUserDocenteByEmailAndPassword(String email, String password);
	public abstract List<DocenteEntity> getAllUserDocenteAdmin();
	
}
