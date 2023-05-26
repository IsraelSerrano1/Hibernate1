package com.softek.hibernate1.service;

import com.softek.hibernate1.modelo.Telefono;
import com.softek.hibernate1.repository.ITelefonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TelefonoService implements ITelefonoService{

    @Autowired
    private ITelefonoRepository tRepo;
    @Override
    public List<Telefono> obtenerTelefonosDeAlonso() {
        return tRepo.obtenerTelefonosDeAlonso();
    }
}
