package com.epro1webservice.model;

import java.time.ZonedDateTime;

public class AsistenciaModel {
	
	private int id;
	private String carne;
	private int asignaturaId;
	private ZonedDateTime fechaHoraAsistencia;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public int getAsignaturaId() {
		return asignaturaId;
	}
	public void setAsignaturaId(int asignaturaId) {
		this.asignaturaId = asignaturaId;
	}
	public ZonedDateTime getFechaHoraAsistencia() {
		return fechaHoraAsistencia;
	}
	public void setFechaHoraAsistencia(ZonedDateTime fechaHoraAsistencia) {
		this.fechaHoraAsistencia = fechaHoraAsistencia;
	}

}
