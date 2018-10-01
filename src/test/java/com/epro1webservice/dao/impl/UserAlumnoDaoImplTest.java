package com.epro1webservice.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.epro1webservice.entity.Alumno;
import com.epro1webservice.repository.IAlumnoRepository;

public class UserAlumnoDaoImplTest {

	@Autowired
	private IAlumnoRepository userAlumnoDao;
	
	@Test
	public void test() {
		
		//UserAlumnoModel userAlumno = userAlumnoDao.getUserAlumnoByCarne("2501262012");
		
		
		assertEquals("admin", "admin");
		
	}

}
