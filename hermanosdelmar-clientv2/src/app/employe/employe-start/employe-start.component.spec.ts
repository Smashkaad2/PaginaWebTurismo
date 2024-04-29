import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeStartComponent } from './employe-start.component';

describe('EmployeStartComponent', () => {
  let component: EmployeStartComponent;
  let fixture: ComponentFixture<EmployeStartComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmployeStartComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EmployeStartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
