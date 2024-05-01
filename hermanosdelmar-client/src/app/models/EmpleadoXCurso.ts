import { Curso } from "./Curso";
import { Empleado } from "./Empleado";

export class EmpleadoXCurso {
  constructor(
    public id: number,
    public nombreCurso: string,
    public cercaniaValoracion: number,
    public empleado: Empleado,
    public curso: Curso
  ) {}
}

