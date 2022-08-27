package com.app.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.bo.Customer;

@SpringBootApplication
public class SpringBootApp {

	private static final Logger log= LoggerFactory.getLogger(SpringBootApp.class);
	public static void main(String[] args){
		SpringApplication.run(SpringBootApp.class, args);
	}
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String SQL_DROP_CUSTOMERS="drop table CUSTOMERS if exists";
	private final String SQL_CREATE_CUSTOMERS="create table CUSTOMERS (ID integer, FIRST_NAME varchar(35), LAST_NAME varchar(35))";
	private final String SQL_INSERT_TO_CUSTOMERS="insert into customers(FIRST_NAME, LAST_NAME) values(?, ?)";
	private final String SQL_SELECT_FROM_CUSTOMERS="select ID, FIRST_NAME, LAST_NAME from CUSTOMERS where FIRST_NAME=?";
	
	public void run(String... strings){
		log.info("Creating table 'CUSTOMERS' [drop if exist previous]");
		
		jdbcTemplate.execute(SQL_DROP_CUSTOMERS);
		jdbcTemplate.execute(SQL_CREATE_CUSTOMERS);
		
		List<String> names= Arrays.asList("Sri Pani", "Bisu Pra", "Abu anu", "madhu joshi");
		
		// Split up the array of whole names into an array of first/last names
		List<Object[]> splitedNames= names.stream()
				.map(name-> name.split(" "))
				.collect(Collectors.toList());
		
		// Use a Java 8 stream to print out each tuple of the list
		splitedNames.forEach(name -> log.info(String.format("Inserting Customer record for %s %s" , name[0], name[1])));
		
		// Uses JdbcTemplate's batchUpdate operation to bulk load data
		jdbcTemplate.batchUpdate(SQL_INSERT_TO_CUSTOMERS, splitedNames);
		
		log.info("Querying for a Customer record where name='bisu' : ");
		
		/**
		 * provide mapRow(rs, rowNum) from RowMapper
		 * It can return List<Customer>, so you can log each customer as -(line no 6)
		 */
		
		jdbcTemplate.query(SQL_SELECT_FROM_CUSTOMERS, new Object[]{"bisu"},
				(rs, rowNum)-> new Customer(rs.getLong("ID"), rs.getString("FIRST_NAME"), rs.getString("LAST_NAME"))
				).forEach(customer -> log.info(customer.toString()));
		System.out.println("Completed");
	}
}
