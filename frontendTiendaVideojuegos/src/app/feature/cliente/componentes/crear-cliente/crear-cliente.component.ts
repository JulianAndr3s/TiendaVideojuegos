import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ClienteService } from '../../shared/servicios/cliente.service';
import { Cliente } from '../../shared/modelo/cliente';

@Component({
  selector: 'app-crear-cliente',
  templateUrl: './crear-cliente.component.html',
  styleUrls: ['./crear-cliente.component.css']
})
export class CrearClienteComponent implements OnInit {

  public cliente: Cliente = new Cliente();
  constructor(private clienteService: ClienteService, private router: Router) { }

  ngOnInit() {
  }

  insertarCliente() {
    this.clienteService.insertarCliente(this.cliente).subscribe(
      _ => {
        this.router.navigate(['/clientes']);
      }
    );
  }

}
