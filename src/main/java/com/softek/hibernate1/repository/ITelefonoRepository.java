package com.softek.hibernate1.repository;

import com.softek.hibernate1.modelo.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITelefonoRepository extends JpaRepository<Telefono, Long> {
}
