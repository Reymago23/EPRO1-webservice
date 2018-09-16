package com.epro1webservice.model;

import java.time.ZonedDateTime;

public class UserAlumnoModel {

	
	private String carne;
	private String password;
	private String nombre;
	private String apellido;
	private String creadoPor;
	private ZonedDateTime creadoFecha;
	private String actualizadoPor;
	private ZonedDateTime actualizadoFecha;
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
