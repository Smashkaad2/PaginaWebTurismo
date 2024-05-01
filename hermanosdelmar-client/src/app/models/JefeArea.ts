import { Negocio } from "./Negocio";
import { Empleado } from "./Empleado";

export class JefeArea {
  constructor(
    public id: number,
    public nombreJefe: string,
    public rol: string,
    public areaNombre: string,
    public empleados: Empleado[],
    public jefesAreaenNegocio: Negocio
  ) {}
}

  
