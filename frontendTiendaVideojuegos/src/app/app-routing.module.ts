import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './feature/home/home.component';
import { ListarClienteComponent } from './feature/cliente/componentes/listar-cliente/listar-cliente.component';
import { ListarVideojuegoComponent } from './feature/videojuego/componentes/listar-videojuego/listar-videojuego.component';
import { ListarReservaComponent } from './feature/reserva/componentes/listar-reserva/listar-reserva.component';
import { CrearClienteComponent } from './feature/cliente/componentes/crear-cliente/crear-cliente.component';
import { CrearReservaComponent } from './feature/reserva/componentes/crear-reserva/crear-reserva.component';
import { CrearVideojuegoComponent } from './feature/videojuego/componentes/crear-videojuego/crear-videojuego.component';

const routes: Routes = [
  {path: 'crear-cliente', component: CrearClienteComponent},
  {path: 'crear-reserva', component: CrearReservaComponent},
  {path: 'crear-videojuego', component: CrearVideojuegoComponent},
  {path: 'clientes', component: ListarClienteComponent},
  {path: 'videojuegos', component: ListarVideojuegoComponent},
  {path: 'reservas', component: ListarReservaComponent},
  {path: 'principal', component: HomeComponent},
  {path: '**', pathMatch: 'full', redirectTo: 'principal'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
