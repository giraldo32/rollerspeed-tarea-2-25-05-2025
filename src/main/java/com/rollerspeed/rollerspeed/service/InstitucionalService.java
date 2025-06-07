package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.model.Institucional;
import com.rollerspeed.rollerspeed.Repository.InstitucionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstitucionalService {

    private final InstitucionalRepository institucionalRepository;

    public InstitucionalService(InstitucionalRepository institucionalRepository) {
        this.institucionalRepository = institucionalRepository;
    }

    public List<Institucional> listar() {
        return institucionalRepository.findAll();
    }

    public Optional<Institucional> obtenerPorId(Long id) {
        return institucionalRepository.findById(id);
    }

    public Institucional guardar(Institucional institucional) {
        return institucionalRepository.save(institucional);
    }

    public void eliminar(Long id) {
        institucionalRepository.deleteById(id);
    }
}