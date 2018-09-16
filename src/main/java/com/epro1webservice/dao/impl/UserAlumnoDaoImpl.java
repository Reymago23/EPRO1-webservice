package com.epro1webservice.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.epro1webservice.dao.IUserAlumnoDao;
import com.epro1webservice.model.UserAlumnoModel;
import com.epro1webservice.util.DBUtil;


@Repository
public class UserAlumnoDaoImpl implements IUserAlumnoDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	

	@Override
	public UserAlumnoModel getUserAlumnoByCarne(String carne) {
		
		StringBuilder sb = new StringBuilder();

		sb.append("SELECT * FROM ");
		sb.append(DBUtil.USER_ALUMNO_TABLE);
		sb.append(" WHERE carne = :carne");
		
		String sql = sb.toString();
		
		SqlParameterSource source = new MapSqlParameterSource("carne", carne);
		
		UserAlumnoModel userAlumnoModel = namedParameterJdbcTemplate.queryForObject(sql, source, new UserAlumnoRowMapper());
		
		return userAlumnoModel;
	}

	@Override
	public int insertUserAlumno(UserAlumnoModel userAlumno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserAlumnoModel> getAllUsersAlumno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAlumnoModel> getAlumnosByAsignaturaId(int asignaturaId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
