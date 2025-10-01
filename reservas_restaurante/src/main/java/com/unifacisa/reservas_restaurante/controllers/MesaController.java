package com.unifacisa.reservas_restaurante.controllers;


import com.unifacisa.reservas_restaurante.entities.Mesa;
import com.unifacisa.reservas_restaurante.services.MesaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping ("/pacientes")
public class MesaController {
    @Autowired
    private MesaService mesaService;

    @PostMapping
    public Mesa cadastrarMesa(@RequestBody Mesa mesa) {
        return mesaService.cadastrarMesa(mesa);
    }

    @GetMapping
    public List<Mesa> listarMesa() {
        return mesaService.listarMesa();
    }

    @DeleteMapping("/id")
    public void deletarMesa(Long id) {
        mesaService.deletarMesa(id);
    }
}
