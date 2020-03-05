package org.demo.docker.repository;

import org.demo.docker.model.RankingPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankingPositionRepository extends JpaRepository<RankingPosition, Long> {

}
