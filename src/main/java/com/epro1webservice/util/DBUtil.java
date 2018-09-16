package com.epro1webservice.util;


/**
 * this class contains 
 * 	the DB table names and fields
 * 
 * @author miguel
 *
 */
public class DBUtil {

	
	/**
	 * General constants
	 */
	public static final String CREADO_POR = "creado_por";
	public static final String CREADO_FECHA = "creado_fecha";
	public static final String ACTUALIZADO_POR = "actualizado_por";
	public static final String ACTUALIZADO_FECHA = "actualizado_fecha";
	
	
	
	/**
	 * Asignatura constants
	 */
	public static final String ASIGNATURA_TABLE = "asignatura_tbl";
	public static final String ASIGNATURA_ID = "id";
	public static final String ASIGNATURA_FACULTAD = "facultad";
	public static final String ASIGNATURA_ESCUELA = "escuela";
	public static final String ASIGNATURA_CODIGO = "codigo";
	public static final String ASIGNATURA_NOMBRE = "nombre";
	public static final String ASIGNATURA_ID_DOCENTE = "id_docente";
	public static final String ASIGNATURA_SECCION = "seccion";
	public static final String ASIGNATURA_DIAS = "dias";
	public static final String ASIGNATURA_HORA = "hora";
	public static final String ASIGNATURA_ALUMNOS_INSCRITOS = "alumnos_inscritos";
	public static final String ASIGNATURA_AULA = "aula";


	
	
	/**
	 * Asistencia Constants
	 */
	static final String ASISTENCIA_TABLE = "asistencia_tbl";
	static final String ASISTENCIA_ID = "id";
	static final String ASISTENCIA_ALUMNO_CARNE = "alumno_carne";
	static final String ASISTENCIA_ASIGNATURA_ID = "asignatura_id";
	static final String ASISTENCIA_FECHA_HORA_ASISTENCIA = "fecha_hora_asistencia";
	
	
	
	/**
	 * Inscripcion Constants
	 */
	public static final String INSCRIPCION_TABLE = "inscripcion_tbl";
	public static final String INSCRIPCION_ID = "id";
	public static final String INSCRIPCION_ALUMNO_CARNE = "alumno_carne";
	public static final String INSCRIPCION_ID_ASIGNATURA = "id_asignatura";
	public static final String INSCRIPCION_CICLO = "ciclo";
	public static final String INSCRIPCION_ACTIVA = "activa";
	
	
	
	/**
	 * Alumno Constants
	 */
	public static final String USER_ALUMNO_TABLE = "user_alumno_tbl";
	public static final String USER_ALUMNO_CARNE = "carne";
	public static final String USER_ALUMNO_PASSWORD = "password";
	public static final String USER_ALUMNO_NOMBRE = "nombre";
	public static final String USER_ALUMNO_APELLIDO = "apellido";
	
	
	
	/**
	 * Docente Admin Constants
	 */
	public static final String USER_DOCENTE_ADMIN_TABLE = "user_docente_admin_tbl";
	public static final String USER_DOCENTE_ADMIN_ID = "id";
	public static final String USER_DOCENTE_ADMIN_EMAIL = "email";
	public static final String USER_DOCENTE_ADMIN_PASSWORD = "password";
	public static final String USER_DOCENTE_ADMIN_NOMBRE = "nombre";
	public static final String USER_DOCENTE_ADMIN_APELLIDO = "apellido";
	public static final String USER_DOCENTE_ADMIN_ROL = "rol";
	

}
