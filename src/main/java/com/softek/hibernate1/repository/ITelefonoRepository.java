package com.softek.hibernate1.repository;

import com.softek.hibernate1.modelo.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ITelefonoRepository extends JpaRepository<Telefono, Long> {

    @Query("FROM Telefono t  WHERE t.piloto.nombre = 'Alonso'")
    List<Telefono> obtenerTelefonosDeAlonso();
}
