import { Component } from '@angular/core';

@Component({
  selector: 'app-asignar-curso',
  templateUrl: './asignar-curso.component.html',
  styleUrl: './asignar-curso.component.css'
})
export class AsignarCursoComponent {
  items = [
    {nombre: 'Jorge', apellido: 'Martinez' , puntaje: 10 ,cursos: 0, selected: false},
    {nombre: 'Camilo', apellido: 'Salgado' , puntaje: 92 ,cursos: 2, selected: false},
    {nombre: 'Estefania', apellido: 'Cepeda' , puntaje: 32 ,cursos: 3, selected: false}
  ];

  courses = [
    {habilidad: 'Comunicación Efectiva', titulo: 'Comunicación Efectiva y Asertiva', horas: '2h 12m', descrip: 'Aprende a comunicarte para mejorar y potenciar tus relaciones humanas', selected: false},
    {habilidad: 'Empatía', titulo: 'Comunicación Empática', horas: '6h 41m', descrip: 'taller teórico-práctico', selected: false}
  ];

  desmarcarElementos() {
    this.items.forEach(item => item.selected = false);
    this.courses.forEach(course => course.selected = false);
  }
}
