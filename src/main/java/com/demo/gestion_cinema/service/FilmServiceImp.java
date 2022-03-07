package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Film;
import com.demo.gestion_cinema.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FilmServiceImp  implements FilmService{

    @Autowired
    private FilmRepository filmRepository;

    @Override
    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    @Override
    public Film findByTitle(String title) {
        return filmRepository.findFilmByTitle(title);
    }

    @Override
    public Film findById(Long id) {
        return filmRepository.findById(id).get();
    }

    @Override
    public void save(Film film) {
        filmRepository.save(film);
    }

    @Override
    public void deleteById(Long id) {
        filmRepository.deleteById(id);
    }
}
