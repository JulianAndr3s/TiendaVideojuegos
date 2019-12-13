import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule} from '@angular/forms';
import { CommonModule } from '@angular/common';

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
import { ClienteService } from './feature/cliente/shared/servicios/cliente.service';

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
    CommonModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ClienteService],
  bootstrap: [AppComponent]
})
export class AppModule { }
