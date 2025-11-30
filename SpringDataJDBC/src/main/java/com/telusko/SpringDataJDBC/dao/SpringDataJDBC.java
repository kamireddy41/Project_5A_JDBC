package com.telusko.SpringDataJDBC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

@Repository("repo")
public class SpringDataJDBC
{
	@Autowired
	private JdbcTemplate jdbc;
//	private static final String SQL_QUERY="INSERT INTO IMPLEMENTERS(id, name, city) VALUES(104, 'SACHIN', 'Mumbai')";

	
	private static final String SQL_QUERY="INSERT INTO IMPLEMENTERS(id, name, city) VALUES(?,?,?)";

//	public void input()
//	{
//		jdbc.update(SQL_QUERY);
//	}
	
	public void input(Implementer impl)
	{
//		Integer id = impl.getId();
//		String name=impl.getName();
		int row=jdbc.update(SQL_QUERY, impl.getId(), impl.getName(), impl.getCity());
		System.out.println("Rows affected "+ row);
	}
}
