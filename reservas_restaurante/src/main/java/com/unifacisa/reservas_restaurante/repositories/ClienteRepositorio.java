package com.unifacisa.reservas_restaurante.repositories;

import com.unifacisa.reservas_restaurante.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}
