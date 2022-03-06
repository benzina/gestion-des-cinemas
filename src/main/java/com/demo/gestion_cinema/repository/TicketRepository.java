package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
