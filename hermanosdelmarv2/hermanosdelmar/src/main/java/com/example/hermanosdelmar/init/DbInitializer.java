package com.example.hermanosdelmar.init;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.hermanosdelmar.model.Admin;
import com.example.hermanosdelmar.model.Area;
import com.example.hermanosdelmar.model.Curso;
import com.example.hermanosdelmar.model.Empleado;
import com.example.hermanosdelmar.model.JefeArea;
import com.example.hermanosdelmar.model.Negocio;
import com.example.hermanosdelmar.repository.AdminRepository;
import com.example.hermanosdelmar.repository.AreaRepository;
import com.example.hermanosdelmar.repository.CursoRepository;
import com.example.hermanosdelmar.repository.EmpleadoRepository;
import com.example.hermanosdelmar.repository.JefeAreaRepository;
import com.example.hermanosdelmar.repository.NegocioRepository;

@Component
public class DbInitializer implements CommandLineRunner {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private NegocioRepository negocioRepository;

    @Autowired
    private JefeAreaRepository jefeAreaRepository;

    @Autowired
    private AreaRepository areaRepository;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public void run(String... args) throws Exception {

        if (adminRepository.count() == 0) {


            for (int i = 1; i <= 20; i++) {
                Admin admin = new Admin();
                admin.setNombreAdmin("Admin" + i);
                admin.setRol("Admin");
                adminRepository.save(admin);
            }
            System.out.println("Se han creado 20 Administradores.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }

        if (negocioRepository.count() == 0) {

            List<Admin> AdminDisponibles = adminRepository.findAll();

            for (int i = 1; i <= 20; i++) {
                Negocio negocio = new Negocio();
                negocio.setNombreNegocio("Negocio" + i);
                negocio.setDireccion("Direccion" + i);
                negocio.setAdmin(AdminDisponibles.get(i-1));
                negocioRepository.save(negocio);
            }
            System.out.println("Se han creado 20 Negocios.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }

        


        if (jefeAreaRepository.count() == 0) {

            JefeArea jefeArea1 = new JefeArea();
            jefeArea1.setNombreJefe("Jefe de Area 1");
            jefeArea1.setRol("Jefe_de_Area");
            jefeArea1.setArea("Hospedaje");

            JefeArea jefeArea2 = new JefeArea();
            jefeArea2.setNombreJefe("Jefe de Area 2");
            jefeArea2.setRol("Jefe_de_Area");
            jefeArea2.setArea("Recepcion");

            JefeArea jefeArea3 = new JefeArea();
            jefeArea3.setNombreJefe("Jefe de Area 3");
            jefeArea3.setRol("Jefe_de_Area");
            jefeArea3.setArea("Restaurante");

            jefeAreaRepository.save(jefeArea1);
            jefeAreaRepository.save(jefeArea2);
            jefeAreaRepository.save(jefeArea3);

            System.out.println("Se han creado 3 Jefes de Area.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }

        if (areaRepository.count() == 0) {

            for (int i = 1; i <= 20; i++) {
                Empleado empleado = new Empleado();

                empleado.setNombreEmpleado("Empleado" + i);
                empleado.setCorreo("empleado" + i + "@correo.com");
                empleado.setFechaContrato("Fecha:" + i);
                empleado.setRol("Empleado");
                empleado.setPerformance(0);
                empleado.setValoracion(0);
                empleado.setNumCursos(0);
                empleado.setCursosCursados(0);
                empleadoRepository.save(empleado);
            }

            System.out.println("Se han creado 20 Empleados.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }

        if (empleadoRepository.count() == 0) {

            Area area1 = new Area();
            area1.setNombreArea("Hospedaje");

            Area area2 = new Area();
            area2.setNombreArea("Recepcion");

            Area area3 = new Area();
            area3.setNombreArea("Restaurante");

            areaRepository.save(area1);
            areaRepository.save(area2);
            areaRepository.save(area3);

            System.out.println("Se han creado 3 Areas.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }

        Random random = new Random();

        if (cursoRepository.count() == 0) {

            for (int i = 1; i <= 30; i++) {
                Curso curso = new Curso();

                curso.setNombreCurso("Curso" + i);
                curso.setCercaniaValoracion(random.nextInt(101));
                cursoRepository.save(curso);

            }


            
            System.out.println("Se han creado 30 Cursos.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }
    }
}
