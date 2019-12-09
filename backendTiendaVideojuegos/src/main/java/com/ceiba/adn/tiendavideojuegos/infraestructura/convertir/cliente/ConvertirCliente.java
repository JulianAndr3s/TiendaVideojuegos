package com.ceiba.adn.tiendavideojuegos.infraestructura.convertir.cliente;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.ClienteEntidad;

@Component
public class ConvertirCliente {
	
	private ModelMapper modelMapper = new ModelMapper();

    public List<ClienteDTO> convertirListaClienteEntidadAListaCliente(List<ClienteEntidad> listaClienteEntidad, List<ClienteDTO> listaCliente){
        for(ClienteEntidad clienteEntidad: listaClienteEntidad) {
        	ClienteDTO cliente = modelMapper.map(clienteEntidad, ClienteDTO.class);
            listaCliente.add(cliente);
        }
        return listaCliente;
    }

}
