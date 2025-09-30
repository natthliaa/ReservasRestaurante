package com.unifacisa.reservas_restaurante.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Table(name = "clientes")
public class Cliente {

    @Id
    @Getter private Long cpf;

    @Column(nullable = false, length = 100)
    @Getter @Setter private String nome;
    @Getter @Setter private String telefone;
    @Getter @Setter private String email;

}
