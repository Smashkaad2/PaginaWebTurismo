import { Component } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})

export class HeaderComponent {

  constructor(private router: Router) { }

  redirectToLoginPage() {
    // Redirige a la página de inicio de sesión
    this.router.navigate(['/login']);
  }
}
