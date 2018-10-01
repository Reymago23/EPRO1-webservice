package com.epro1webservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epro1webservice.entity.Alumno;
import com.epro1webservice.service.IAlumnoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	@Qualifier("alumnoService")
	private IAlumnoService alumnoService;
	
	
	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Alumno> getAlumnoByCarne(@RequestParam("carne") String carne, @RequestParam("password") String password) {
		
		Alumno alumno = alumnoService.getAlumnoByCarneAndPassword(carne, password);
		
		return new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
		
	}
	
}
