package com.example.hermanosdelmar.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreCurso;
    private int cercaniaValoracion;
    private String habilidad;
    private String horas;
    private String link;
    private String descripcion;
    private String estado;
    private String fechaAsignado;
    private String fechaVencimiento;


    @OneToMany(mappedBy = "curso")
    @JsonIgnore
    private List<EmpleadoXCurso> empleados;

    public List<EmpleadoXCurso> getempleados() {
        return empleados;
    }

    public boolean addempleado(EmpleadoXCurso empleado) {
        return empleados.add(empleado);
    }


    

}
