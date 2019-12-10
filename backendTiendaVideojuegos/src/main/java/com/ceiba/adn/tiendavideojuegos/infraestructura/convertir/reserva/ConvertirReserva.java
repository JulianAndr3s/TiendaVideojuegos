package com.ceiba.adn.tiendavideojuegos.infraestructura.convertir.reserva;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Reserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ReservaDTO;
import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.ReservaEntidad;

@Component
public class ConvertirReserva {

	private ModelMapper modelMapper = new ModelMapper();
	
	public ReservaEntidad convertirReservaDominioAReservaEntidad(Reserva reserva){
        return modelMapper.map(reserva, ReservaEntidad.class);
	}
	
	public ReservaDTO convertirReservaEntidadAReservaDTO(ReservaEntidad reservaEntidad) {
		return modelMapper.map(reservaEntidad, ReservaDTO.class);
	}

    public List<ReservaDTO> convertirListaReservaEntidadAListaReserva(List<ReservaEntidad> listaReservaEntidad, List<ReservaDTO> listaReserva){
        for(ReservaEntidad reservaEntidad: listaReservaEntidad) {
        	ReservaDTO reserva = modelMapper.map(reservaEntidad, ReservaDTO.class);
            listaReserva.add(reserva);
        }
        return listaReserva;
    }
	
}
