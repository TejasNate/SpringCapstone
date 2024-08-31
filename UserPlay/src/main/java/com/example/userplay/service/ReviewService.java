package com.example.userplay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.userplay.model.Review;
import com.example.userplay.repo.ReviewRepository;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    // Fetch all reviews
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    // Fetch a review by ID
    public Optional<Review> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    // Create or update a review
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    // Delete a review by ID
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
