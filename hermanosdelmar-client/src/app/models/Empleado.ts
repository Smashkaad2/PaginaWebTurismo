import { EmpleadoXCurso } from "./EmpleadoXCurso";
import { JefeArea } from "./JefeArea";

export class Empleado {
    constructor(
      public id: number,
      public nombreEmpleado: string,
      public correo: string,
      public fechaContrato: string,
      public area: string,
      public rol: string,
      public performance: number,
      public valoracion: number,
      public numCursos: number,
      public cursosCursados: number,
      public cursos: EmpleadoXCurso[],
      public empleadosJefeArea: JefeArea
    ) {}
  }
