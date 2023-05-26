package com.softek.hibernate1.service;

import com.softek.hibernate1.modelo.Piloto;
import com.softek.hibernate1.modelo.Telefono;
import com.softek.hibernate1.repository.IPilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotoService implements IPilotoService {
    @Autowired
    private IPilotoRepository pRepo;
    @Override
    public List<Piloto> pilotosPorTemporada(Long temporada) {
        return pRepo.pilotosPorTemporada(temporada);
    }

    @Override
    public List<Piloto> pilotosPorEscuderia(String escuderia) {
        return pRepo.pilotosPorEscuderia(escuderia);
    }

    @Override
    public List<Piloto> pilotosPorSueldoMinimo(int sueldo) {
        return pRepo.pilotosPorSueldoMinimo(sueldo);
    }

    @Override
    public List<Piloto> pilotosPublicidadEntre(int precioMinimo, int precioMaximo) {
        return pRepo.pilotosPublicidadEntre(precioMinimo, precioMaximo);
    }

    @Override
    public List<Piloto> pilotosNoItalianos() {
        return pRepo.pilotosNoItalianos();
    }

    @Override
    public List<Telefono> obtenerTelefonosDeAlonso() {
        return pRepo.obtenerTelefonosDeAlonso();
    }
}
