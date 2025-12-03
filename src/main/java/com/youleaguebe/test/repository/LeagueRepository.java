package com.youleaguebe.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youleaguebe.test.models.LeagueInfo;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface LeagueRepository extends JpaRepository<LeagueInfo, Long> {
        // You can add custom query methods here if needed
        List<LeagueInfo> findByNameContaining(String name);
}