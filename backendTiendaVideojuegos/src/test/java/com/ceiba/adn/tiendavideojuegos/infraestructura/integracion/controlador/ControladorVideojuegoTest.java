package com.ceiba.adn.tiendavideojuegos.infraestructura.integracion.controlador;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
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
import com.ceiba.adn.tiendavideojuegos.aplicacion.comando.ComandoVideojuego;
import com.ceiba.adn.tiendavideojuegos.dominio.modelo.Videojuego;
import com.ceiba.adn.tiendavideojuegos.infraestructura.adaptador.repositorio.RepositorioVideojuegoPostgres;
import com.ceiba.adn.tiendavideojuegos.infraestructura.repositoriojpa.RepositorioVideojuegoJpa;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.aplicacion.comando.ComandoVideojuegoTestDataBuilder;
import com.ceiba.adn.tiendavideojuegos.testdatabuilder.dominio.modelo.VideojuegoTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BackendTiendaVideojuegosApplication.class)
@AutoConfigureMockMvc
@TestPropertySource("/test.properties")
class ControladorVideojuegoTest {

	private static final String NOMBRE_JUEGO_TEST = "FIFA20";
	private static final Long ID_PARA_TEST = 1L;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Autowired
	private RepositorioVideojuegoJpa repositorioVideojuegoJpa;
	
	@Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }
	
	@Test
	public void crearVideojuegoTest() throws Exception {
		ComandoVideojuego comandoVideojuego = new ComandoVideojuegoTestDataBuilder().build();
		
		mockMvc.perform(post("/videojuego")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comandoVideojuego)))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	public void actualizarVideojuegoTest() throws Exception {
		Videojuego videojuego = new VideojuegoTestDataBuilder().build();
		RepositorioVideojuegoPostgres repositorioVideojuegoPostgres = new RepositorioVideojuegoPostgres(repositorioVideojuegoJpa);
		
		repositorioVideojuegoPostgres.crearVideojuego(videojuego);
		

		
		mockMvc.perform(put("/videojuego/".concat(ID_PARA_TEST.toString()))
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(videojuego)))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	public void eliminarVideojuegoTest() throws Exception {
		Videojuego videojuego = new VideojuegoTestDataBuilder().build();
		
		RepositorioVideojuegoPostgres repositorioVideojuegoPostgres = new RepositorioVideojuegoPostgres(repositorioVideojuegoJpa);
		
		repositorioVideojuegoPostgres.crearVideojuego(videojuego);
		mockMvc.perform(delete("/videojuego/".concat(NOMBRE_JUEGO_TEST))
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(videojuego)))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	public void listarVideojuegosTest() throws Exception {
		RepositorioVideojuegoPostgres repositorioVideojuegoPostgres = new RepositorioVideojuegoPostgres(repositorioVideojuegoJpa);
		
		Videojuego videojuego = new Videojuego(1L,"GTA San Andreas", "Accion", LocalDate.of(2019, 10, 20),100000,"Rockstar");
		Videojuego videojuego2 = new Videojuego(2L,"Fortnite", "Accion", LocalDate.of(2019, 5, 10),350000,"Electronic");
		
		repositorioVideojuegoPostgres.crearVideojuego(videojuego);
		repositorioVideojuegoPostgres.crearVideojuego(videojuego2);
		
		ArrayList<Videojuego> videojuegos = new ArrayList<>();
		videojuegos.add(videojuego);
		videojuegos.add(videojuego2);
		
		mockMvc.perform(get("/videojuego")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(videojuegos)))
				.andDo(print())
				.andExpect(status().isOk());
	}
}
