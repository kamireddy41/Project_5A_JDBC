package com.telusko.SpringDataJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.telusko.SpringDataJDBC.dao.Implementer;
import com.telusko.SpringDataJDBC.dao.SpringDataJDBC;

@Component
public class JDBCRunner implements CommandLineRunner
{
	@Autowired
	private SpringDataJDBC jdbc;

	@Override
	public void run(String... args) throws Exception 
	{
		jdbc.input(new Implementer(1,"Viart", "bengaluru"));
	}

}
