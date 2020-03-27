package org.demo.docker.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "athlete")
public class Athlete {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank
	private String name;

	@OneToMany(mappedBy = "athlete")
	private List<RankingPosition> ranking;

	@OneToOne
	@JoinColumn(name = "country", insertable = false, updatable = false)
	private Country country;

	@Column(name = "country")
	@NotNull
	private Long countryId;

}
