package com.demo.gestion_cinema.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import lombok.Builder;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(length = 75)
    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private Collection<Film> films;
}
