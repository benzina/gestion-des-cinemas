package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProjectionRepository extends JpaRepository<ProjectionFilm, Long> {
    List<ProjectionFilm> findAllByDate(Date date);
}
