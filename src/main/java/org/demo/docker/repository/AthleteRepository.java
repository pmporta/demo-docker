package org.demo.docker.repository;

import org.demo.docker.model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository<Athlete, Long>{

}
