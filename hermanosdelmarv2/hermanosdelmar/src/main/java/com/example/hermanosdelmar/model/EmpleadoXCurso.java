package com.example.hermanosdelmar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmpleadoXCurso {

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

     @ManyToOne
     @JsonIgnore
    private Empleado empleado;

    @ManyToOne
    @JsonIgnore
    private Curso curso;

}
