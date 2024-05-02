import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminAreasComponent } from './admin-areas.component';

describe('AdminAreasComponent', () => {
  let component: AdminAreasComponent;
  let fixture: ComponentFixture<AdminAreasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdminAreasComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminAreasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
