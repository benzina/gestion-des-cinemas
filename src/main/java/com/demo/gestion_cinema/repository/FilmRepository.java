package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
