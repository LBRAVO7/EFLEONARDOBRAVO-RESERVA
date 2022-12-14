package com.idat.EFLeonardoBravoReserva.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFLeonardoBravoReserva.dto.ReservaDTO;
import com.idat.EFLeonardoBravoReserva.modelo.Reserva;
import com.idat.EFLeonardoBravoReserva.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService{

	
	@Autowired
	private ReservaRepository repository;
	
	
	@Override
	public List<ReservaDTO> listar() {
		
		List<ReservaDTO> listadto = new ArrayList<>();
		ReservaDTO dto = null;
                
        for (Reserva reserva : repository.findAll()) {
            dto = new ReservaDTO();
            dto.setCost(reserva.getCosto());
            dto.setCod(reserva.getIdReserva());
            listadto.add(dto);
        }
        
		return listadto;
	}

	@Override
	public ReservaDTO obtenerId(Integer id) {
		Reserva reserva = repository.findById(id).orElse(null);
		ReservaDTO dto= new ReservaDTO();
		 dto.setCost(reserva.getCosto());
         dto.setCod(reserva.getIdReserva());
		return dto;
	}

	@Override
	public void guardar(ReservaDTO reserva) {
		Reserva reser = new Reserva();
		reser.setCosto(reserva.getCost());
		reser.setIdReserva(reserva.getCod());
		repository.save(reser);
		
	}

}
