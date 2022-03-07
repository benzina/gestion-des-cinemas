package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Cinema;

import java.util.List;

public interface CinemaService {

    List<Cinema> findAll();
    Cinema findByName(String name);
    Cinema findById(Long id);
    void save(Cinema cinema);
    void deleteById(Long id);
}
