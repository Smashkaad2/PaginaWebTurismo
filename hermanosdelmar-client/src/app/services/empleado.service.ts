import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EmpleadoService {
  
  private apiUrl: string;

  constructor(private http: HttpClient) { 
    this.apiUrl =  "http://localhost:8080/empleado";
  }

  obtenerEmpleado(id: number): Observable<any>{
    return this.http.get(`${this.apiUrl}/${id}`);
  }
}
