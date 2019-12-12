import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EliminarVideojuegoComponent } from './eliminar-videojuego.component';

describe('EliminarVideojuegoComponent', () => {
  let component: EliminarVideojuegoComponent;
  let fixture: ComponentFixture<EliminarVideojuegoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EliminarVideojuegoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EliminarVideojuegoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
