package com.demo.gestion_cinema.controller;

import com.demo.gestion_cinema.entity.Film;
import com.demo.gestion_cinema.entity.dto.FilmDto;
import com.demo.gestion_cinema.entity.mapper.FilmMapper;
import com.demo.gestion_cinema.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmCategory {

    @Autowired
    private FilmService filmService;

    @Autowired
    private FilmMapper mapper;

    // build create film rest api
    @PostMapping(value = "/new-film",consumes  = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Film> saveFilm(@RequestBody FilmDto filmDto){
        Film film = mapper.dtoToFilm(filmDto);
        return new ResponseEntity<>(filmService.save(film), HttpStatus.CREATED);
    }

    // build get all film rest api
    @GetMapping("/films")
    public List<FilmDto> getAllFilms(){
        return mapper.modelsToDtos(filmService.findAll());
    }

    //build get film by id rest api
    @GetMapping("/film/{ID}")
    public ResponseEntity<Film> getFilmById(@PathVariable("ID") Long id){
        return new ResponseEntity<Film>(filmService.findById(id),HttpStatus.OK);
    }

    //build update film rest api
    @PutMapping("/film/{id}")
    public ResponseEntity<FilmDto> updateFilm(@PathVariable("id") Long id,
                                              @RequestBody FilmDto filmDto){
        Film film = mapper.dtoToFilm(filmDto);
        return new ResponseEntity<FilmDto>(mapper.filmToDto(filmService.updateFilm(film,id)),HttpStatus.OK);
    }

    //build delete film rest api
    @DeleteMapping("/film/{id}")
    public ResponseEntity<String> deleteFilm(@PathVariable("id") Long id){
        //delete film from DB
        filmService.deleteById(id);
        return new ResponseEntity<String>("film deleted successfully !.",HttpStatus.OK);
    }
}
