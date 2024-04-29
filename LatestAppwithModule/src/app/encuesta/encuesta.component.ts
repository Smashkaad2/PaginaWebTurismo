import { Component } from '@angular/core';

@Component({
  selector: 'app-encuesta',
  templateUrl: './encuesta.component.html',
  styleUrl: './encuesta.component.css'
})

export class EncuestaComponent {
  porcentaje1: number = 10; // Porcentaje de la primera barra
  porcentaje2: number = 2; // Porcentaje de la segunda barra

  questions = [
    {
      text: '¿Considera que Nombre empleado es capaz de comunicarse claramente para explicar los platos y entender las necesidades del cliente?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },
    {
      text: '¿Considera que Nombre empleado es capaz de ponerse en el lugar del cliente comprendiendo sus necesidades y preocupaciones?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },
    {
      text: '¿Considera que Nombre empleado es capaz de priorizar tareas y gestionar su tiempo?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },
    // Puedes agregar más preguntas aquí
  ];
  responses: { [key: string]: number } = {};

  saveResponse(questionIndex: number, value: number) {
    this.responses['question' + questionIndex] = value;
  }

  submitSurvey() {
    console.log('Respuestas:', this.responses);
  }

  calculateSum() {
    let sum = 0;
    for (const key in this.responses) {
      if (this.responses.hasOwnProperty(key)) {
        sum += this.responses[key];
      }
    }
    console.log('Suma de respuestas:', sum);
  }
}





