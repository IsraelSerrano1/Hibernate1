package com.softek.hibernate1.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pilotos")
public class Piloto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    private Long id;
    @ToString.Include
    private String nombre;
    @ToString.Include
    private int edad;

    @OneToOne
    @JoinColumn(name = "fk_factura_id", referencedColumnName = "id")
    private Facturacion facturacion;


    @OneToOne
    @JoinColumn(name = "fk_nif_id", referencedColumnName = "id")
    private Nif nif;


    @ManyToOne
    private Escuderia escuderia;

    @ToString.Exclude
    @OneToMany(mappedBy = "piloto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Telefono> telefonos;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "pilotos_temporadas",
            joinColumns = {@JoinColumn(name = "fk_piloto_id", referencedColumnName = "id")},
            inverseJoinColumns = @JoinColumn(name = "fk_temporada_id", referencedColumnName = "id")
    )
    private Set<Temporada> temporadas;
}
