package com.ps.braveconsumer.constroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/call")
	public String callBackend() {
		return this.restTemplate.getForObject("http://localhost:8081/service1/api/date", String.class);
	}
}
