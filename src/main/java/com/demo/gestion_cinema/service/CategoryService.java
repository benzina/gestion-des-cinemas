package com.demo.gestion_cinema.service;


import com.demo.gestion_cinema.entity.Category;

import java.util.List;


public interface CategoryService {
    List<Category> findAll();
    Category findByName(String name);
    Category findById(Long id);
    Category save(Category category);
    public Category updateCategory(Category category,long id);
    void deleteById(Long id);

}
