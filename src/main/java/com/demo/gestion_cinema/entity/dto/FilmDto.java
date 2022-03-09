package com.demo.gestion_cinema.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@NoArgsConstructor
public class FilmDto {
    private String title;
    private String description;
    private String image;
    private double duree;
    private Date dateSortie;
    private String realisateur;

    public FilmDto(String title,String description,String image,double duree,Date dateSortie,String realisateur){
        this.description = description;
        this.title = title;
        this.image = image;
        this.dateSortie = dateSortie;
        this.duree = duree;
        this.realisateur = realisateur;
    }

}
