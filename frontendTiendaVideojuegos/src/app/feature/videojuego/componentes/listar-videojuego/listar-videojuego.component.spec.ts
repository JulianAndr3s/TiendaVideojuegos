import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarVideojuegoComponent } from './listar-videojuego.component';

describe('ListarVideojuegoComponent', () => {
  let component: ListarVideojuegoComponent;
  let fixture: ComponentFixture<ListarVideojuegoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListarVideojuegoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarVideojuegoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
