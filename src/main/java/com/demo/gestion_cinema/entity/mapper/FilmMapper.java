package com.demo.gestion_cinema.entity.mapper;

import com.demo.gestion_cinema.entity.Film;
import com.demo.gestion_cinema.entity.dto.FilmDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FilmMapper {
    FilmMapper INSTANCE = Mappers.getMapper( FilmMapper.class);

    FilmDto filmToDto(Film film);

    List<FilmDto> modelsToDtos(List<Film> films);

    @InheritInverseConfiguration
    Film dtoToFilm(FilmDto filmDto);

    List<Film> dtosTomodels(List<FilmDto> filmDtos);
}
