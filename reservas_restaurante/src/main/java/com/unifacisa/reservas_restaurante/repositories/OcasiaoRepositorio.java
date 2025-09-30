package com.unifacisa.reservas_restaurante.repositories;

import com.unifacisa.reservas_restaurante.entities.Ocasiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcasiaoRepositorio extends JpaRepository<Ocasiao, Long> {
}
