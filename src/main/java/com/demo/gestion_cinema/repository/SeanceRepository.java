package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
}
