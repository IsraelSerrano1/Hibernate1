package com.softek.hibernate1.service;

import com.softek.hibernate1.modelo.Piloto;
import com.softek.hibernate1.modelo.Temporada;
import com.softek.hibernate1.repository.ITemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TemporadaService implements  ITemporadaService{
    @Autowired
    private ITemporadaRepository tempRepo;
    @Override
    public List<Piloto> pilotosPorTemporada(Long temporadaId) {
        Optional<Temporada> optionalTemporada = tempRepo.findById(temporadaId);
        if (optionalTemporada.isPresent()) {
            Temporada temporada = optionalTemporada.get();
            Set<Piloto> pilotos = temporada.getPilotos();
            return new ArrayList<>(pilotos);
        } else {
            // La temporada no fue encontrada, puedes manejarlo adecuadamente (lanzar una excepción, retornar una lista vacía, etc.)
            return Collections.emptyList(); // Retorna una lista vacía en caso de que no se encuentre la temporada
        }
    }
}
