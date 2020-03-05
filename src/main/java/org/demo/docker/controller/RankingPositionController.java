package org.demo.docker.controller;

import org.demo.docker.model.RankingPosition;
import org.demo.docker.repository.AthleteRepository;
import org.demo.docker.repository.RaceRepository;
import org.demo.docker.repository.RankingPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController("/ranking-positions")
public class RankingPositionController {

	@Autowired
	private RankingPositionRepository rankingPositionRepository;

	@Autowired
	private RaceRepository raceRepository;

	@Autowired
	private AthleteRepository athleteRepository;

	public RankingPosition insert(@RequestBody RankingPosition rankingPosition) {

		if (!raceRepository.existsById(rankingPosition.getRaceId())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		if (!athleteRepository.existsById(rankingPosition.getAthleteId())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		return rankingPositionRepository.save(rankingPosition);
	}
}
