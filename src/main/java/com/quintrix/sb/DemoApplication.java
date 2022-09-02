package com.quintrix.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.*;


@ComponentScan("com.quintrix.sb.service.employeeService")
@SpringBootApplication
public class DemoApplication {


	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(DemoApplication.class, args);

	}

}
