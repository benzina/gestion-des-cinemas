package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface SalleRepository extends JpaRepository<Salle, Long> {
    Salle findSalleByName(String name);
}
