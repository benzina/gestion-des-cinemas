package com.demo.gestion_cinema.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    //@Column(unique = true)
    private int codePaiment;
    @Column(length = 75)
    private String clientName;
    private double prix;

    @ManyToOne
    private ProjectionFilm projectionFilm;

    @ManyToOne
    private Place place;
}
