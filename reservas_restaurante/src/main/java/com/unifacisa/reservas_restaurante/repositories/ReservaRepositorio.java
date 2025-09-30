package com.unifacisa.reservas_restaurante.repositories;

import com.unifacisa.reservas_restaurante.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva,Long> {
}
