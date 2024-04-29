package com.example.hermanosdelmar.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Negocio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreNegocio;
    private String direccion;

    @OneToOne(mappedBy = "negocio")
    private Admin admin;

    @OneToMany(mappedBy = "jefesAreaenNegocio")
    @JsonIgnore
    private List<JefeArea> jefesdeArea;

    public List<JefeArea> getJefesAreas() {
        return jefesdeArea;
    }

    public boolean addjefeArea(JefeArea jefeArea) {
        return jefesdeArea.add(jefeArea);
    }
}
