package com.baeldung.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:java.properties")

//After java_8 we can define multiple location
//@PropertySources({@PropertySource("classpath:java.properties"), @PropertySource("classpath:java.properties")})
//@PropertySource("classpath:java.properties")
//@PropertySource({"classpath:persistence-${envTarget:mysql}.properties"})
public class JavaConfigProperties {

	@Value("${java.jdbc.driver}")
	private String jdbcDriver;
	
	@Value("${java.jdbc.client}")
	private String jdbcClient;
	
	@Value("${java.jdbc.user}")
	private String jdbcUse;
	
	@Value("${java.jdbc.password}")
	private String jdbcPassword;

	public String getJdbcDriver() {
		return jdbcDriver;
	}

	public String getJdbcClient() {
		return jdbcClient;
	}

	public String getJdbcUse() {
		return jdbcUse;
	}

	public String getJdbcPassword() {
		return jdbcPassword;
	}
}
