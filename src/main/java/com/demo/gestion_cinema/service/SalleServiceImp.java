package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Salle;
import com.demo.gestion_cinema.repository.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleServiceImp implements SalleService{

    @Autowired
    private SalleRepository salleRepository;

    @Override
    public List<Salle> findAll() {
        return salleRepository.findAll();
    }

    @Override
    public Salle findByName(String name) {
        return salleRepository.findSalleByName(name);
    }

    @Override
    public Salle findById(Long id) {
        return salleRepository.findById(id).get();
    }

    @Override
    public void save(Salle salle) {
        salleRepository.save(salle);
    }

    @Override
    public void deleteById(Long id) {
        salleRepository.deleteById(id);
    }
}
