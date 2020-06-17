package com.example.demoBcp.Dao;

import com.example.demoBcp.entity.TipoCambio;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TipoCambioDao extends CrudRepository<TipoCambio, Long> {
    Optional<TipoCambio> findByFechaCambioAndMoneda_id(String fechaCambio, Long  idMoneda);
}

