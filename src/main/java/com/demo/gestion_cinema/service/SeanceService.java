package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Seance;

import java.util.List;

public interface SeanceService {

    List<Seance> findAll();
    Seance findById(Long id);
    void save(Seance seance);
    void deleteById(Long id);
}
