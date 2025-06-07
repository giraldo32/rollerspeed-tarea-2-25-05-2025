package com.rollerspeed.rollerspeed.Repository;

import com.rollerspeed.rollerspeed.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}