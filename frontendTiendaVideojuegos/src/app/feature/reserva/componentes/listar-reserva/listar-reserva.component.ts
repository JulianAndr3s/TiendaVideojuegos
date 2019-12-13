import { Component, OnInit } from '@angular/core';
import { ReservaService } from '../../shared/servicios/reserva.service';
import { Reserva } from '../../shared/modelo/reserva';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listar-reserva',
  templateUrl: './listar-reserva.component.html',
  styleUrls: ['./listar-reserva.component.css']
})
export class ListarReservaComponent implements OnInit {

  public reserva: Reserva = new Reserva();
  public reservas: Reserva[];
  public reservaSeleccionada: Reserva;
  constructor(private reservaService: ReservaService, private router: Router) { }

  ngOnInit() {
    this.listarReservas();
  }

  listarReservas() {
    this.reservaService.listarReservas().subscribe(
      (reserva) => {
        this.reservas = reserva;
      }
    );
  }

  mostrarModal(reserva: Reserva) {
    this.reservaSeleccionada = reserva;
  }

  eliminarReserva(id: number) {
    this.reservaService.eliminarReserva(id).subscribe(
      _ => (
        this.reservas = this.reservas.filter(reserva => reserva !== this.reservaSeleccionada)
      )
    );
  }
}
