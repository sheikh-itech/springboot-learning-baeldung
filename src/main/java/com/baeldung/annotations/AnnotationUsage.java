package com.baeldung.annotations;

import javax.activation.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 *	@EnableAutoConfiguration, enables auto-configuration
 *	It means that Spring Boot looks for auto-configuration beans
 *	On class-path and automatically applies them
 */
@Configuration
@EnableAutoConfiguration
@ConditionalOnClass(DataSource.class)//Only configures if DataSource available in class=path
public class AnnotationUsage {

	public void test() {
		
	}
	
	//Initialize bean only if this has value 'local'
	@Bean
	@ConditionalOnProperty(name = "usemysql", havingValue = "local")
	@ConditionalOnExpression("${usemysql} && ${mysqlserver == 'local'}")
	DataSource dataSource() {
	   return null;
	}
	
	//@Conditional(DataSource.class)
	void additionalProperties() {

	}
}
