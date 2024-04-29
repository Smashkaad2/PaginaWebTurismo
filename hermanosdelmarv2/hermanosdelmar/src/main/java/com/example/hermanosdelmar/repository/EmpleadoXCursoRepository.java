package com.example.hermanosdelmar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hermanosdelmar.model.EmpleadoXCurso;

@Repository
public interface EmpleadoXCursoRepository extends JpaRepository<EmpleadoXCurso, Long> {
    
}