import { EmpleadoXCurso } from "./EmpleadoXCurso";

export class Curso {
    constructor(
      public id: number,
      public nombreCurso: string,
      public cercaniaValoracion: number,
      public empleados: EmpleadoXCurso[]
    ) {}
  }
