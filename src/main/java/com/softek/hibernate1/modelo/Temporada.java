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
@Table(name="temporadas")
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int inicio;
    private int fin;
    @ToString.Exclude
    @ManyToMany(mappedBy = "temporadas", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Piloto> pilotos;
}
