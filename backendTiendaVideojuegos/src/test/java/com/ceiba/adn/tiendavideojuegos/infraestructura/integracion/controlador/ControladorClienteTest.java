package com.ceiba.adn.tiendavideojuegos.infraestructura.integracion.controlador;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ceiba.adn.tiendavideojuegos.BackendTiendaVideojuegosApplication;
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoCliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.infraestructura.adaptador.repositorio.RepositorioClienteImpl;
import com.ceiba.adn.tiendavideojuegos.infraestructura.repositoriojpa.RepositorioClienteJpa;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.aplicacion.comando.ComandoClienteTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BackendTiendaVideojuegosApplication.class)
@AutoConfigureMockMvc
@TestPropertySource("/test.properties")
class ControladorClienteTest {

	private static final Long ID_PARA_TEST = 1L;
	private static final Long ID_PARA_TEST_FALLAR = 2L;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Autowired
	private RepositorioClienteJpa repositorioClienteJpa;
	
	@Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }
	
	@Test
	void crearClienteTest() throws Exception {
		ComandoCliente comandoCliente = new ComandoClienteTestDataBuilder().build();
		mockMvc.perform(post("/cliente/crear")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comandoCliente)))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	void eliminarClienteTest() throws Exception {
		RepositorioClienteImpl repositorioClienteImpl = new RepositorioClienteImpl(repositorioClienteJpa);
		Cliente cliente = new Cliente(1L,"J","U","L","I","A","N");
		repositorioClienteImpl.crearCliente(cliente);
		mockMvc.perform(delete("/cliente/".concat((ID_PARA_TEST).toString()).concat("/eliminar"))
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(cliente)))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	void actualizarClienteTest() throws Exception {
		RepositorioClienteImpl repositorioClienteImpl = new RepositorioClienteImpl(repositorioClienteJpa);
		Cliente cliente = new Cliente(1L,"J","U","L","I","A","N");
		repositorioClienteImpl.crearCliente(cliente);
		cliente.setNombre("JULIAN");
		mockMvc.perform(put("/cliente/".concat((ID_PARA_TEST).toString()).concat("/actualizar"))
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(cliente)))
				.andDo(print())
				.andExpect(status().isOk());	
	}
	
	@Test
	void listarClienteTest() throws Exception {
		RepositorioClienteImpl repositorioClienteImpl = new RepositorioClienteImpl(repositorioClienteJpa);
		Cliente cliente = new Cliente(1L,"J","U","L","I","A","N");
		Cliente cliente2 = new Cliente(2L,"J","U","L","I","A","N");
		repositorioClienteImpl.crearCliente(cliente);
		repositorioClienteImpl.crearCliente(cliente2);
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente);
		clientes.add(cliente2);
		
		mockMvc.perform(get("/cliente/listar")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(clientes)))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	void excepcionActualizarClienteTest() throws Exception {
		RepositorioClienteImpl repositorioClienteImpl = new RepositorioClienteImpl(repositorioClienteJpa);
		Cliente cliente = new Cliente(1L,"J","U","L","I","A","N");
		repositorioClienteImpl.crearCliente(cliente);
		try {	
			mockMvc.perform(put("/cliente/".concat((ID_PARA_TEST_FALLAR).toString()).concat("/actualizar"))
					.contentType(MediaType.APPLICATION_JSON)
					.content(objectMapper.writeValueAsString(cliente)))
					.andExpect(status().isInternalServerError());
		} catch(Exception excepcionTest){
			System.out.println(excepcionTest.getCause().getMessage());
		}
	}
	
	@Test
	void excepcionEliminarClienteTest() throws Exception {
		ComandoCliente comandoCliente = new ComandoClienteTestDataBuilder().build();
		try {
			mockMvc.perform(delete("/cliente/".concat((ID_PARA_TEST).toString()).concat("/eliminar"))
					.contentType(MediaType.TEXT_PLAIN)
					.content(objectMapper.writeValueAsString(comandoCliente.getIdCliente())))
					.andExpect(status().isInternalServerError());
		} catch(Exception excepcionTest) {
			System.out.println(excepcionTest.getCause().getMessage());
		}
	}
	
	@Test
	void excepcionCrearClienteTest() throws Exception {
		RepositorioClienteImpl repositorioClienteImpl = new RepositorioClienteImpl(repositorioClienteJpa);
		Cliente cliente = new Cliente(1L,"J","U","L","I","A","N");
		repositorioClienteImpl.crearCliente(cliente);
		try {	
			mockMvc.perform(post("/cliente/crear")
					.contentType(MediaType.APPLICATION_JSON)
					.content(objectMapper.writeValueAsString(cliente)))
					.andExpect(status().isInternalServerError());
		} catch(Exception excepcionTest){
			System.out.println(excepcionTest.getCause().getMessage());
		}
	}
	
}