import { Component } from '@angular/core';
import { EmpleadoService } from '../../../services/empleado.service';
import { Empleado } from '../../../models/Empleado';
import { Router } from '@angular/router';

@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html',
  styleUrl: './principal.component.css'
})
export class PrincipalComponent {
  users: Empleado[] = [];
  currentArea: string = 'Restaurante';
  puntajeArea: number = 0;
  numEmpleados: number = 0;

  constructor(private empleadoService: EmpleadoService,private router: Router) { }

  setCurrentArea(username: string): void {
    this.currentArea = username;
  }

  getCurrentArea(): string {
    return this.currentArea;
  }

  ngOnInit(): void {
    this.obtenerEmpleados();
  }

  obtenerEmpleados() {
    this.empleadoService.obtenerEmpleados().subscribe(
      (empleados: Empleado[]) => {
        this.users = empleados.filter(empleado => empleado.area === this.currentArea);
        this.calcularDesempehno(this.users, 'Restaurante');
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

    this.puntajeArea = promedioPerformance;
    this.numEmpleados = empleados.length;
  }

  redirigir() {
    this.router.navigate(['/encuesta']);
  }
}
