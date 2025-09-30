package com.unifacisa.reservas_restaurante.services;

import com.unifacisa.reservas_restaurante.entities.Ocasiao;
import com.unifacisa.reservas_restaurante.repositories.OcasiaoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcasiaoService {
    @Autowired
    private OcasiaoRepositorio ocasiaoRepositorio;

    public Ocasiao cadastrarOcasiao(Ocasiao ocasiao){
        return ocasiaoRepositorio.save(ocasiao);
    }
    public List<Ocasiao> listarOcasiao (){
        return ocasiaoRepositorio.findAll();
    }
    public void deletarOcasiao(Long id){
        ocasiaoRepositorio.findById(id);
    }
}
