import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Endpoints } from '../../../../shared/constantes/endpoints';
import { Header } from '../../../../shared/constantes/header';
import { Videojuego } from '../modelo/videojuego';

@Injectable({
  providedIn: 'root'
})
export class VideojuegoService {

  constructor(private http: HttpClient) { }

  listarVideojuegos(): Observable<Videojuego[]> {
    return this.http.get<Videojuego[]>(Endpoints.VIDEOJUEGO);
  }

  insertarVideojuego(videojuego: Videojuego): Observable<Videojuego> {
    return this.http.post<Videojuego>(Endpoints.VIDEOJUEGO, videojuego, {headers: Header.HEADER_JSON});
  }

  eliminarVideojuego(nombre: string) {
    return this.http.delete<Videojuego>(Endpoints.VIDEOJUEGO.concat('/').concat(nombre), {headers: Header.HEADER_TEXT});
  }

  actualizarVideojuego(videojuego: Videojuego, id: number) {
    return this.http.put<Videojuego>(Endpoints.VIDEOJUEGO.concat('/').concat(id.toString()), videojuego, {headers: Header.HEADER_JSON} );
  }

}
