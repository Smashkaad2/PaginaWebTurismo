import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminCrearEmpleadoComponent } from './admin-crear-empleado.component';

describe('AdminCrearEmpleadoComponent', () => {
  let component: AdminCrearEmpleadoComponent;
  let fixture: ComponentFixture<AdminCrearEmpleadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdminCrearEmpleadoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminCrearEmpleadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
