package com.example.hermanosdelmar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hermanosdelmar.model.Area;
import com.example.hermanosdelmar.service.AreaService;

@RestController
@RequestMapping("/area")
public class RestControllerArea {

    @Autowired
    private AreaService areaService;

    @PostMapping
    public ResponseEntity<Area> createArea(@RequestBody Area area) {
        Area createdArea = areaService.crearArea(area);
        return new ResponseEntity<>(createdArea, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Area>> getAllAreas() {
        List<Area> areas = areaService.obtenerTodasLasAreas();
        return new ResponseEntity<>(areas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Area> getAreaById(@PathVariable("id") Long id) {
    java.util.Optional<Area> area = areaService.obtenerAreaPorId(id);
        return area.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Area> updateArea(@PathVariable("id") Long id, @RequestBody Area areaDetails) {
        Area updatedArea = areaService.actualizarArea(id, areaDetails);
        return new ResponseEntity<>(updatedArea, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArea(@PathVariable("id") Long id) {
        areaService.eliminarArea(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}