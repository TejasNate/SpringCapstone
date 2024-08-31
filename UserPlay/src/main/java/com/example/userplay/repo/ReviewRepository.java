package com.example.userplay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userplay.model.Review;



@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}

