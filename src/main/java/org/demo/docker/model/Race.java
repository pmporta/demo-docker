package org.demo.docker.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "race")
public class Race {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@OneToOne
	@JoinColumn(name = "country", insertable = false, updatable = false)
	private Country country;

	@Column(name="country")
	private Long countryId;

	private String distance;

	private String heightGain;

	@OneToMany(mappedBy = "race", cascade = CascadeType.ALL)
	private List<RankingPosition> ranking;

}
