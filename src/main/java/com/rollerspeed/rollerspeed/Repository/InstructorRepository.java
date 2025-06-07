package com.rollerspeed.rollerspeed.Repository;

import com.rollerspeed.rollerspeed.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    Optional<Instructor> findByCorreo(String correo);
}