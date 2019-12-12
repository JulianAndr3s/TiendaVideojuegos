import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ActualizarVideojuegoComponent } from './actualizar-videojuego.component';

describe('ActualizarVideojuegoComponent', () => {
  let component: ActualizarVideojuegoComponent;
  let fixture: ComponentFixture<ActualizarVideojuegoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ActualizarVideojuegoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ActualizarVideojuegoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
