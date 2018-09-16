package com.epro1webservice.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZonedDateTime;

import org.springframework.jdbc.core.RowMapper;

import com.epro1webservice.model.UserAlumnoModel;

public class UserAlumnoRowMapper implements RowMapper<UserAlumnoModel> {

	@Override
	public UserAlumnoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserAlumnoModel userAlumno = new UserAlumnoModel();
				
		userAlumno.setCarne(rs.getString("carne"));
		userAlumno.setPassword(rs.getString("password"));
		userAlumno.setNombre(rs.getString("nombre"));
		userAlumno.setApellido(rs.getString("apellido"));
		userAlumno.setCreadoPor(rs.getString("creado_por"));
		userAlumno.setCreadoFecha(rs.getTimestamp("creado_fecha"));
		userAlumno.setActualizadoPor(rs.getString("actualizado_por"));
		userAlumno.setActualizadoFecha(rs.getTimestamp("actualizado_fecha"));
		
		return userAlumno;
	}

}
