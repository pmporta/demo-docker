package org.demo.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DemoDockerCotroller {
	
	@GetMapping
	@RequestMapping("/demo-docker")
	public String demoDocker() {
		
		return "*************";
	}
}
