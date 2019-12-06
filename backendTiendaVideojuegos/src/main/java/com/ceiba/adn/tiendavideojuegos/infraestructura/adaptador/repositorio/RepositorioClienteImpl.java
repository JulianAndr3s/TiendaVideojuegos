package com.ceiba.adn.tiendavideojuegos.infraestructura.adaptador.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto.ClienteDTO;
import com.ceiba.adn.tiendavideojuegos.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.tiendavideojuegos.infraestructura.convertir.cliente.ConvertirCliente;
import com.ceiba.adn.tiendavideojuegos.infraestructura.entidad.ClienteEntidad;
import com.ceiba.adn.tiendavideojuegos.infraestructura.repositoriojpa.RepositorioClienteJpa;

@Repository
public class RepositorioClienteImpl implements RepositorioCliente {

	private ModelMapper modelMapper = new ModelMapper();
	private RepositorioClienteJpa repositorioClienteJpa;
	private ConvertirCliente convertirCliente = new ConvertirCliente();
	
	public RepositorioClienteImpl (RepositorioClienteJpa repositorioClienteJpa) {
		this.repositorioClienteJpa = repositorioClienteJpa;
	}
	
	@Override
	public void crearCliente(Cliente cliente) {
		ClienteEntidad clienteEntidadCrear = modelMapper.map(cliente, ClienteEntidad.class);
		repositorioClienteJpa.save(clienteEntidadCrear);
	}

	@Override
	public List<ClienteDTO> listarClientes() {
		List<ClienteEntidad> listaClienteEntidad = repositorioClienteJpa.findAll();
		List<ClienteDTO> listaClienteDTO = new ArrayList<>();
		return convertirCliente.convertirListaClienteEntidadAListaCliente(listaClienteEntidad, listaClienteDTO);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		ClienteEntidad clienteEntidadActualizar = modelMapper.map(cliente, ClienteEntidad.class);
		repositorioClienteJpa.save(clienteEntidadActualizar);
	}

	@Override
	public void eliminarCliente(Long idCliente) {
		repositorioClienteJpa.deleteById(idCliente);
	}

	@Override
	public ClienteDTO buscarPorId(Long idCliente) {
		ClienteEntidad clienteEntidad = repositorioClienteJpa.findById(idCliente).orElse(null);
		if(clienteEntidad != null) {
			return modelMapper.map(clienteEntidad, ClienteDTO.class);
		}
		else {
			return null;
		}
	}

	@Override
	public ClienteDTO buscarPorCedula(String cedula) {
		ClienteEntidad clienteEntidad = repositorioClienteJpa.findByCedula(cedula);
		if(clienteEntidad != null) {
			return modelMapper.map(clienteEntidad, ClienteDTO.class);
		}
		else {
			return null;
		}
	}
	
	@Override
	public boolean existeCliente(Cliente cliente) {
		String cedulaCliente = cliente.getCedula();
		return (repositorioClienteJpa.findByCedula(cedulaCliente)) != null;
	}

}
