package com.rodrigoeduque.clientes.model.repository;

import com.rodrigoeduque.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
