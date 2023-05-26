package com.softek.hibernate1.repository;

import com.softek.hibernate1.modelo.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PilotoRepository extends JpaRepository<Piloto, Long> {

    @Query("FROM Piloto p WHERE p.temporadas=:temporada")
    List<Piloto> pilotosPorTemporada(@Param("temporada")int temporada);

    @Query("FROM Piloto p WHERE p.escuderia.nombre =:escuderia")
    List<Piloto> pilotosPorEscuderia(@Param("escuderia") String escuderia);

    @Query("FROM Piloto p WHERE p.facturacion.sueldo >: sueldo")
    List<Piloto> pilotosPorSueldoMinimo(@Param ("sueldo")double sueldo);

    @Query("FROM Piloto p WHERE p.facturacion.publicidad >=: sueldoMin AND p.facturacion.publicidad <=: sueldoMax")
    List<Piloto> pilotosPublicidadEntre(@Param ("sueldo")double sueldoMin, double sueldoMax);

    @Query("FROM Piloto p WHERE p.escuderia.pais <> 'Italia'")
    List<Piloto> pilotosNoItalianos();

    @Query("SELECT p.telefonos FROM Piloto p WHERE p.nombre = 'Alonso'")
    List<Integer> obtenerTelefonosDeAlonso();


}
