package com.idat.EFLeonardoBravoReserva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFLeonardoBravoReserva.dto.ReservaDTO;
import com.idat.EFLeonardoBravoReserva.service.ReservaService;

@Controller
@RequestMapping("/api/reserva/v1")
public class ReservaController {
	

		@Autowired
		private ReservaService service;
		
		@GetMapping("/listar")
		public @ResponseBody List<ReservaDTO> listar() {
			return service.listar();
		}
		
		@GetMapping("/listar/{id}")
		public @ResponseBody ReservaDTO porId(@PathVariable Integer id) {
			return service.obtenerId(id);
		}
		
		@PostMapping("/guardar")
		public @ResponseBody void guardar(@RequestBody ReservaDTO dto) {
			service.guardar(dto);
		}


}