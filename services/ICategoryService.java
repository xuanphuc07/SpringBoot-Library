package com.example.shopapptech.services;

import com.example.shopapptech.dtos.CategoryDTO;
import com.example.shopapptech.models.Category;

import java.util.List;

public interface ICategoryService {
    Category createCategory(CategoryDTO category);
    Category getCategoryById(long id);
    List<Category> getAllCategories();
    Category updateCategory(long categoryId, CategoryDTO category);
    void deleteCategory(long id);
}
