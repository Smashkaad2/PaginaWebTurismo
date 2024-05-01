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
import com.example.hermanosdelmar.model.Empleado;
import com.example.hermanosdelmar.model.EmpleadoXCurso;
import com.example.hermanosdelmar.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class RestControllerEmpleado {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public ResponseEntity<Empleado> createEmpleado(@RequestBody Empleado empleado) {
        Empleado createdEmp = empleadoService.crearEmpleado(empleado);
        return new ResponseEntity<>(createdEmp, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Empleado>> getAllEmpleados() {
        List<Empleado> empleados = empleadoService.obtenerTodosLosEmpleados();
        return new ResponseEntity<>(empleados, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> getEmpladosbyId(@PathVariable("id") Long id) {
    java.util.Optional<Empleado> empleado = empleadoService.obtenerEmpleadoPorId(id);
        return empleado.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empleado> updateArea(@PathVariable("id") Long id, @RequestBody Empleado empleadoDetails) {
        Empleado updatedEmpleado = empleadoService.actualizarEmpleado(id,empleadoDetails);
        return new ResponseEntity<>(updatedEmpleado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArea(@PathVariable("id") Long id) {
        empleadoService.eliminarEmpleado(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

      @GetMapping("/list/curso/{idemployee}")
    public List<EmpleadoXCurso> obtenerListaCursos(@PathVariable long idemployee) {
        return empleadoService.obtenerListaCursos(idemployee);
    }


}