package com.epro1webservice.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="asistencia")
public class Asistencia implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
	
	public Asistencia() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "id")
	private long id;
	
	@Column(name="carne")
	private String carne;
	
	@Column(name="asignatura")
	private String asignatura;
	
	@Column(name="seccion")
	private String seccion;
	
	@Column(name="aula")
	private String aula;
	
	@Column(name="ciclo")
	private String ciclo;
	
	@Column(name="fecha_hora")
	private Timestamp fechaHora;
	
	

	
	public Asistencia(String carne, String asignatura, String seccion, String aula, Timestamp fechaHora, String ciclo) {
		super();
		this.carne = carne;
		this.asignatura = asignatura;
		this.seccion = seccion;
		this.aula = aula;
		this.ciclo = ciclo;
		this.fechaHora = fechaHora;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public Timestamp getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Timestamp fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	
	
}
