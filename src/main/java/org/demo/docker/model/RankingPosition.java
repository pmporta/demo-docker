package org.demo.docker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ranking")
public class RankingPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "race", insertable = false, updatable = false)
	private Race race;

	@Column(name = "race")
	private Long raceId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "athlete", updatable = false, insertable = false)
	private Athlete athlete;

	@Column(name = "athlete")
	private Long athleteId;

	private Integer position;
}
