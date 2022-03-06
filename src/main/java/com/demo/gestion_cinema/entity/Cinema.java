package com.demo.gestion_cinema.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long code;
    @Column(length = 75)
    private String name;
    private double latitude;
    private double longitude;

    @ManyToOne
    private Ville ville;

    @OneToMany(mappedBy = "cinema")
    Collection<Salle> salles;

}
