import { Admin } from "./Admin";
import { JefeArea } from "./JefeArea";

export class Negocio {
    constructor(
      public id: number,
      public nombreNegocio: string,
      public direccion: string,
      public admin: Admin,
      public jefesdeArea: JefeArea[]
    ) {}
  }
  
 