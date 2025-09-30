package com.unifacisa.reservas_restaurante.controllers;

import com.unifacisa.reservas_restaurante.entities.Cliente;
import com.unifacisa.reservas_restaurante.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente clienteCadastro){
        return clienteService.cadastrarCliente(clienteCadastro);
    }

    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteService.listarClientes();

    }

    @DeleteMapping("/cpf")
    public void deletarCliente(Long cpf){
        clienteService.deletarCliente(cpf);
    }

}
