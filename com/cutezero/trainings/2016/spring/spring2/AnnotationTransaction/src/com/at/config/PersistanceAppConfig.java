package com.at.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySources({@PropertySource("classpath:/com/at/properties/db.properties"), @PropertySource("classpath:/com/at/properties/db_mysql.properties")})
public class PersistanceAppConfig {

	@Autowired
	Environment env;
	
	@Bean(name="dataSource", autowire=Autowire.BY_TYPE)
	public DataSource dataSource(){
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		
		dataSource.setDriverClassName(env.getProperty("db.driverClassName"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.username"));
		dataSource.setPassword(env.getProperty("db.password"));
		return dataSource;
	}
	
	@Bean(name="npJdbcTemplate", autowire=Autowire.BY_TYPE)
	public NamedParameterJdbcTemplate jdbcTemplate(){
		return new NamedParameterJdbcTemplate(dataSource());
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public PlatformTransactionManager platformTransactionManager(){
//		return new DataSourceTransactionManager(dataSource());
		return new DataSourceTransactionManager(dataSource());
	}
	
	
	
	
/*	
	@Bean
	public DataSourceConnectionHelper dataSourceConnectionHelper(){
		DataSourceConnectionHelper connectionHelper= null;
		String 
		
		connectionHelper=new DataSourceConnectionHelper();
		
		return connectionHelper;
	}
*/
}
