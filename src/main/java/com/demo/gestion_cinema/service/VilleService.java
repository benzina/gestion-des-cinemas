package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Ville;

import java.util.List;

public interface VilleService {

    List<Ville> findAll();
    Ville findByName(String name);
    Ville findById(Long id);
    void save(Ville ville);
    void deleteById(Long id);
}
