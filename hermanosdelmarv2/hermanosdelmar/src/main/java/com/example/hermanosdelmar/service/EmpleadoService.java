package com.example.hermanosdelmar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.hermanosdelmar.model.Curso;
import com.example.hermanosdelmar.model.Empleado;
import com.example.hermanosdelmar.model.EmpleadoXCurso;
import com.example.hermanosdelmar.repository.EmpleadoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Create
    public Empleado crearEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    // Read
    public List<Empleado> obtenerTodosLosEmpleados() {
        return empleadoRepository.findAll();
    }

    public Optional<Empleado> obtenerEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id);
    }

    // Update
    public Empleado actualizarEmpleado(Long id, Empleado empleadoDetalles) {
        Empleado empleado = empleadoRepository.findById(id).orElse(null);
        if (empleado != null) {
            empleado.setNombreEmpleado(empleadoDetalles.getNombreEmpleado());
            empleado.setCorreo(empleadoDetalles.getCorreo());
            empleado.setFechaContrato(empleadoDetalles.getFechaContrato());
            empleado.setArea(empleadoDetalles.getArea());
            empleado.setRol(empleadoDetalles.getRol());
            empleado.setPerformance(empleadoDetalles.getPerformance());
            empleado.setValoracion(empleadoDetalles.getValoracion());
            empleado.setNumCursos(empleadoDetalles.getNumCursos());
            empleado.setCursosCursados(empleadoDetalles.getCursosCursados());
            return empleadoRepository.save(empleado);
        }
        return null;
    }

    // Delete
    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }

    
    public List<EmpleadoXCurso> obtenerListaCursos(Long idEmploye) {
        Empleado empleado = empleadoRepository.findById(idEmploye).orElseThrow();
        return empleado.getCursos();
    }

    
}