import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SingInStartComponent } from './sign-in/sing-in-start/sing-in-start.component';
import { SingInEmpleadoComponent } from './sing-in/sing-in-empleado/sing-in-empleado.component';
import { EmployeStartComponent } from './employe/employe-start/employe-start.component';

@NgModule({
  declarations: [
    AppComponent,
    SingInStartComponent,
    SingInEmpleadoComponent,
    EmployeStartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
