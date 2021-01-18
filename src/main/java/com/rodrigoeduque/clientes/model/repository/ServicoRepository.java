package com.rodrigoeduque.clientes.model.repository;

import com.rodrigoeduque.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
