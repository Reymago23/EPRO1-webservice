package com.epro1webservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epro1webservice.entity.Asistencia;
import com.epro1webservice.service.IAsistenciaService;

@RestController
@RequestMapping("/asistencia")
public class AsistenciaController {

	
	@Autowired
	private IAsistenciaService asistenciaService;
	
	@PostMapping(produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Asistencia> addAsistencia(@RequestBody Asistencia asistenciaEntity) {
		
        
		Asistencia asistencia = asistenciaService.addAsistencia(asistenciaEntity);
                
        if (asistencia == null) {
                	
              return new ResponseEntity<Asistencia>(asistencia, HttpStatus.CONFLICT);
          }
        
       return new ResponseEntity<Asistencia>(asistencia, HttpStatus.CREATED);
	}
	
	
	
	
	
	@GetMapping(produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Asistencia>> getAsistencias() {
		
        
		List<Asistencia> asistencias = asistenciaService.getAllAsistencias();
                
        if (!asistencias.isEmpty()) {
                	
              return new ResponseEntity<List<Asistencia>>(asistencias, HttpStatus.OK);
          }
        
       return new ResponseEntity<List<Asistencia>>(asistencias, HttpStatus.CONFLICT);
	}
	
	
	
	@GetMapping(value = "/{carne}", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Asistencia>> getAsistenciaByCarne(@PathVariable("carne") String carne) {
		
        
		List<Asistencia> asistencias = asistenciaService.getAsistenciasByCarne(carne);
                
        if (!asistencias.isEmpty()) {
                	
              return new ResponseEntity<List<Asistencia>>(asistencias, HttpStatus.OK);
          }
        
       return new ResponseEntity<List<Asistencia>>(asistencias, HttpStatus.CONFLICT);
	}
	
}
