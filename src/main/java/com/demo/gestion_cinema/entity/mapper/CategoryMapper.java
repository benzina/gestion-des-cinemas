package com.demo.gestion_cinema.entity.mapper;

import com.demo.gestion_cinema.entity.Category;
import com.demo.gestion_cinema.entity.dto.CategoryDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper( CategoryMapper.class);

    CategoryDto categoryToDto(Category category);

    List<CategoryDto> modelsToDtos(List<Category> categories);

    @InheritInverseConfiguration
    Category dtoToCategory(CategoryDto categoryDto);

    List<Category> dtosTomodels(List<CategoryDto> categoryDtos);
}
