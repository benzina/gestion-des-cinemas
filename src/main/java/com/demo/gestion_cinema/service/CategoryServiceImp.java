package com.demo.gestion_cinema.service;

import com.demo.gestion_cinema.entity.Category;
import com.demo.gestion_cinema.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category, long id) {
        Category existCategory = categoryRepository.findById(id).get();
        log.info(existCategory.toString());
        existCategory.setDescription(category.getDescription());
        existCategory.setName(category.getName());
        existCategory.setFilms(category.getFilms());
/*
        existCategory.builder()
                .name(category.getName())
                .description(category.getDescription())
                .films(category.getFilms())
                .build();
    */
        log.info(existCategory.toString());
        categoryRepository.save(existCategory);
        return existCategory;
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
}
