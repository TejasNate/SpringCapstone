package com.example.userplay.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userplay.model.Application;


public interface ApplicationRepository extends JpaRepository<Application, Long>  {
	Application findByName(String name);
}
