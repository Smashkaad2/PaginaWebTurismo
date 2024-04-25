package com.example.hermanosdelmar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hermanosdelmar.model.Admin;
import com.example.hermanosdelmar.repository.AdminRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    
    @Autowired
    private AdminRepository adminRepository;

    // Método para crear un nuevo administrador
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Método para obtener todos los administradores
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // Método para obtener un administrador por su ID
    public Optional<Admin> getAdminById(Long id) {
        return adminRepository.findById(id);
    }

    // Método para actualizar un administrador existente
    public Admin updateAdmin(Long id, Admin adminDetails) {
        Admin admin = adminRepository.findById(id)
                                .orElseThrow(() -> new RuntimeException("Admin not found for id: " + id));

        admin.setNombreAdmin(adminDetails.getNombreAdmin());
        admin.setRol(adminDetails.getRol());

        return adminRepository.save(admin);
    }

    // Método para eliminar un administrador
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
