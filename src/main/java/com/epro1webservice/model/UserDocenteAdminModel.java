package com.epro1webservice.model;

import java.time.ZonedDateTime;

public class UserDocenteAdminModel {

	private int id;
	private String email;
	private String password;
	private String nombre;
	private String apellido;
	private int rol;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
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
