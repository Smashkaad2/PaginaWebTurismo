import { Component } from '@angular/core';

@Component({
  selector: 'app-encuesta',
  templateUrl: './encuesta.component.html',
  styleUrl: './encuesta.component.css'
})
export class EncuestaComponent {
  porcentaje1: number = 10; // Porcentaje de la primera barra
  porcentaje2: number = 2; // Porcentaje de la segunda barra
  nombreEmpleado: string = 'Jorge martinez'

  questions = [
    {
      text: '¿Considera que ' + this.nombreEmpleado + ' es capaz de comunicarse claramente para explicar los platos y entender las necesidades del cliente?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    }
  ]

  habilidadesBlandas =[
    {
      text: '¿Considera que ' + this.nombreEmpleado + ' tiene una actitud amigable y acogedora para recibir a los huéspedes y atender sus necesidades del huesped?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },{
      text: '¿Considera que ' + this.nombreEmpleado + ' es capaz de comprender y empatizar con las preocupaciones y solicitudes de los huéspedes para ofrecer soluciones satisfactorias a sus problemas?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },{
      text: '¿Considera que ' + this.nombreEmpleado + ' puede comunicarse de manera clara y efectiva, tanto verbalmente como a través del lenguaje corporal, para transmitir confianza y profesionalismo a los huéspedes?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },{
      text: '¿Considera que ' + this.nombreEmpleado + ' es capaz de priorizar tareas y gestionar su tiempo de manera eficiente para atender a los huéspedes?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },{
      text: '¿Considera que ' + this.nombreEmpleado + ' puede manejar situaciones difíciles o conflictivas, como quejas de huéspedes o problemas con reservas, de manera calmada y profesional?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },{
      text: '¿Considera que ' + this.nombreEmpleado + ' es capaz de colaborar con otros miembros del equipo, como personal de limpieza y conserjería, para garantizar una experiencia fluida para los huéspedes?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },{
      text: '¿Considera que ' + this.nombreEmpleado + ' puede adaptarse a situaciones cambiantes y resolver problemas de manera creativa, especialmente durante situaciones de alta demanda o emergencias?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },{
      text: '¿Considera que ' + this.nombreEmpleado + ' tiene las herramientas necesarias para gestionar su estabilidad emocional?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    }
  ]
  preguntaRestaurante = [
    {
      text: '¿Considera que ' + this.nombreEmpleado + ' es capaz de comunicarse claramente para explicar los platos y entender las necesidades del cliente?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },
    {
      text: '¿Considera que ' + this.nombreEmpleado + ' es capaz de ponerse en el lugar del cliente comprendiendo sus necesidades y preocupaciones?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },
    {
      text: '¿Considera que ' + this.nombreEmpleado + ' es capaz de priorizar tareas y gestionar su tiempo?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    },
    {
      text: '¿Considera que ' + this.nombreEmpleado + ' trabajar satisfactoriamente con otros miembros del equipo?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    }, {
      text: '¿Considera que ' + this.nombreEmpleado + ' es capaz de gestionar quejas de los clientes o problemas con los pedidos de forma profesional y eficaz?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    }, {
      text: '¿Considera que ' + this.nombreEmpleado + ' es capaz de alcanzar el numero ventas previstas durante el día?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    }, {
      text: '¿Considera que ' + this.nombreEmpleado + ' es capaz de adaptarse a situaciones cambiantes como un aumento inesperado de clientes, cambios en el menú y demás?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    }, {
      text: '¿Considera que ' + this.nombreEmpleado + ' tiene las herramientas necesarias para gestionar su estabilidad emocional?',
      options: [
        { label: 'Muy de acuerdo', value: 5 },
        { label: 'De acuerdo', value: 4 },
        { label: 'Neutral', value: 3 },
        { label: 'En desacuerdo', value: 2 },
        { label: 'Muy en desacuerdo', value: 1 }
      ]
    }
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
