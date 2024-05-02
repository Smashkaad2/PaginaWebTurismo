package com.example.hermanosdelmar.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JefeArea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreJefe;
    private String correo;
    private String password;
    private String rol;
    private String areaNombre;

    @OneToMany(mappedBy = "empleadosJefeArea")
    private List<Empleado> empleados;

    public List<Empleado> getempleados() {
        return empleados;
    }

    public boolean addempleado(Empleado empleado) {
        return empleados.add(empleado);
    }
   
    @ManyToOne
    @JsonIgnore
    private Negocio jefesAreaenNegocio;

}
