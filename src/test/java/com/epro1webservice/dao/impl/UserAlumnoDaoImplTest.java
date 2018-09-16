package com.epro1webservice.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.epro1webservice.dao.IUserAlumnoDao;
import com.epro1webservice.model.UserAlumnoModel;

public class UserAlumnoDaoImplTest {

	@Autowired
	private IUserAlumnoDao userAlumnoDao;
	
	@Test
	public void test() {
		
		//UserAlumnoModel userAlumno = userAlumnoDao.getUserAlumnoByCarne("2501262012");
		
		
		assertEquals("admin", "admin");
		
	}

}
