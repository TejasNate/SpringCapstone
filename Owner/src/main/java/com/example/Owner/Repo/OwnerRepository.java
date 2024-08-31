package com.example.Owner.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Owner.Model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}