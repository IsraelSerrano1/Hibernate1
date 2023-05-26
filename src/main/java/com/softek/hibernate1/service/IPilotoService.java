package com.softek.hibernate1.service;

import com.softek.hibernate1.modelo.Piloto;
import com.softek.hibernate1.modelo.Telefono;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPilotoService {
    List<Piloto> pilotosPorTemporada(Long temporada);
    List<Piloto> pilotosPorEscuderia(String escuderia);

    List<Piloto> pilotosPorSueldoMinimo(int sueldo);

    List<Piloto> pilotosPublicidadEntre(int precioMinimo, int precioMaximo);

    List<Piloto> pilotosNoItalianos();

    List<Telefono> obtenerTelefonosDeAlonso();
}
