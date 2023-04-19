package com.SpringJdbc.jdbcDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

}
// create table car(id bigint primary key auto_increment, name varchar(100), brand_id bigint, foreign key(brand_id) references(brand_id))