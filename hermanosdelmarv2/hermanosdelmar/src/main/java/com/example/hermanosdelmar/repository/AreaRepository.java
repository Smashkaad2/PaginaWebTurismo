package com.example.hermanosdelmar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hermanosdelmar.model.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {

    
}
