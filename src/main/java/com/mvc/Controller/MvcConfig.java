package com.mvc.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * this file will replace the servlet file which is mapped via the web.xml
 * for our case its mvc-servlet.xml
 * */

@Configuration
@EnableWebMvc
@ComponentScan("com.mvc.Controller")
public class MvcConfig implements WebMvcConfigurer {
}
