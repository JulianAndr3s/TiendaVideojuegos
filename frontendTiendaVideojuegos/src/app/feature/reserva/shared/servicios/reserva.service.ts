import { Injectable } from '@angular/core';
import { Reserva } from '../modelo/reserva';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Endpoints } from '../../../../shared/constantes/endpoints';
import { Header } from '../../../../shared/constantes/header';

@Injectable({
  providedIn: 'root'
})
export class ReservaService {

  constructor(private http: HttpClient) { }

  listarReservas(): Observable<Reserva[]> {
    return this.http.get<Reserva[]>(Endpoints.RESERVA);
  }

  insertarReserva(reserva: Reserva): Observable<Reserva> {
    return this.http.post<Reserva>(Endpoints.RESERVA, reserva, {headers: Header.HEADER_JSON});
  }

  eliminarReserva(idReserva: number) {
    return this.http.delete<Reserva>(Endpoints.RESERVA.concat('/').concat(idReserva.toString()), {headers: Header.HEADER_TEXT});
  }
}
