package com.example.hermanosdelmar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.hermanosdelmar.model.JefeArea;
import com.example.hermanosdelmar.service.JefeAreaService;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jefes-area")
public class RestControllerJefeArea {

    @Autowired
    private JefeAreaService jefeAreaService;

    @PostMapping
    public ResponseEntity<JefeArea> createJefeArea(@RequestBody JefeArea jefeArea) {
        JefeArea createdJefeArea = jefeAreaService.createJefeArea(jefeArea);
        return new ResponseEntity<>(createdJefeArea, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<JefeArea>> getAllJefesArea() {
        List<JefeArea> jefesArea = jefeAreaService.getAllJefesArea();
        return new ResponseEntity<>(jefesArea, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JefeArea> getJefeAreaById(@PathVariable("id") Long id) {
        Optional<JefeArea> jefeArea = jefeAreaService.getJefeAreaById(id);
        return jefeArea.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<JefeArea> updateJefeArea(@PathVariable("id") Long id, @RequestBody JefeArea jefeAreaDetails) {
        JefeArea updatedJefeArea = jefeAreaService.updateJefeArea(id, jefeAreaDetails);
        return new ResponseEntity<>(updatedJefeArea, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJefeArea(@PathVariable("id") Long id) {
        jefeAreaService.deleteJefeArea(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
