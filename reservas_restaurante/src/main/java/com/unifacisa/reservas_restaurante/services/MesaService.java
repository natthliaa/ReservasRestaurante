package com.unifacisa.reservas_restaurante.services;

import com.unifacisa.reservas_restaurante.entities.Mesa;
import com.unifacisa.reservas_restaurante.entities.Reserva;
import com.unifacisa.reservas_restaurante.repositories.MesaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaService {
    @Autowired
    private MesaRepositorio mesaRepositorio;

    public Mesa cadastrarMesa(Mesa mesa){
        return mesaRepositorio.save(mesa);
    }
    public List<Mesa> listarMesa(){
        return mesaRepositorio.findAll();
    }
    public void deletarMesa(Long id) {
        mesaRepositorio.deleteById(id);
    }
}
