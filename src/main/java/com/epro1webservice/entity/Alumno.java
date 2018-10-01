package com.epro1webservice.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="alumno")
public class Alumno implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "id")
	private long id;
	
	@Column(name="carne")
	private String carne;
	
	@Column(name="password")
	private String password;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="creado_por")
	private String creadoPor;
	
	@Column(name="creado_fecha")
	private Timestamp creadoFecha;
	
	@Column(name="actualizado_por")
	private String actualizadoPor;
	
	@Column(name="actualizado_fecha")
	private Timestamp actualizadoFecha;
	
	
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
