package com.demo.gestion_cinema.entity.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryDto {
    private String name;
    private String description;

    public CategoryDto(String name,String description){
        this.name = name;
        this.description = description;
    }
}
