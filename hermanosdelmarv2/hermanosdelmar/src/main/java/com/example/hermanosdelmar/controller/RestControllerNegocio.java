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

import com.example.hermanosdelmar.model.Negocio;
import com.example.hermanosdelmar.service.NegocioService;

@RestController
@RequestMapping("/negocios")
public class RestControllerNegocio {

    @Autowired
    private NegocioService negocioService;

    @PostMapping
    public ResponseEntity<Negocio> createNegocio(@RequestBody Negocio negocio) {
        Negocio createdNegocio = negocioService.createNegocio(negocio);
        return new ResponseEntity<>(createdNegocio, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Negocio>> getAllNegocios() {
        List<Negocio> negocios = negocioService.getAllNegocios();
        return new ResponseEntity<>(negocios, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Negocio> getNegocioById(@PathVariable("id") Long id) {
    java.util.Optional<Negocio> negocio = negocioService.getNegocioById(id);
        return negocio.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Negocio> updateNegocio(@PathVariable("id") Long id, @RequestBody Negocio negocioDetails) {
        Negocio updatedNegocio = negocioService.updateNegocio(id, negocioDetails);
        return new ResponseEntity<>(updatedNegocio, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNegocio(@PathVariable("id") Long id) {
        negocioService.deleteNegocio(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}