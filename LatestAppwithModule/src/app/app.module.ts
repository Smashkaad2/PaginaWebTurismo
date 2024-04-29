import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { ContPrincipalComponent } from './cont-principal/cont-principal.component';
import { EncuestaComponent } from './encuesta/encuesta.component';
import { UserMainPageComponent } from './user-main-page/user-main-page.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    LoginComponent,
    SignInComponent,
    SidebarComponent,
    ContPrincipalComponent,
    EncuestaComponent,
    UserMainPageComponent
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
