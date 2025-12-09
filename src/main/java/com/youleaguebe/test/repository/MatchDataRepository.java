package com.youleaguebe.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youleaguebe.test.models.MatchData;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface MatchDataRepository extends JpaRepository<MatchData, Integer>{

}
