package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectionRepository extends JpaRepository<ProjectionFilm, Long> {
}
