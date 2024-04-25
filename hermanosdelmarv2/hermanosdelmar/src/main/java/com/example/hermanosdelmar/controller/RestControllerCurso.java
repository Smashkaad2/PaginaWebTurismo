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

import com.example.hermanosdelmar.model.Curso;
import com.example.hermanosdelmar.service.CursoService;

@RestController
@RequestMapping("/curso")
public class RestControllerCurso {

    @Autowired
    private CursoService cursoService;

    @PostMapping
    public ResponseEntity<Curso> createCurso(@RequestBody Curso curso) {
        Curso createCurso = cursoService.crearCurso(curso);
        return new ResponseEntity<>(createCurso, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Curso>> getAllCurso() {
        List<Curso> cursos = cursoService.obtenerTodasLasCurso();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> getCursosId(@PathVariable("id") Long id) {
    java.util.Optional<Curso> curso = cursoService.obtenerCursoPorId(id);
        return curso.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> updateCurso(@PathVariable("id") Long id, @RequestBody Curso cursoDetails) {
        Curso updatedCurso = cursoService.actualizarCurso(id,cursoDetails);
        return new ResponseEntity<>(updatedCurso, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArea(@PathVariable("id") Long id) {
        cursoService.eliminarCurso(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}