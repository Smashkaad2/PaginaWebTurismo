import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SingInStartComponent } from './sing-in-start.component';

describe('SingInStartComponent', () => {
  let component: SingInStartComponent;
  let fixture: ComponentFixture<SingInStartComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SingInStartComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SingInStartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
