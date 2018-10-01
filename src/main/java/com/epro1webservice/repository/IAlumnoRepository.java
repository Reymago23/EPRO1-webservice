package com.epro1webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.epro1webservice.entity.Alumno;

public interface IAlumnoRepository extends JpaRepository<Alumno, Long> {

	public abstract Alumno getUserAlumnoByCarne(String carne);
	public abstract Alumno getAlumnoByCarneAndPassword(String carne, String password);

}
