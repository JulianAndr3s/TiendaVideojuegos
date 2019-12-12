import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './feature/home/home.component';
import { CrearVideojuegoComponent } from './feature/videojuego/componentes/crear-videojuego/crear-videojuego.component';
import { CabeceraComponent } from './shared/componentes/cabecera/cabecera.component';
import { PiePaginaComponent } from './shared/componentes/pie-pagina/pie-pagina.component';
import { ListarVideojuegoComponent } from './feature/videojuego/componentes/listar-videojuego/listar-videojuego.component';
import { CrearClienteComponent } from './feature/cliente/componentes/crear-cliente/crear-cliente.component';
import { ListarClienteComponent } from './feature/cliente/componentes/listar-cliente/listar-cliente.component';
import { CrearReservaComponent } from './feature/reserva/componentes/crear-reserva/crear-reserva.component';
import { ListarReservaComponent } from './feature/reserva/componentes/listar-reserva/listar-reserva.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CrearVideojuegoComponent,
    CabeceraComponent,
    PiePaginaComponent,
    ListarVideojuegoComponent,
    CrearClienteComponent,
    ListarClienteComponent,
    CrearReservaComponent,
    ListarReservaComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
