/**package com.example.userplay.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userplay.model.Category;



@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByName(String name);
}**/