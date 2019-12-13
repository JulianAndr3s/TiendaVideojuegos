import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from '../../../cliente/shared/modelo/cliente';
import { ClienteService } from '../../../cliente/shared/servicios/cliente.service';
import { Videojuego } from '../../../videojuego/shared/modelo/videojuego';
import { VideojuegoService } from '../../../videojuego/shared/servicios/videojuego.service';
import { Reserva } from '../../shared/modelo/reserva';
import { ReservaService } from '../../shared/servicios/reserva.service';

@Component({
  selector: 'app-crear-reserva',
  templateUrl: './crear-reserva.component.html',
  styleUrls: ['./crear-reserva.component.css']
})
export class CrearReservaComponent implements OnInit {

  public videojuego: Videojuego = new Videojuego();
  public videojuegos: Videojuego[];
  public cliente: Cliente = new Cliente();
  public clientes: Cliente[];
  public idCliente: number;
  public idVideojuego: number;
  public reserva: Reserva = new Reserva();

  // tslint:disable-next-line: max-line-length
  constructor(private clienteService: ClienteService, private videojuegoService: VideojuegoService, private reservaService: ReservaService, private router: Router) { }

  ngOnInit() {
    this.listarComponentes();
  }

  listarComponentes() {
    this.clienteService.listarClientes().subscribe(
      (cliente) => {
        this.clientes = cliente;
      }
    );

    this.videojuegoService.listarVideojuegos().subscribe(
      (videojuego) => {
        this.videojuegos = videojuego;
      }
    );
  }

  insertarReserva() {
    this.cliente.idCliente = this.idCliente;
    this.videojuego.idVideojuego = this.idVideojuego;
    this.reserva.cliente = this.cliente;
    this.reserva.videojuego = this.videojuego;
    this.reservaService.insertarReserva(this.reserva).subscribe(
      _ => {
        this.router.navigate(['/reservas']);
      }
    );
  }

}
