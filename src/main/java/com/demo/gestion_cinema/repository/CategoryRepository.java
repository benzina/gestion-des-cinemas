package com.demo.gestion_cinema.repository;

import com.demo.gestion_cinema.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
