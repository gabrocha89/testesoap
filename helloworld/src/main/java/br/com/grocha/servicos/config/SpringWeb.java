package br.com.grocha.servicos.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@ImportResource({"classpath:spring/cxf.xml"})
@ComponentScan(basePackages={"br.com.grocha*"})

public class SpringWeb {
	
} 