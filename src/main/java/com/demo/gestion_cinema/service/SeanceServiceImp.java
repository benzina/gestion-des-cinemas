package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Seance;
import com.demo.gestion_cinema.repository.SeanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeanceServiceImp implements SeanceService{


    private SeanceRepository seanceRepository;
    @Override
    public List<Seance> findAll() {
        return seanceRepository.findAll();
    }

    @Override
    public Seance findById(Long id) {
        return seanceRepository.findById(id).get();
    }

    @Override
    public void save(Seance seance) {
        seanceRepository.save(seance);
    }

    @Override
    public void deleteById(Long id) {
        seanceRepository.deleteById(id);
    }
}
