package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface VilleRepository extends JpaRepository<Ville,Long> {
    Ville findByName(String name);
}
