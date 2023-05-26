package com.softek.hibernate1.repository;

import com.softek.hibernate1.modelo.Facturacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturacionRepository extends JpaRepository<Facturacion, Long> {
}
