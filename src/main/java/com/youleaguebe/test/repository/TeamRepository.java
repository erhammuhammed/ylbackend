package com.youleaguebe.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youleaguebe.test.models.TeamInfo;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface TeamRepository extends JpaRepository<TeamInfo, Integer>{
    List<TeamInfo> findByNameContaining(String name);
}
