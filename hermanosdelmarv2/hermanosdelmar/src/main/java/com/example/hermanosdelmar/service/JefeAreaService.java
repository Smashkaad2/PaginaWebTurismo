package com.example.hermanosdelmar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hermanosdelmar.model.JefeArea;
import com.example.hermanosdelmar.repository.JefeAreaRepository;

import java.util.List;
import java.util.Optional;


@Service
public class JefeAreaService {

    @Autowired
    private JefeAreaRepository jefeAreaRepository;

    // Método para crear un nuevo jefe de área
    public JefeArea createJefeArea(JefeArea jefeArea) {
        return jefeAreaRepository.save(jefeArea);
    }

    // Método para obtener todos los jefes de área
    public List<JefeArea> getAllJefesArea() {
        return jefeAreaRepository.findAll();
    }

    // Método para obtener un jefe de área por su ID
    public Optional<JefeArea> getJefeAreaById(Long id) {
        return jefeAreaRepository.findById(id);
    }

    // Método para actualizar un jefe de área existente
    public JefeArea updateJefeArea(Long id, JefeArea jefeAreaDetails) {
        JefeArea jefeArea = jefeAreaRepository.findById(id)
                                .orElseThrow(() -> new RuntimeException("Jefe de área not found for id: " + id));

        jefeArea.setNombreJefe(jefeAreaDetails.getNombreJefe());
        jefeArea.setRol(jefeAreaDetails.getRol());

        return jefeAreaRepository.save(jefeArea);
    }

    // Método para eliminar un jefe de área
    public void deleteJefeArea(Long id) {
        jefeAreaRepository.deleteById(id);
    }
}