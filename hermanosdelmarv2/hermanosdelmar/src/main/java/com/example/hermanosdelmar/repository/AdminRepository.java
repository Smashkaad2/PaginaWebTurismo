package com.example.hermanosdelmar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hermanosdelmar.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    
}
