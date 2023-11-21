package com.examen2.examen2.repositorios;

import com.examen2.examen2.modelos.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
