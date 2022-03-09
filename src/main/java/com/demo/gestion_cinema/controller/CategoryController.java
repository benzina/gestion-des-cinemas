package com.demo.gestion_cinema.controller;

import com.demo.gestion_cinema.entity.Category;
import com.demo.gestion_cinema.entity.dto.CategoryDto;
import com.demo.gestion_cinema.entity.mapper.CategoryMapper;
import com.demo.gestion_cinema.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryMapper mapper;

    // build create category rest api
    @PostMapping(value = "/new-category",consumes  = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Category> saveCategory(@RequestBody CategoryDto categoryDto){
        Category category = mapper.dtoToCategory(categoryDto);
        return new ResponseEntity<>(categoryService.save(category), HttpStatus.CREATED);
    }

    // build get all category rest api
    @GetMapping("/categories")
    public List<CategoryDto> getAllCategories(){
        return mapper.modelsToDtos(categoryService.findAll());
    }

    //build get category by id rest api
    @GetMapping("/category/{ID}")
    public ResponseEntity<Category> getcategoryById(@PathVariable("ID") Long id){
        return new ResponseEntity<Category>(categoryService.findById(id),HttpStatus.OK);
    }

    //build update category rest api
    @PutMapping("/update/{id}")
    public ResponseEntity<CategoryDto> updateCateory(@PathVariable("id") Long id,
                                                    @RequestBody CategoryDto categoryDto){
        Category category = mapper.dtoToCategory(categoryDto);
        return new ResponseEntity<CategoryDto>(mapper.categoryToDto(categoryService.updateCategory(category,id)),HttpStatus.OK);
    }


    //build delete category rest api
    @DeleteMapping("/category/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") Long id){
        //delete category from DB
        categoryService.deleteById(id);
        return new ResponseEntity<String>("category deleted successfully !.",HttpStatus.OK);
    }

}
