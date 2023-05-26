package com.softek.hibernate1.repository;

import com.softek.hibernate1.modelo.Piloto;
import com.softek.hibernate1.modelo.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPilotoRepository extends JpaRepository<Piloto, Long> {


    @Query("FROM Piloto p WHERE p.escuderia.nombre =:escuderia")
    List<Piloto> pilotosPorEscuderia(@Param("escuderia") String escuderia);

    @Query("FROM Piloto p WHERE p.facturacion.sueldo >:sueldo")
    List<Piloto> pilotosPorSueldoMinimo(@Param ("sueldo")int sueldo);

    @Query("FROM Piloto p WHERE p.facturacion.publicidad >=:precioMin AND p.facturacion.publicidad <=:precioMax")
    List<Piloto> pilotosPublicidadEntre(@Param ("precioMin")int precioMin, @Param("precioMax") int precioMax);

    @Query("FROM Piloto p WHERE p.escuderia.pais <> 'Italia'")
    List<Piloto> pilotosNoItalianos();
}
