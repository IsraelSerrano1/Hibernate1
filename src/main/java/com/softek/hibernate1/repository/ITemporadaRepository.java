package com.softek.hibernate1.repository;

import com.softek.hibernate1.modelo.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITemporadaRepository extends JpaRepository<Temporada, Long> {

    List<Temporada> findById(long temporadaId);
}
