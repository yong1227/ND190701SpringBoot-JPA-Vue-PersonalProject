package com.bitcamp.web.repositories;

import com.bitcamp.web.entities.Challenges;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ChallengesRepository
 */
@Repository
public interface ChallengesRepository extends JpaRepository<Challenges, Long>{
    
}