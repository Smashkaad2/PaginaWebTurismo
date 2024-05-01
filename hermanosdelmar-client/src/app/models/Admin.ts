import { Negocio } from "./Negocio";

export class Admin {
    constructor(
      public id: number,
      public nombreAdmin: string,
      public rol: string,
      public negocio: Negocio
    ) {}
  }
  

  