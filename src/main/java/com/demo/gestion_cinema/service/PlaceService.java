package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Place;

import java.util.List;

public interface PlaceService {

    List<Place> findAll();
    Place findById(Long id);
    void save(Place place);
    void deleteById(Long id);
}
