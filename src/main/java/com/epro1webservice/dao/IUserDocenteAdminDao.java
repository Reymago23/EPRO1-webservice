package com.epro1webservice.dao;

import java.util.List;

import com.epro1webservice.model.UserDocenteAdminModel;

public interface IUserDocenteAdminDao {

	
	public abstract int insertUserDocenteAdmin(UserDocenteAdminModel userDocenteAdmin);
	public abstract UserDocenteAdminModel getUserDocenteAdminById(int id);
	public abstract List<UserDocenteAdminModel> getAllUserDocenteAdmin();
	
}
