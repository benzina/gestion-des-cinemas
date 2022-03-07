package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Salle;

import java.util.List;

public interface SalleService {

    List<Salle> findAll();
    Salle findByName(String name);
    Salle findById(Long id);
    void save(Salle salle);
    void deleteById(Long id);
}
