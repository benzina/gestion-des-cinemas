package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Film;
import com.demo.gestion_cinema.entity.Film;

import java.util.List;

public interface FilmService {

    List<Film> findAll();
    Film findByTitle(String title);
    Film findById(Long id);
    Film save(Film film);
    Film updateFilm(Film film,Long id);
    void deleteById(Long id);


}
