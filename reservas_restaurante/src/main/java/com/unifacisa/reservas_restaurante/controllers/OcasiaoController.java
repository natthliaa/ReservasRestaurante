package com.unifacisa.reservas_restaurante.controllers;

import com.unifacisa.reservas_restaurante.entities.Ocasiao;
import com.unifacisa.reservas_restaurante.services.OcasiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocasioes")
public class OcasiaoController {
    @Autowired
    private OcasiaoService ocasiaoService;

    @PostMapping
    public Ocasiao cadastrarOcasiao(@RequestBody Ocasiao ocasiao){
        return ocasiaoService.cadastrarOcasiao(ocasiao);
    }
    @GetMapping
    public List<Ocasiao> listarOcasiao(){
        return ocasiaoService.listarOcasiao();
    }
    @DeleteMapping("/id")
    public void deletarOcasiao(Long id){
        ocasiaoService.deletarOcasiao(id);
    }
}
