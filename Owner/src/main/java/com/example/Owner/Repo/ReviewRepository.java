package com.example.Owner.Repo;



import com.example.Owner.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
