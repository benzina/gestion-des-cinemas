package com.demo.gestion_Category.service;


import com.demo.gestion_cinema.entity.Category;

import java.util.List;


public interface CategoryService {
    List<Category> findAll();
    Category findByName(String name);
    Category findById(Long id);
    void save(Category category);
    void deleteById(Long id);

}
