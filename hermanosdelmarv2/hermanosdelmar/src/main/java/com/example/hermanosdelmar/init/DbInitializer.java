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
import com.example.hermanosdelmar.model.EmpleadoXCurso;
import com.example.hermanosdelmar.model.JefeArea;
import com.example.hermanosdelmar.model.Negocio;
import com.example.hermanosdelmar.repository.AdminRepository;
import com.example.hermanosdelmar.repository.AreaRepository;
import com.example.hermanosdelmar.repository.CursoRepository;
import com.example.hermanosdelmar.repository.EmpleadoRepository;
import com.example.hermanosdelmar.repository.EmpleadoXCursoRepository;
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

    @Autowired
    private EmpleadoXCursoRepository empleadoXCursoRepository;

    @Override
    public void run(String... args) throws Exception {

        List<Negocio> negocioDisponible = negocioRepository.findAll();
        List<Area> areasDisponibles = areaRepository.findAll();
        List<Empleado> empleadosDisponibles = empleadoRepository.findAll();
        List<Curso> cursosDisponibles = cursoRepository.findAll();

        if (negocioRepository.count() == 0) {

            for (int i = 1; i <= 20; i++) {
                Negocio negocio = new Negocio();
                negocio.setNombreNegocio("Negocio" + i);
                negocio.setDireccion("Direccion" + i);
                negocioDisponible.add(negocio);
                negocioRepository.save(negocio);
            }
            System.out.println("Se han creado 20 Negocios.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }

        if (areaRepository.count() == 0) {

            Area area1 = new Area();
            area1.setNombreArea("Hospedaje");

            Area area2 = new Area();
            area2.setNombreArea("Recepcion");

            Area area3 = new Area();
            area3.setNombreArea("Restaurante");

            areaRepository.save(area1);
            areaRepository.save(area2);
            areaRepository.save(area3);
            areasDisponibles.add(area1);
            areasDisponibles.add(area2);
            areasDisponibles.add(area3);

            System.out.println("Se han creado 3 Areas.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }

        if (adminRepository.count() == 0) {

            for (int i = 1; i <= 20; i++) {
                Admin admin = new Admin();
                admin.setNombreAdmin("Admin" + i);
                admin.setRol("Admin");
                admin.setNegocio(negocioDisponible.get(i - 1));
                adminRepository.save(admin);
            }
            System.out.println("Se han creado 20 Administradores.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }

        if (jefeAreaRepository.count() == 0) {

            for (int i = 1; i <= 20; i++) {

                Random rand = new Random();
                Negocio negocioaleatorio = negocioDisponible.get(rand.nextInt(negocioDisponible.size()));
                Area arealeatoria = areasDisponibles.get(rand.nextInt(areasDisponibles.size()));

                JefeArea jefeArea1 = new JefeArea();
                jefeArea1.setNombreJefe("Jefe de Area" + i);
                jefeArea1.setRol("Jefe_de_Area");
                jefeArea1.setAreaNombre(arealeatoria.getNombreArea());
                jefeArea1.setJefesAreaenNegocio(negocioaleatorio);
                jefeAreaRepository.save(jefeArea1);

            }

            System.out.println("Se han creado 3 Jefes de Area.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }

        Random random = new Random();

        if (cursoRepository.count() == 0) {
            for (int i = 1; i <= 10; i++) {
                Curso curso = new Curso();
                curso.setNombreCurso("Curso" + i);
                curso.setCercaniaValoracion(random.nextInt(101));

                cursoRepository.save(curso);
                cursosDisponibles.add(curso);
            }

            System.out.println("Se han creado 2 Cursos.");
        } else {
            System.out.println("Ya existen cursos en la base de datos.");
        }

        if (empleadoRepository.count() == 0) {

            for (int i = 1; i <= 50; i++) {

                Random rand = new Random();
                Area arealeatoria = areasDisponibles.get(rand.nextInt(areasDisponibles.size()));
                List<JefeArea> jefeAreaDisponibles = jefeAreaRepository.findAll();
                JefeArea jefeAleatorio = jefeAreaDisponibles.get(random.nextInt(jefeAreaDisponibles.size()));
                Boolean jefemismaArea = false;

                Empleado empleado = new Empleado();

                empleado.setNombreEmpleado("Empleado" + i);
                empleado.setCorreo("empleado" + i + "@correo.com");
                empleado.setFechaContrato("Fecha:" + i);
                
                while (jefemismaArea != true) {
                    if (jefeAleatorio.getAreaNombre().equals(arealeatoria.getNombreArea())) {
                        empleado.setArea(arealeatoria.getNombreArea());
                        jefemismaArea = true;
                    } else {
                        Random randAreanew = new Random();
                        arealeatoria = areasDisponibles.get(randAreanew.nextInt(areasDisponibles.size()));
                    }
                }

                empleado.setRol("Empleado");
                empleado.setPerformance(0);
                empleado.setValoracion(0);
                empleado.setNumCursos(0);
                empleado.setCursosCursados(0);
                empleado.setEmpleadosJefeArea(jefeAleatorio);

                empleadoRepository.save(empleado);
                empleadosDisponibles.add(empleado);

                for (int j = 0; j < random.nextInt(11); j++) {
                    EmpleadoXCurso nuevoEmpleadoXCurso = new EmpleadoXCurso();
                    Curso cursoAleatorio = cursosDisponibles.get(random.nextInt(cursosDisponibles.size()));
                    nuevoEmpleadoXCurso.setNombreCurso(cursoAleatorio.getNombreCurso());
                    nuevoEmpleadoXCurso.setCercaniaValoracion(cursoAleatorio.getCercaniaValoracion());
                    nuevoEmpleadoXCurso.setEmpleado(empleado);
                    nuevoEmpleadoXCurso.setCurso(cursoAleatorio);
                    empleadoXCursoRepository.save(nuevoEmpleadoXCurso);
                }

                empleadoRepository.save(empleado);

            }

            System.out.println("Se han creado 20 Empleados.");
        } else {
            System.out.println("Ya existen naves en la base de datos.");
        }

    }
}
