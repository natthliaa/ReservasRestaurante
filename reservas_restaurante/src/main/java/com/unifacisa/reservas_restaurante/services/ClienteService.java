package com.unifacisa.reservas_restaurante.services;

import com.unifacisa.reservas_restaurante.entities.Cliente;
import com.unifacisa.reservas_restaurante.repositories.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public Cliente cadastrarCliente(Cliente clienteCadastro){
        return clienteRepositorio.save(clienteCadastro);
    }

    public List<Cliente> listarClientes(){
        return clienteRepositorio.findAll();
    }
    public void deletarCliente(Long cpf) {
        clienteRepositorio.deleteById(cpf);
    }
}
