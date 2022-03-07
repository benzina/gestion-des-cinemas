package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.ProjectionFilm;
import com.demo.gestion_cinema.repository.ProjectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProjectionServiceImp implements ProjectionService {

    @Autowired
    private ProjectionRepository projectionRepository;

    @Override
    public List<ProjectionFilm> findAll() {
        return projectionRepository.findAll();
    }

    @Override
    public List<ProjectionFilm> findAllByDate(Date date) {
        return projectionRepository.findAllByDate(date);
    }

    @Override
    public ProjectionFilm findById(Long id) {
        return projectionRepository.findById(id).get();
    }

    @Override
    public void save(ProjectionFilm projection) {
        projectionRepository.save(projection);
    }

    @Override
    public void deleteById(Long id) {
        projectionRepository.deleteById(id);
    }
}
