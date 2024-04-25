package com.example.hermanosdelmar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hermanosdelmar.model.Negocio;

@Repository
public interface NegocioRepository extends JpaRepository<Negocio, Long> {
  
}

