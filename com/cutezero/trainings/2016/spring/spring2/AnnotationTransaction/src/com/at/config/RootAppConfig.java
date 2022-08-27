package com.at.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.at.dao", "com.at.service", "com.at.controller", "com.at.helper"})
@Import(value=PersistanceAppConfig.class)
public class RootAppConfig {

		
}
