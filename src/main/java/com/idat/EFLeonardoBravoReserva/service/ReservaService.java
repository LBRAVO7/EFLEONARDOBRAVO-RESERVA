package com.idat.EFLeonardoBravoReserva.service;

import java.util.List;

import com.idat.EFLeonardoBravoReserva.dto.ReservaDTO;



public interface ReservaService {
	
	List<ReservaDTO> listar();
	ReservaDTO obtenerId(Integer id);
	void guardar(ReservaDTO reserva);

}
