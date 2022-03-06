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
    @Column(length = 100)
    private String title;
    private String description;
    private String image;
    private double duree;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSortie;
    @Column(length = 75)
    private String realisateur;

    @OneToMany(mappedBy = "film")
    private Collection<ProjectionFilm> projectionFilms;

    @ManyToOne
    private Category category;

}
