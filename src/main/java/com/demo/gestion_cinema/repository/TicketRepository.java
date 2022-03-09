package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
