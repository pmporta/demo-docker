package org.demo.docker.controller;

import java.util.Optional;

import org.demo.docker.model.Athlete;
import org.demo.docker.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AthleteController {

	@Autowired
	private AthleteRepository athleteRepository;

	@PostMapping("/athletes")
	public Athlete insert(@RequestBody Athlete athlete) {
		return athleteRepository.save(athlete);
	}

	@GetMapping("/athletes/{id}")
	public Athlete insert(@PathVariable Long id) {
		Optional<Athlete> athleteOpt = athleteRepository.findById(id);
		return athleteOpt.get();
	}
}
