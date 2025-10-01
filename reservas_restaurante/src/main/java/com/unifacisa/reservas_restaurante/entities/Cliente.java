package com.unifacisa.reservas_restaurante.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Table(name = "clientes")
public class Cliente {

    @Id
    @Getter @Setter private Long cpf;

    @Column(nullable = false, length = 100)
    @Getter @Setter private String nome;
    @Getter @Setter private String telefone;
    @Getter @Setter private String email;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("cliente-reserva")
    @Getter @Setter private List<Reserva> reservas;

}
