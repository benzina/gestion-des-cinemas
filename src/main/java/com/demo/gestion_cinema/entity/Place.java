package com.demo.gestion_cinema.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numero;
    private double longitude;
    private double latitude;

    @ManyToOne
    private Salle salle;

    @OneToMany(mappedBy = "place")
    private Collection<Ticket> tickets;





}
