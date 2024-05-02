import { Injectable } from '@angular/core';
import { Empleado } from '../models/Empleado';


@Injectable({
  providedIn: 'root'
})
export class AuthService {
  empleado: Empleado | null = null;

  constructor() { }

  iniciarSesion(empleado: Empleado) {
    this.empleado = empleado;
  }

  cerrarSesion() {
    this.empleado = null;
  }

  // Método para obtener el empleado actualmente autenticado
  getEmpleado(): Empleado | null {
    return this.empleado;
  }
}