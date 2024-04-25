package com.example.hermanosdelmar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hermanosdelmar.model.Curso;
import com.example.hermanosdelmar.repository.CursoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    // Create operation
    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    // Read
    public List<Curso> obtenerTodasLasCurso() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> obtenerCursoPorId(Long id) {
        return cursoRepository.findById(id);
    }

    // Update
    public Curso actualizarCurso(Long id, Curso areaCurso) {
        Curso curso = cursoRepository.findById(id).orElse(null);
        if (curso != null) {
            curso.setNombreCurso(areaCurso.getNombreCurso());
            curso.setCercaniaValoracion(areaCurso.getCercaniaValoracion());
            return cursoRepository.save(curso);
        }
        return null;
    }

    // Delete
    public void eliminarCurso(Long id) {
        cursoRepository.deleteById(id);
    }

}
