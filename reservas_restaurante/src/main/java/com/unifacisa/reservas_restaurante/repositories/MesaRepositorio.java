package com.unifacisa.reservas_restaurante.repositories;

import com.unifacisa.reservas_restaurante.entities.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaRepositorio extends JpaRepository<Mesa, Long> {


}
