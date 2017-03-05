package com.boot.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*
 * The web application is based on Spring MVC.
 *  Thus you need to configure Spring MVC and set up view controllers to expose these templates. 
 *  Here’s a configuration class for configuring Spring MVC in the application.
 * *?
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/hello").setViewName("hello");

	}

}