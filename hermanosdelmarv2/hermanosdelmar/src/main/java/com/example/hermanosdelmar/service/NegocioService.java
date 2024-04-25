package com.example.hermanosdelmar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hermanosdelmar.model.Negocio;
import com.example.hermanosdelmar.repository.NegocioRepository;

import java.util.List;
import java.util.Optional;


@Service
public class NegocioService {

    @Autowired
    private NegocioRepository negocioRepository;

    // Método para crear un nuevo negocio
    public Negocio createNegocio(Negocio negocio) {
        return negocioRepository.save(negocio);
    }

    // Método para obtener todos los negocios
    public List<Negocio> getAllNegocios() {
        return negocioRepository.findAll();
    }

    // Método para obtener un negocio por su ID
    public Optional<Negocio> getNegocioById(Long id) {
        return negocioRepository.findById(id);
    }

    // Método para actualizar un negocio existente
    public Negocio updateNegocio(Long id, Negocio negocioDetails) {
        Negocio negocio = negocioRepository.findById(id)
                                .orElseThrow(() -> new RuntimeException("Negocio not found for id: " + id));

        negocio.setNombreNegocio(negocioDetails.getNombreNegocio());
        negocio.setDireccion(negocioDetails.getDireccion());

        return negocioRepository.save(negocio);
    }

    // Método para eliminar un negocio
    public void deleteNegocio(Long id) {
        negocioRepository.deleteById(id);
    }
}