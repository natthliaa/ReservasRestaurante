package com.unifacisa.reservas_restaurante.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.unifacisa.reservas_restaurante.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "reservas")
@NoArgsConstructor @AllArgsConstructor

public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private Long id;
    @Getter @Setter private LocalDateTime dataHora;
    @Getter @Setter private int numeroPessoas;
    @Enumerated(EnumType.STRING)
    @Getter @Setter private Status statusReserva;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_cpf")
    @JsonBackReference("cliente-reserva")
    @Getter @Setter private Cliente cliente;

    @ManyToMany
    @JoinTable(
            name = "reserva_mesa",
            joinColumns = @JoinColumn(name = "reserva_id"),
            inverseJoinColumns = @JoinColumn(name = "mesa_id")
    )
    @JsonManagedReference("reserva-mesa")
    @Getter @Setter private Set<Mesa> mesas;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ocasiao_id", referencedColumnName = "id")
    @JsonManagedReference("reserva-ocasiao")
    @Getter @Setter private Ocasiao ocasiao;

}
