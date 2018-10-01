package com.epro1webservice.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="inscripcion")
public class Inscripcion implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "id")
	private int id;
	
	@Column(name= "alumno_carne")
	private String alumnoCarne;
	
	@Column(name= "id_asignatura")
	private int idAsignatura;
	
	@Column(name= "ciclo")
	private String ciclo;
	
	@Column(name= "activa")
	private byte activa;
	
	
	@Column(name="creado_por")
	private String creadoPor;
	
	@Column(name="creado_fecha")
	private Timestamp creadoFecha;
	
	@Column(name="actualizado_por")
	private String actualizadoPor;
	
	@Column(name="actualizado_fecha")
	private Timestamp actualizadoFecha;
	
	
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
