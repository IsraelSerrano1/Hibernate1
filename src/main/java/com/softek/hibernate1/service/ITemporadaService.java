package com.softek.hibernate1.service;

import com.softek.hibernate1.modelo.Piloto;

import java.util.List;

public interface ITemporadaService {
    List<Piloto> pilotosPorTemporada(Long temporadaId);
}
