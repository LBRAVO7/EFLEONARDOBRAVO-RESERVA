package com.idat.EFLeonardoBravoReserva.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="reserva")
@Entity
public class Reserva {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idReserva;
	private Integer Costo;
}


