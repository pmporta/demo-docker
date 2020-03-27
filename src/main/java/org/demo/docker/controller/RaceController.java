package org.demo.docker.controller;

import org.demo.docker.model.Race;
import org.demo.docker.repository.CountryRepository;
import org.demo.docker.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class RaceController {

	@Autowired
	private RaceRepository raceRepository;

	@Autowired
	private CountryRepository countryRepository;

	@PostMapping("/races")
	public Race insert(@RequestBody Race race) {

		if (!countryRepository.existsById(race.getCountryId())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		return raceRepository.save(race);

	}

}
