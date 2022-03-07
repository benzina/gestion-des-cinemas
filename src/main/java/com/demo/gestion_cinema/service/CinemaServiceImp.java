package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Cinema;
import com.demo.gestion_cinema.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImp implements CinemaService{

    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public List<Cinema> findAll() {
        return cinemaRepository.findAll();
    }

    @Override
    public Cinema findByName(String name) {
        return cinemaRepository.findCinemaByName(name);
    }

    @Override
    public Cinema findById(Long id) {
        return cinemaRepository.findById(id).get();
    }

    @Override
    public void save(Cinema cinema) {
        cinemaRepository.save(cinema);
    }

    @Override
    public void deleteById(Long id) {
        cinemaRepository.deleteById(id);
    }
}
