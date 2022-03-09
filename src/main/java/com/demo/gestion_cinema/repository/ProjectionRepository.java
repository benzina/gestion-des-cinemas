package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Date;
import java.util.List;

@RestResource
public interface ProjectionRepository extends JpaRepository<ProjectionFilm, Long> {
    List<ProjectionFilm> findAllByDate(Date date);
}
