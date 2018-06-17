package com.org.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@SpringBootApplication
@ComponentScan
@Configuration
@EnableAutoConfiguration
@MapperScan(value = {"com.org.app.mapper"})
public class VueTestV1Application {

	public static void main(String[] args) {
		SpringApplication.run(VueTestV1Application.class, args);
	}
	
    @Bean
    public InternalResourceViewResolver setupViewResolver() {
    	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".html");
        return resolver;
    }
}