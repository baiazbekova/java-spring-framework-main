package com.cybertek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface GenreRepository extends JpaRepository<Repository, Long> {
}
