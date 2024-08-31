/**package com.example.userplay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userplay.model.Category;
import com.example.userplay.repo.CategoryRepository;



@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getCategoriesByName(String name) {
        return categoryRepository.findByName(name);
    }
}**/