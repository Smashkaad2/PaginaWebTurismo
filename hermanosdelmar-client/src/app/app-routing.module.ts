import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpleadoViewComponent } from './modules/empleado-view/empleado-view.component';
import { LoginComponent } from './modules/page/login/login.component';
import { AppComponent } from './app.component';
import { AdminAreasComponent } from './modules/admin/admin-areas/admin-areas.component';
import { PrincipalComponent } from './modules/jefe/principal/principal.component';
import { EncuestaComponent } from './modules/jefe/encuesta/encuesta.component';
import { AsignarCursoComponent } from './modules/jefe/asignar-curso/asignar-curso.component';
import { AdminCrearEmpleadoComponent } from './modules/admin/admin-crear-empleado/admin-crear-empleado.component';
import { EmpleadoInicioComponent } from './modules/empleado/empleado-inicio/empleado-inicio.component';

const routes: Routes = [
  {path: 'empleado-lista', component: EmpleadoViewComponent},
  {path: 'login', component: LoginComponent},
  {path: 'empleados', component: AdminAreasComponent},
  {path: 'jefemain', component:PrincipalComponent},
  {path: 'encuesta', component:EncuestaComponent},
  {path: 'asignar-curso', component:AsignarCursoComponent},
  {path: 'empleadomain', component:EmpleadoViewComponent},
  {path: 'crear_empleado', component: AdminCrearEmpleadoComponent},
  {path: 'empleado-main', component: EmpleadoInicioComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})


export class AppRoutingModule { }
