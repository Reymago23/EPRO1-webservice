package com.epro1webservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epro1webservice.entity.AlumnoEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/alumno")
public class UserAlumnoController {

	/*@Autowired
	@Qualifier("userAlumnoServiceImpl")
	private IUserAlumnoService userAlumnoService;
	
	
	@GetMapping(value = "/{carne}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserAlumnoModel> getAlumnoByCarne(@PathVariable("carne") String carne) {
		
		UserAlumnoModel userAlumno = userAlumnoService.getUserAlumnoByCarne(carne);
		
		return new ResponseEntity<UserAlumnoModel>(userAlumno, HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/{carne}/{password}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserAlumnoModel> getAluByCarAndPw(@PathVariable("carne") String carne, @PathVariable("password") String password) {
		
		UserAlumnoModel userAlumno = userAlumnoService.getAluByCarAndPw(carne, password);
		
		return new ResponseEntity<UserAlumnoModel>(userAlumno, HttpStatus.OK);
		
	}*/
	
}
