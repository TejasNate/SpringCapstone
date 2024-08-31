package com.example.userplay.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userplay.model.User;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

	Optional<User> findByUsernameAndPassword(String username, String password);
}
