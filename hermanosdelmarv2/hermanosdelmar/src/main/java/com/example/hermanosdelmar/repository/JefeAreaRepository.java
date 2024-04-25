package com.example.hermanosdelmar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hermanosdelmar.model.JefeArea;

@Repository
public interface JefeAreaRepository extends JpaRepository<JefeArea, Long> {
    
}
