import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpleadoViewComponent } from './modules/empleado-view/empleado-view.component';

const routes: Routes = [
  {
    path: 'empleado-lista',component: EmpleadoViewComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
