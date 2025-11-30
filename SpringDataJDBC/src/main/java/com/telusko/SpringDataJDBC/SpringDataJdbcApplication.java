package com.telusko.SpringDataJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJDBC.dao.Implementer;
import com.telusko.SpringDataJDBC.dao.SpringDataJDBC;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJdbcApplication.class, args);
		SpringApplication.run(SpringDataJdbcApplication.class, args);

		//		SpringDataJDBC jdbc = container.getBean(SpringDataJDBC.class);
//		
//	//	jdbc.input();
//		jdbc.input(new Implementer(1,"Viart", "bengaluru"));
	}

}
