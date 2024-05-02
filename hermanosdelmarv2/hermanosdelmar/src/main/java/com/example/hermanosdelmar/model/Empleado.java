package com.example.hermanosdelmar.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreEmpleado;
    private String correo;
    private String password;
    private String fechaContrato;
    private String area;
    private String rol;
    private int performance;
    private int valoracion;
    private int numCursos;
    private int cursosCursados;
    private int encuestasRealizadas;
    private int afectiva;
    private int empatia;
    private int tiempo;
    private int equipo;
    private int problemas;
    private int ventas;
    private int adaptabilidad;
    private int emocional;

    @OneToMany(mappedBy = "empleado")
    private List<EmpleadoXCurso> cursos;

     @ManyToOne
    @JsonIgnore
    private JefeArea empleadosJefeArea;

    public List<EmpleadoXCurso> getCursos() {
        return cursos;
    }

    public boolean addCurso(EmpleadoXCurso curso) {
        return cursos.add(curso);
    }

   
}
