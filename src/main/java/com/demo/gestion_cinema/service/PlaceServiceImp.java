package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Place;
import com.demo.gestion_cinema.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImp implements PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public List<Place> findAll() {
        return placeRepository.findAll();
    }

    @Override
    public Place findById(Long id) {
        return placeRepository.findById(id).get();
    }

    @Override
    public void save(Place place) {
        placeRepository.save(place);
    }

    @Override
    public void deleteById(Long id) {
        placeRepository.deleteById(id);
    }
}
