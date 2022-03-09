package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface PlaceRepository extends JpaRepository<Place, Long> {
}
