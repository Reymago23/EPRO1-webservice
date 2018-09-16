package com.epro1webservice.model;

import java.time.ZonedDateTime;

public class AsignaturaModel {

	int id;
	private String facultad;
	private String escuela;
	private String codigo;
	private String nombre;
	private int idDocente;
	private String seccion;
	private String dias;
	private String hora;
	private int alumnoInscritos;
	private String aula;
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
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getEscuela() {
		return escuela;
	}
	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdDocente() {
		return idDocente;
	}
	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getDias() {
		return dias;
	}
	public void setDias(String dias) {
		this.dias = dias;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getAlumnoInscritos() {
		return alumnoInscritos;
	}
	public void setAlumnoInscritos(int alumnoInscritos) {
		this.alumnoInscritos = alumnoInscritos;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
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
