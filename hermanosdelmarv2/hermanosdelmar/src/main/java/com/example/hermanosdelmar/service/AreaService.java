package com.example.hermanosdelmar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hermanosdelmar.model.Area;
import com.example.hermanosdelmar.repository.AreaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository;

    // Create
    public Area crearArea(Area area) {
        return areaRepository.save(area);
    }

    // Read
    public List<Area> obtenerTodasLasAreas() {
        return areaRepository.findAll();
    }

    public Optional<Area> obtenerAreaPorId(Long id) {
        return areaRepository.findById(id);
    }

    // Update
    public Area actualizarArea(Long id, Area areaDetalles) {
        Area area = areaRepository.findById(id).orElse(null);
        if (area != null) {
            area.setNombreArea(areaDetalles.getNombreArea());
            return areaRepository.save(area);
        }
        return null;
    }

    // Delete
    public void eliminarArea(Long id) {
        areaRepository.deleteById(id);
    }
}