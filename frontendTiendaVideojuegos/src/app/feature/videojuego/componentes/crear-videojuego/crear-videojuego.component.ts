import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { VideojuegoService } from '../../shared/servicios/videojuego.service';
import { Videojuego } from '../../shared/modelo/videojuego';

@Component({
  selector: 'app-crear-videojuego',
  templateUrl: './crear-videojuego.component.html',
  styleUrls: ['./crear-videojuego.component.css']
})
export class CrearVideojuegoComponent implements OnInit {

  public videojuego: Videojuego = new Videojuego();
  constructor(private videojuegoService: VideojuegoService, private router: Router) { }

  ngOnInit() {
  }

  insertarVideojuego() {
    this.videojuegoService.insertarVideojuego(this.videojuego).subscribe(
      _ => {
        this.router.navigate(['/videojuegos']);
      }
    );
  }

}
