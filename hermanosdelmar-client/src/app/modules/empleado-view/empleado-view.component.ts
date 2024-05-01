import { Component } from '@angular/core';
import { EmpleadoService } from '../../services/empleado.service';
import { Empleado } from '../../models/Empleado';
import { Curso } from '../../models/Curso';

@Component({
  selector: 'app-empleado-view',
  templateUrl: './empleado-view.component.html',
  styleUrl: './empleado-view.component.css'
})
export class EmpleadoViewComponent {

  cursos: Curso[] = [];

  constructor(private empleadoService: EmpleadoService){}

  ngOnInit():void {
    this.empleadoService.obtenerEmpleado(2).subscribe({
      next: (data) => {
        console.log(data);
        this.cursos = data.cursos;
      },
      error: (error) =>{
        console.log(error);
      }
    });

  }

}
