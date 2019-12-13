import { Cliente } from '../../../cliente/shared/modelo/cliente';
import { Videojuego } from '../../../videojuego/shared/modelo/videojuego';

export class Reserva {
    idReserva: number;
    cliente = new Cliente();
    videojuego = new Videojuego();
}
