package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville,Long> {
}
