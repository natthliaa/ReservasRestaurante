package com.unifacisa.reservas_restaurante.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "mesas")
@NoArgsConstructor @AllArgsConstructor
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private Long numero;
    @Getter @Setter private int capacidade;

    @ManyToMany(mappedBy = "mesas")
    @JsonBackReference("reserva-mesa")
    @Getter @Setter private Set<Reserva> reservas;

}
