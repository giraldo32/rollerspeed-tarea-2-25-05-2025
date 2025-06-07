package com.rollerspeed.rollerspeed.Repository;

import com.rollerspeed.rollerspeed.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}