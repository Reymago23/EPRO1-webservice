package com.epro1webservice.model;

import java.io.Serializable;
import java.time.ZonedDateTime;

public class InscripcionModel implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String alumnoCarne;
	private int idAsignatura;
	private String ciclo;
	private byte activa;
	private String creadoPor;
	private ZonedDateTime creadoFecha;
	private String actualizadoPor;
	private ZonedDateTime actualizadoFecha;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlumnoCarne() {
		return alumnoCarne;
	}
	public void setAlumnoCarne(String alumnoCarne) {
		this.alumnoCarne = alumnoCarne;
	}
	public int getIdAsignatura() {
		return idAsignatura;
	}
	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public byte getActiva() {
		return activa;
	}
	public void setActiva(byte activa) {
		this.activa = activa;
	}
	public String getCreadoPor() {
		return creadoPor;
	}
	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}
	public ZonedDateTime getCreadoFecha() {
		return creadoFecha;
	}
	public void setCreadoFecha(ZonedDateTime creadoFecha) {
		this.creadoFecha = creadoFecha;
	}
	public String getActualizadoPor() {
		return actualizadoPor;
	}
	public void setActualizadoPor(String actualizadoPor) {
		this.actualizadoPor = actualizadoPor;
	}
	public ZonedDateTime getActualizadoFecha() {
		return actualizadoFecha;
	}
	public void setActualizadoFecha(ZonedDateTime actualizadoFecha) {
		this.actualizadoFecha = actualizadoFecha;
	}
	
	
}
