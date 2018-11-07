package com.epro1webservice.repository;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epro1webservice.entity.Asistencia;

public interface IAsistenciaRepository extends JpaRepository<Asistencia, Long> {


	public abstract List<Asistencia> getAsistenciasByCarneOrderByFechaHoraDesc(String carne);
	
	@Query("SELECT a FROM Asistencia a WHERE a.carne = :carne "
			+ "AND a.asignatura = :asignatura AND DATE(a.fechaHora) = DATE(NOW())")
	public abstract List<Asistencia> getAsisteciaByCarneAndAsignaturaAndFechaHora(@Param("carne") String carne,
											@Param("asignatura") String asignatura);
	
	
}
