package com.epro1webservice.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epro1webservice.entity.Alumno;
import com.epro1webservice.entity.Asistencia;

public interface IAsistenciaRepository extends JpaRepository<Asistencia, Long> {


	public abstract List<Asistencia> getAsistenciasByCarne(String carne);
	
	
}
