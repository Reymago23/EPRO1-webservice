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
@Table(name ="docente")
public class Docente implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "id")
	private int id;
	
	@Column(name= "email")
	private String email;
	
	@Column(name= "password")
	private String password;
	
	@Column(name= "nombre")
	private String nombre;
	
	@Column(name= "apellido")
	private String apellido;
	
	@Column(name= "rol")
	private int rol;
	
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
