package com.epro1webservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epro1webservice.entity.AsistenciaEntity;
import com.epro1webservice.service.IAsistenciaService;

@RestController
@RequestMapping("/asistencia")
public class AsistenciaController {

	
	@Autowired
	private IAsistenciaService asistenciaService;
	
	@PostMapping(produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Boolean> addAsistencia(@RequestBody AsistenciaEntity asistenciaEntity) {
		
        
		boolean flag = asistenciaService.addAsistencia(asistenciaEntity);
                
        if (flag == false) {
                	
              return new ResponseEntity<Boolean>(flag, HttpStatus.CONFLICT);
          }
        
       return new ResponseEntity<Boolean>(flag, HttpStatus.CREATED);
	}
	
	
	@GetMapping(produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<AsistenciaEntity>> getAsistencias() {
		
        
		List<AsistenciaEntity> asistencias = asistenciaService.getAllAsistencias();
                
        if (!asistencias.isEmpty()) {
                	
              return new ResponseEntity<List<AsistenciaEntity>>(asistencias, HttpStatus.OK);
          }
        
       return new ResponseEntity<List<AsistenciaEntity>>(asistencias, HttpStatus.CONFLICT);
	}
	
}
