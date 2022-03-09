package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface FilmRepository extends JpaRepository<Film, Long> {

    Film findFilmByTitle(String title);
}
