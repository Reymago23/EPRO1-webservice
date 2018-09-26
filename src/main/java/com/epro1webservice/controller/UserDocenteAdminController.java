package com.epro1webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epro1webservice.entity.DocenteEntity;

@RestController
@RequestMapping("/docente")
public class UserDocenteAdminController {

	
	//@Autowired
	//private IUserDocenteAdminService userDocenteAdminService;
	
	
	/*http://localhost:8080/docente/login?email=admin@mail.utec.edu.sv&password=admin
	@GetMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDocenteAdminModel> getUserByEmailAndPw(
			@RequestParam(name = "email", required = true) String email, 
			@RequestParam(name = "password", required = true) String password )
	{
		
		UserDocenteAdminModel userDocenteAdmin = userDocenteAdminService
													.getUserDocenteAdminByEmailAndPassword(email, password);
		
		return new ResponseEntity<UserDocenteAdminModel>(userDocenteAdmin, HttpStatus.OK);
	}*/
	
}
