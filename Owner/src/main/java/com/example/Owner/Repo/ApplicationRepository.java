package com.example.Owner.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Owner.Model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}