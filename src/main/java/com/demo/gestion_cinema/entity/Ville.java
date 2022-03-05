package com.demo.gestion_cinema.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private double longitude;
    private double laltitude;
    private double altitude;

    @OneToMany(mappedBy = "ville")
    Collection<Cinema> cinemas;
}
