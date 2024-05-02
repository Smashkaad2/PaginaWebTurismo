import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpleadoInicioComponent } from './empleado-inicio.component';

describe('EmpleadoInicioComponent', () => {
  let component: EmpleadoInicioComponent;
  let fixture: ComponentFixture<EmpleadoInicioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmpleadoInicioComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EmpleadoInicioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
