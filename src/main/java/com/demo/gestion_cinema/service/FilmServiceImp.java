package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Film;
import com.demo.gestion_cinema.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public Film save(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Film updateFilm(Film film, Long id) {
        Film existingFilm = filmRepository.findById(id).get();

        existingFilm.builder()
                .title(film.getTitle())
                .description(film.getDescription())
                .dateSortie(film.getDateSortie())
                .image(film.getImage())
                .duree(film.getDuree())
                .realisateur(film.getRealisateur())
                .build();
        filmRepository.save(existingFilm);
        return existingFilm;
    }

    @Override
    public void deleteById(Long id) {
        filmRepository.deleteById(id);
    }
}
