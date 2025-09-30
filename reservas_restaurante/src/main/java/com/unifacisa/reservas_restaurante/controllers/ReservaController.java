package com.unifacisa.reservas_restaurante.controllers;

import com.unifacisa.reservas_restaurante.entities.Reserva;
import com.unifacisa.reservas_restaurante.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public Reserva cadastrarReserva(@RequestBody Reserva reserva){
        return reservaService.cadastrarReserva(reserva);
    }

    @GetMapping
    public List<Reserva> listarReserva(){
        return reservaService.listarReservas();
    }
    @DeleteMapping("/id")
    public void deletarReserva(Long id){
        reservaService.deletarReserva(id);
    }
}
