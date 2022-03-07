package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> findAll();
    Ticket findById(Long id);
    void save(Ticket ticket);
    void deleteById(Long id);
}
