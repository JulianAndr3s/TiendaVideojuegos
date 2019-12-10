package com.ceiba.adn.tiendavideojuegos.dominio.modelo.dto;


public class ReservaDTO {
	
	private Long idReservaDTO;
	private ClienteDTO clienteDTO;
	private VideojuegoDTO videojuegoDTO;
	
	public ReservaDTO(Long idReservaDTO, ClienteDTO clienteDTO, VideojuegoDTO videojuegoDTO) {
		super();
		this.idReservaDTO = idReservaDTO;
		this.clienteDTO = clienteDTO;
		this.videojuegoDTO = videojuegoDTO;
	}

	public ReservaDTO() {

	}

	public Long getIdReserva() {
		return idReservaDTO;
	}

	public void setIdReserva(Long idReservaDTO) {
		this.idReservaDTO = idReservaDTO;
	}

	public ClienteDTO getCliente() {
		return clienteDTO;
	}

	public void setCliente(ClienteDTO clienteDTO) {
		this.clienteDTO = clienteDTO;
	}

	public VideojuegoDTO getVideojuego() {
		return videojuegoDTO;
	}

	public void setVideojuego(VideojuegoDTO videojuegoDTO) {
		this.videojuegoDTO = videojuegoDTO;
	}
}
