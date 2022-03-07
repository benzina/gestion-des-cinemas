package com.demo.gestion_cinema.service;


import com.demo.gestion_cinema.entity.ProjectionFilm;

import java.util.Date;
import java.util.List;

public interface ProjectionService {

    List<ProjectionFilm> findAll();
    List<ProjectionFilm> findAllByDate(Date date);
    ProjectionFilm findById(Long id);
    void save(ProjectionFilm projection);
    void deleteById(Long id);
}
