package com.unifacisa.reservas_restaurante.controllers;

import com.unifacisa.reservas_restaurante.entities.Cliente;
import com.unifacisa.reservas_restaurante.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente cliente){
        return clienteService.cadastrarCliente(cliente);
    }

    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteService.listarClientes();

    }

    @DeleteMapping("/{cpf}")
    public void deletarCliente(@PathVariable Long cpf){
        clienteService.deletarCliente(cpf);
    }

}
