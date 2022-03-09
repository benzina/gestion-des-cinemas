package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
