import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgModule } from '@angular/core';
import { Cliente } from '../../shared/modelo/cliente';
import { ClienteService } from '../../shared/servicios/cliente.service';


@Component({
  selector: 'app-listar-cliente',
  templateUrl: './listar-cliente.component.html',
  styleUrls: ['./listar-cliente.component.css']
})
export class ListarClienteComponent implements OnInit {


  public cliente: Cliente = new Cliente();
  public clienteActualizar: Cliente = new Cliente();
  public clienteSeleccionado: Cliente;
  public clientes: Cliente[];

  constructor(private clienteService: ClienteService, private router: Router) { }

  ngOnInit() {
    this.listarClientes();
  }

  listarClientes() {
    this.clienteService.listarClientes().subscribe(
      (cliente) => {
        this.clientes = cliente;
      }
    );
  }

  mostrarModal(cliente: Cliente) {
    this.clienteSeleccionado = cliente;
  }

  eliminarCliente(cedula: string) {
    this.clienteService.eliminarCliente(cedula).subscribe(
      _ => (
        this.clientes = this.clientes.filter(cliente => cliente !== this.clienteSeleccionado)
      )
    );
  }

  actualizarCliente(idActualizar: number) {
    this.clienteActualizar.cedula = this.clienteSeleccionado.cedula;
    this.clienteService.actualizarCliente(this.clienteActualizar, idActualizar).subscribe(
      _ => {
        this.listarClientes();
      }
    );
  }

}
