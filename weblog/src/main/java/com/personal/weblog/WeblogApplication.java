package com.personal.weblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;

@MapperScan(basePackages = {"com.personal.weblog.mapper"})
@SpringBootApplication
public class WeblogApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(WeblogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Connection connection = dataSource.getConnection();
		connection.close();
	}
}
