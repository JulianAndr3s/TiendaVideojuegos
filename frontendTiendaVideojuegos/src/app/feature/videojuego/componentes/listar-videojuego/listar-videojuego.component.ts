import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgModule } from '@angular/core';
import { Videojuego } from '../../shared/modelo/videojuego';
import { VideojuegoService } from '../../shared/servicios/videojuego.service';

@Component({
  selector: 'app-listar-videojuego',
  templateUrl: './listar-videojuego.component.html',
  styleUrls: ['./listar-videojuego.component.css']
})
export class ListarVideojuegoComponent implements OnInit {

  public videojuego: Videojuego = new Videojuego();
  public videojuegoActualizar: Videojuego = new Videojuego();
  public videojuegoSeleccionado: Videojuego;
  public videojuegos: Videojuego[];

  constructor(private videojuegoService: VideojuegoService, private router: Router) { }

  ngOnInit() {
    this.listarVideojuegos();
  }

  listarVideojuegos() {
    this.videojuegoService.listarVideojuegos().subscribe(
      (videojuego) => {
        this.videojuegos = videojuego;
      }
    );
  }

  mostrarModal(videojuego: Videojuego) {
    this.videojuegoSeleccionado = videojuego;
  }

  eliminarVideojuego(nombre: string) {
    this.videojuegoService.eliminarVideojuego(nombre).subscribe(
      _ => (
        this.videojuegos = this.videojuegos.filter(videojuego => videojuego !== this.videojuegoSeleccionado)
      )
    );
  }

  actualizarVideojuego(idActualizar: number) {
    this.videojuegoActualizar.nombre = this.videojuegoSeleccionado.nombre;
    this.videojuegoService.actualizarVideojuego(this.videojuegoActualizar, idActualizar).subscribe(
      _ => {
        this.listarVideojuegos();
      }
    );
  }

}
