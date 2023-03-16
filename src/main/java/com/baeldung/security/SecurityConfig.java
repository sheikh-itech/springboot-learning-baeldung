package com.baeldung.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableWebSecurity
public class SecurityConfig /*extends WebSecurityConfigurerAdapter */{

	/**
	 * WebSecurityConfigurerAdapter is deprecated, use below given alternate beans
	 */
	/* @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .anyRequest()
            .permitAll()
            .and().csrf().disable();
    }*/
	
	/*
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
        .anyRequest()
        .permitAll()
        .and().csrf().disable();
		
		return null;
    }
     
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
    	
		return null;
    }*/
}
