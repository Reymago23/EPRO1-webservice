package com.epro1webservice.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.ZonedDateTime;

public class UserAlumnoModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String carne;
	private String password;
	private String nombre;
	private String apellido;
	private String creadoPor;
	private Timestamp creadoFecha;
	private String actualizadoPor;
	private Timestamp actualizadoFecha;
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCreadoPor() {
		return creadoPor;
	}
	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}
	public Timestamp getCreadoFecha() {
		return creadoFecha;
	}
	public void setCreadoFecha(Timestamp creadoFecha) {
		this.creadoFecha = creadoFecha;
	}
	public String getActualizadoPor() {
		return actualizadoPor;
	}
	public void setActualizadoPor(String actualizadoPor) {
		this.actualizadoPor = actualizadoPor;
	}
	public Timestamp getActualizadoFecha() {
		return actualizadoFecha;
	}
	public void setActualizadoFecha(Timestamp actualizadoFecha) {
		this.actualizadoFecha = actualizadoFecha;
	}
	
	
}
