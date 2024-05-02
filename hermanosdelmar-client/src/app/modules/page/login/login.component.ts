import { Component } from '@angular/core';
import { Empleado } from '../../../models/Empleado';
import { Router } from '@angular/router';
import { EmpleadoService } from '../../../services/empleado.service';
// import { AuthService } from '../../../services/auth.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  correo: string = '';
  contrasena: string = '';
  error: string ='';
  empleados: Empleado[] = [];
  salida: string ='empleado';
  // authService: AuthService = AuthService.constructor();

  constructor(private router: Router, private empleadoService: EmpleadoService) { }

  ngOnInit(): void {
    this.obtenerEmpleados();
  }

  obtenerEmpleados() {
    this.empleadoService.obtenerEmpleados().subscribe(
      (empleados: Empleado[]) => {
        this.empleados = empleados;
      },
      error => {
        console.error('Error al obtener empleados:', error);
      }
    );
  }

  iniciarSesion() {
    // Verificar si existe un empleado con el correo y contraseña proporcionados
    const empleado = this.empleados.find(emp => emp.correo === this.correo //&& emp.contrasena === this.contrasena

    );
    if (empleado) {
      this.error='';
      // Redirigir al empleado según el área
      
      switch (this.salida) {
        case 'admin':
          this.router.navigate(['/empleados']);
          // this.authService.iniciarSesion(empleado);
          break;
        case 'jefe':
          this.router.navigate(['/jefemain']);
          // this.authService.iniciarSesion(empleado);
          break;
        case 'empleado':
          this.router.navigate(['/empleadomain']);
          // this.authService.iniciarSesion(empleado);
          break;
        default:
          console.error('Área no válida:', empleado.area);
          break;
      }
    } else {
      this.error="Inicio de sesión fallido. Verifique el correo y la contraseña.";
    }
  }
}
