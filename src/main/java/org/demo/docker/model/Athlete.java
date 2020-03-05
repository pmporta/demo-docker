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
	
	private String name;
	
	private String age;
	
	@OneToMany (mappedBy = "runner")
	private List<RankingPosition> ranking;
	
	@OneToOne
	@JoinColumn(name = "country", insertable = false, updatable = false)
	private Country country;
	
	@Column(name = "country")
	private Long countryId;
	
}