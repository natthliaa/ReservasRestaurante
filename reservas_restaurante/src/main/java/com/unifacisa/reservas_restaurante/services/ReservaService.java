package com.unifacisa.reservas_restaurante.services;

import com.unifacisa.reservas_restaurante.entities.Reserva;
import com.unifacisa.reservas_restaurante.repositories.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepositorio reservaRepositorio;

    public Reserva cadastrarReserva(Reserva reserva){
        return reservaRepositorio.save(reserva);
    }
    public List<Reserva> listarReservas(){
        return reservaRepositorio.findAll();
    }
    public void deletarReserva(Long id) {
        reservaRepositorio.deleteById(id);
    }
}

