package com.ceiba.adn.tiendavideojuegos.infraestructura.integracion.controlador;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.transaction.Transactional;

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
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoReserva;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Cliente;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.infraestructura.adaptador.repositorio.RepositorioClientePostgres;
import com.ceiba.adn.tiendavideojuegos.infraestructura.adaptador.repositorio.RepositorioVideojuegoPostgres;
import com.ceiba.adn.tiendavideojuegos.infraestructura.repositoriojpa.RepositorioClienteJpa;
import com.ceiba.adn.tiendavideojuegos.infraestructura.repositoriojpa.RepositorioVideojuegoJpa;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.ClienteTestDataBuilder;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.VideojuegoTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BackendTiendaVideojuegosApplication.class)
@AutoConfigureMockMvc
@TestPropertySource("/test.properties")
class ControladorReservaTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Autowired
	private RepositorioClienteJpa repositorioClienteJpa;
	
	@Autowired
	private RepositorioVideojuegoJpa repositorioVideojuegoJpa;


	@Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }
	
	@Test
	@Transactional
	public void crearReservaTest() throws Exception {
		Videojuego videojuego = new VideojuegoTestDataBuilder().build();
		RepositorioVideojuegoPostgres repositorioVideojuegoPostgres = new RepositorioVideojuegoPostgres(repositorioVideojuegoJpa);
		
		repositorioVideojuegoPostgres.crearVideojuego(videojuego);
		
		Cliente cliente = new ClienteTestDataBuilder().build();
		RepositorioClientePostgres repositorioClientePostgres = new RepositorioClientePostgres(repositorioClienteJpa);
		
		repositorioClientePostgres.crearCliente(cliente);
		
		ComandoReserva comandoReserva = new ComandoReserva(1L,cliente,videojuego);
		
		mockMvc.perform(post("/reserva")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comandoReserva)))
				.andDo(print())
				.andExpect(status().isOk());
		
	}

	@Test
	public void listarReservaTest() throws Exception {

		mockMvc.perform(get("/reserva")
				.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk());
	}

}
