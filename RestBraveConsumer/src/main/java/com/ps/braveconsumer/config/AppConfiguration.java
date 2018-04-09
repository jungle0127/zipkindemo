package com.ps.braveconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
/** The application is simple, it only uses Web MVC and a {@linkplain RestTemplate}. */
@Configuration
public class AppConfiguration {
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
