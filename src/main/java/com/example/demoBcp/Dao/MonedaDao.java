package com.example.demoBcp.Dao;

import com.example.demoBcp.entity.Moneda;
import com.example.demoBcp.entity.TipoCambio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MonedaDao extends CrudRepository<Moneda, Long> {
    List<Moneda> findAll();
}

