package com.ceiba.adn.tiendavideojuegos.infraestructura.convertir.cliente;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.ClienteEntidad;

@Component
public class ConvertirCliente {
	
	@Autowired
	private ModelMapper modelMapper;
	
    public ClienteEntidad convertirClienteDominioAClienteEntidad(Cliente cliente){
        return modelMapper.map(cliente, ClienteEntidad.class);
    }

    public List<ClienteDTO> convertirListaClienteEntidadAListaCliente(List<ClienteEntidad> listaClienteEntidad, List<ClienteDTO> listaCliente){
        for(ClienteEntidad clienteEntidad: listaClienteEntidad) {
        	ClienteDTO cliente = modelMapper.map(clienteEntidad, ClienteDTO.class);
            listaCliente.add(cliente);
        }
        return listaCliente;
    }

}
