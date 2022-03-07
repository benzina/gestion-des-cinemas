package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Ville;
import com.demo.gestion_cinema.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleServiceImp implements VilleService{

    @Autowired
    private VilleRepository villeRepository;

    @Override
    public List<Ville> findAll() {
        return villeRepository.findAll();
    }

    @Override
    public Ville findByName(String name) {
        return villeRepository.findByName(name);
    }

    @Override
    public Ville findById(Long id) {
        return villeRepository.findById(id).get();
    }

    @Override
    public void save(Ville ville) {

    }

    @Override
    public void deleteById(Long id) {
        villeRepository.deleteById(id);
    }
}
