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
@Table(name ="asignatura")
public class Asignatura implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "id")
	int id;
	
	@Column(name= "facultad")
	private String facultad;
	
	@Column(name= "escuela")
	private String escuela;
	
	@Column(name= "codigo")
	private String codigo;
	
	@Column(name= "nombre")
	private String nombre;
	
	@Column(name= "docente")
	private String docente;
	
	@Column(name= "seccion")
	private String seccion;
	
	@Column(name= "dias")
	private String dias;
	
	@Column(name= "hora")
	private String hora;
	
	@Column(name= "inscritos")
	private int inscritos;
	
	@Column(name= "aula")
	private String aula;
	
	@Column(name= "creado_por")
	private String creadoPor;
	
	@Column(name= "creado_fecha")
	private Timestamp creadoFecha;
	
	@Column(name= "actualizado_por")
	private String actualizadoPor;
	
	@Column(name= "actualizado_fecha")
	private Timestamp actualizadoFecha;
	
	
	
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public int getInscritos() {
		return inscritos;
	}
	public void setInscritos(int inscritos) {
		this.inscritos = inscritos;
	}
	public Timestamp getCreadoFecha() {
		return creadoFecha;
	}
	public void setCreadoFecha(Timestamp creadoFecha) {
		this.creadoFecha = creadoFecha;
	}
	public Timestamp getActualizadoFecha() {
		return actualizadoFecha;
	}
	public void setActualizadoFecha(Timestamp actualizadoFecha) {
		this.actualizadoFecha = actualizadoFecha;
	}
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

	public String getActualizadoPor() {
		return actualizadoPor;
	}
	public void setActualizadoPor(String actualizadoPor) {
		this.actualizadoPor = actualizadoPor;
	}
	
}
