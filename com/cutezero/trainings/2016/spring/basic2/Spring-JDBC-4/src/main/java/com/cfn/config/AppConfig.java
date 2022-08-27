package com.cfn.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages={"com.cfn"})
public class AppConfig {
	@Bean
	public NamedParameterJdbcTemplate npjt(){
		return new NamedParameterJdbcTemplate(ds());
	}
	@Bean
	public DataSource ds(){
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("scott");
		ds.setPassword("tiger");
		return ds;
	}
	
}
