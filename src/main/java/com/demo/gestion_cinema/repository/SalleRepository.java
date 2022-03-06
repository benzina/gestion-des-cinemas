package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle, Long> {
}
