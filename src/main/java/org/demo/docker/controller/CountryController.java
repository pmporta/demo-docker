package org.demo.docker.controller;

import org.demo.docker.model.Country;
import org.demo.docker.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;

	@PostMapping("/countries")
	public Country insert(@RequestBody Country country) {
		return countryRepository.save(country);
	}
}
