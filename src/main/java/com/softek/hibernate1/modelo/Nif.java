package com.softek.hibernate1.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "nifs")
public class Nif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private char letra;
    private Long numero;
    @ToString.Exclude
    @OneToOne(mappedBy = "nif")
    private Piloto piloto;
}
