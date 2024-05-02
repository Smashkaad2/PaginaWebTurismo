import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmpleadoViewComponent } from './modules/empleado-view/empleado-view.component';
import { FooterComponent } from './modules/page/footer/footer.component';
import { HeaderComponent } from './modules/page/header/header.component';
import { SidebarComponent } from './modules/page/sidebar/sidebar.component';
import { AdminAreasComponent } from './modules/admin/admin-areas/admin-areas.component';
import { AdminCrearEmpleadoComponent } from './modules/admin/admin-crear-empleado/admin-crear-empleado.component';
import { AsignarCursoComponent } from './modules/jefe/asignar-curso/asignar-curso.component';
import { PrincipalComponent } from './modules/jefe/principal/principal.component';
import { EncuestaComponent } from './modules/jefe/encuesta/encuesta.component';
import { LoginComponent } from './modules/page/login/login.component';
import { EmpleadoInicioComponent } from './modules/empleado/empleado-inicio/empleado-inicio.component';
import { CommonModule } from '@angular/common';
// import { AuthService } from './services/auth.service';

@NgModule({
  declarations: [
    AppComponent,
    EmpleadoViewComponent,
    FooterComponent,
    HeaderComponent,
    SidebarComponent,
    AdminAreasComponent,
    AdminCrearEmpleadoComponent,
    AsignarCursoComponent,
    PrincipalComponent,
    EncuestaComponent,
    LoginComponent,
    EmpleadoInicioComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    CommonModule
  ],
  providers: [
    provideClientHydration()
    // AuthService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
