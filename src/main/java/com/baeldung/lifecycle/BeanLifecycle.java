package com.baeldung.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *	Spring’s InitializingBean interface to run custom operations in afterPropertiesSet() phase
 *
 *	Similarly, implement DisposableBean to call the destroy() method in the destroy phase
 */

@Component
@PropertySource("classpath:java.properties")
public class BeanLifecycle implements InitializingBean, DisposableBean {

	@Value("${java.jdbc.driver}")
	private String jdbcDriver;
	@Value("${java.jdbc.client}")
	private String jdbcClient;
	@Value("${java.jdbc.user}")
	private String jdbcUse;
	@Value("${java.jdbc.password}")
	private String jdbcPassword;
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("BeanLifecycle::afterPropertiesSet() method");
	}

	public void destroy() throws Exception {
		jdbcDriver = null;
		jdbcClient = null;
		jdbcUse = null;
		jdbcPassword = null;
		System.out.println("BeanLifecycle::destroy() method");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("BeanLifecycle::postConstruct() method");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("BeanLifecycle::preDestroy() method");
	}
	
	public void close() {
		System.out.println("BeanLifecycle::close() method");
	}
}
