import { TestBed } from '@angular/core/testing';

import { VideojuegoService } from './videojuego.service';

describe('VideojuegoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: VideojuegoService = TestBed.get(VideojuegoService);
    expect(service).toBeTruthy();
  });
});
