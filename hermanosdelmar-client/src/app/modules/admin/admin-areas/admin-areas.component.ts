import { Component } from '@angular/core';
import { EmpleadoService } from '../../../services/empleado.service';
import { Empleado } from '../../../models/Empleado';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-areas',
  templateUrl: './admin-areas.component.html',
  styleUrl: './admin-areas.component.css'
})
export class AdminAreasComponent {
  desRestaurante: number =0;
  desRecepcion: number =0;
  desHospedaje: number =0;

  numRestaurante: number = 0;
  numRecepcion: number = 0;
  numHospedaje: number = 0;

  restaUsers: Empleado[]=[];
  recepUsers: Empleado[]=[];
  hospUsers: Empleado[]=[];

  constructor(private empleadoService: EmpleadoService, private router: Router) { }

  ngOnInit(): void {
    this.obtenerEmpleados();
  }

  obtenerEmpleados() {
    this.empleadoService.obtenerEmpleados().subscribe(
      (empleados: Empleado[]) => {
        this.restaUsers = empleados.filter(empleado => empleado.area === 'Restaurante');
        this.recepUsers = empleados.filter(empleado => empleado.area === 'Recepcion');
        this.hospUsers = empleados.filter(empleado => empleado.area === 'Hospedaje');

        this.calcularDesempehno(this.restaUsers, 'Restaurante');
        this.calcularDesempehno(this.recepUsers, 'Recepcion');
        this.calcularDesempehno(this.hospUsers, 'Hospedaje');
      },
      error => {
        console.error('Error al obtener empleados:', error);
      }
    );
  }


  calcularDesempehno(empleados: Empleado[], area: string) {
    let totalPerformance = 0;
    empleados.forEach(empleado => {
      totalPerformance += empleado.performance;
    });

    // Calcular el promedio de performance
    const promedioPerformance = empleados.length > 0 ? totalPerformance / empleados.length : 0;

    // Almacenar el promedio de performance
    switch (area) {
      case 'Restaurante':
        this.desRestaurante = promedioPerformance;
        this.numRestaurante = empleados.length;
        break;
      case 'Recepcion':
        this.desRecepcion = promedioPerformance;
        this.numRecepcion = empleados.length;
        break;
      case 'Hospedaje':
        this.desHospedaje = promedioPerformance;
        this.numHospedaje = empleados.length;
        break;
      default:
        break;
    }
  } 

  redirigir(link: number) {
    this.router.navigate(['/login']);
  }
}
