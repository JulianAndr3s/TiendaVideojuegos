import { Injectable } from '@angular/core';
import { Cliente } from '../modelo/cliente';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Endpoints } from '../../../../shared/constantes/endpoints';
import { Header } from '../../../../shared/constantes/header';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor(private http: HttpClient) { }

  listarClientes(): Observable<Cliente[]> {
    return this.http.get<Cliente[]>(Endpoints.CLIENTE);
  }

  insertarCliente(cliente: Cliente): Observable<Cliente> {
    return this.http.post<Cliente>(Endpoints.CLIENTE, cliente, {headers: Header.HEADER_JSON});
  }

  eliminarCliente(cedula: string) {
    return this.http.delete<Cliente>(Endpoints.CLIENTE.concat('/').concat(cedula), {headers: Header.HEADER_TEXT});
  }

  actualizarCliente(cliente: Cliente, id: number) {
    return this.http.put<Cliente>(Endpoints.CLIENTE.concat('/').concat(id.toString()), cliente, {headers: Header.HEADER_JSON} );
  }
}
