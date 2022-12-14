package com.idat.EFLeonardoBravoReserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFLeonardoBravoReserva.modelo.Reserva;



@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
