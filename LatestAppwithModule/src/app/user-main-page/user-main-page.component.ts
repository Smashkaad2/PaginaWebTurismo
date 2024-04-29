import { Component } from '@angular/core';

@Component({
  selector: 'app-user-main-page',
  templateUrl: './user-main-page.component.html',
  styleUrl: './user-main-page.component.css'
})
export class UserMainPageComponent {

  items = [
    { num: 1, titulo: 'Comunicación Efectiva y Asertiva', habilidad: 'Comunicación afectiva' , horas: '2 h 12 m', estado: 'En curso', link:'https://www.udemy.com/course/el-arte-de-comunicar/'},
    { num: 2, titulo: 'Comunicación Empática', habilidad: 'Empatía' , horas: '12 m', estado: 'Completado',link:'https://www.udemy.com/course/comunicacion-empatica/'},
    { num: 3, titulo: 'Gestión inteligente del tiempo (Productividad)', habilidad: 'Gestión del tiempo' , horas: '2 h 12 m', estado: 'En curso',link:'https://www.udemy.com/course/gestioninteligentedeltiempo/'},
    { num: 4, titulo: 'Trabajo en Equipo', habilidad: 'Trabajo en equipo' , horas: '10 h', estado: 'Completado',link:'https://www.udemy.com/course/trabajo-en-equipo/'},
    { num: 5, titulo: 'Resolución de problemas', habilidad: 'Comunicación afectiva' , horas: '2 h 12 m', estado: 'En curso',link:'https://www.udemy.com/course/trabajo-en-equipo/'},

  ];


  redirigir(link: string) {
    window.open(link, '_blank');
  }
}
