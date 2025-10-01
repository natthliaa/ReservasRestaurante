package com.unifacisa.reservas_restaurante.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ocasioes")
@NoArgsConstructor @AllArgsConstructor
public class Ocasiao {

    @Id
    @GeneratedValue
    @Getter private Long id;
    @Getter @Setter private String ocasiao;
    @Getter @Setter private String descricao;

    @OneToOne(mappedBy = "ocasiao")
    @JsonBackReference("reserva-ocasiao")
    @Getter @Setter private Reserva reserva;
}
