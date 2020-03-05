package org.demo.docker.controller;

import org.demo.docker.model.Country;
import org.demo.docker.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/countries")
public class CountryController {

	@Autowired
	CountryRepository countryRepository;

	@PostMapping
	public Country insert(@RequestBody Country country) {
		return countryRepository.save(country);
	}
}
