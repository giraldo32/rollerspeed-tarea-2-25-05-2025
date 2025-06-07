package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.model.Instructor;
import com.rollerspeed.rollerspeed.Repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public List<Instructor> listarInstructores() {
        return instructorRepository.findAll();
    }

    public Optional<Instructor> obtenerPorId(Long id) {
        return instructorRepository.findById(id);
    }

    public Optional<Instructor> obtenerPorCorreo(String correo) {
        return instructorRepository.findByCorreo(correo);
    }

    public Instructor guardarInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public void eliminarInstructor(Long id) {
        instructorRepository.deleteById(id);
    }
}