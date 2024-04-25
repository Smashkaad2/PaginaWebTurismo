package com.example.hermanosdelmar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hermanosdelmar.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
   
}
