package com.demo.gestion_cinema.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String image;
    private double duree;
    private Date dateSortie;
    private String realisateur;

    @OneToMany(mappedBy = "film")
    private Collection<ProjectionFilm> projectionFilms;

    @ManyToOne
    private Category category;

}
