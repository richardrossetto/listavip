package br.com.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class ListavipApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListavipApplication.class, args);
	}
}
