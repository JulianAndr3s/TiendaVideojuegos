package com.ceiba.adn.tiendavideojuegos.infraestructura.convertir.videojuego;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.VideojuegoDTO;
import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.VideojuegoEntidad;

@Component
public class ConvertirVideojuego {
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public VideojuegoEntidad convertirVideojuegoDominioAVideojuegoEntidad(Videojuego videojuego){
        return modelMapper.map(videojuego, VideojuegoEntidad.class);
	}
	
	public VideojuegoDTO convertirVideojuegoEntidadAVideojuegoDTO(VideojuegoEntidad videojuegoEntidad) {
		return modelMapper.map(videojuegoEntidad, VideojuegoDTO.class);
	}

    public List<VideojuegoDTO> convertirListaVideojuegoEntidadAListaVideojuego(List<VideojuegoEntidad> listaVideojuegoEntidad, List<VideojuegoDTO> listaVideojuego){
        for(VideojuegoEntidad videojuegoEntidad: listaVideojuegoEntidad) {
        	VideojuegoDTO videojuego = modelMapper.map(videojuegoEntidad, VideojuegoDTO.class);
            listaVideojuego.add(videojuego);
        }
        return listaVideojuego;
    }

}
