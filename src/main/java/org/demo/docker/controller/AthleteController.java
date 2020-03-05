package org.demo.docker.controller;

import org.demo.docker.model.Athlete;
import org.demo.docker.repository.AthleteRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/athletes")
public class AthleteController {

	private AthleteRepository athleteRepository;
	public Athlete insert(@RequestBody Athlete athlete) {
		
		return athleteRepository.save(athlete);
	}
}
