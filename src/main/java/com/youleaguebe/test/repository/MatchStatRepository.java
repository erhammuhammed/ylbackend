package com.youleaguebe.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youleaguebe.test.models.MatchStats;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface MatchStatRepository extends JpaRepository<MatchStats, Integer>{

}
