package com.epro1webservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epro1webservice.dao.IUserAlumnoDao;
import com.epro1webservice.model.UserAlumnoModel;
import com.epro1webservice.service.IUserAlumnoService;

@Service("userAlumnoServiceImpl")
public class UserAlumnoServiceImpl implements IUserAlumnoService {

	
	@Autowired
	private IUserAlumnoDao userAlumnoDao;
	
	
	
	@Override
	public UserAlumnoModel getUserAlumnoByCarne(String carne) {
		
		return userAlumnoDao.getUserAlumnoByCarne(carne);
	}

	@Override
	public int insertUserAlumno(UserAlumnoModel userAlumno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserAlumnoModel> getAllUsersAlumno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAlumnoModel> getAlumnosByAsignaturaId(int asignaturaId) {
		// TODO Auto-generated method stub
		return null;
	}

}
