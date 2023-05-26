package com.softek.hibernate1.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "escuderias")
public class Escuderia {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;
        private String pais;

        @ToString.Exclude
        @OneToMany(mappedBy = "escuderia", cascade = CascadeType.ALL)
        private Set<Piloto> pilotos;
}
