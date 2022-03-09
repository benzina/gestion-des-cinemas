package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    Cinema findCinemaByName(String name);
}
