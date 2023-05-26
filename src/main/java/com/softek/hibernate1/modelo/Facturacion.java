package com.softek.hibernate1.modelo;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "facturaciones")
public class Facturacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int sueldo;
    private int publicidad;

    @ToString.Exclude
    @OneToOne(mappedBy = "facturacion")
    private Piloto piloto;
}
