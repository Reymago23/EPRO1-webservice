package com.epro1webservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import com.epro1webservice.service.IUserAlumnoService;

import com.epro1webservice.model.UserAlumnoModel;

@RestController
@RequestMapping("/alumno")
public class UserAlumnoController {

	@Autowired
	@Qualifier("userAlumnoServiceImpl")
	private IUserAlumnoService userAlumnoService;
	
	
	@GetMapping(value = "/{carne}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserAlumnoModel> getAlumnoByCarne(@PathVariable("carne") String carne) {
		
		UserAlumnoModel userAlumno = userAlumnoService.getUserAlumnoByCarne(carne);
		
		return new ResponseEntity<UserAlumnoModel>(userAlumno, HttpStatus.OK);
		
	}
	
}
