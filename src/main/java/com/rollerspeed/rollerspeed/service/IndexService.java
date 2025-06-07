package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.model.Index;
import com.rollerspeed.rollerspeed.Repository.IndexRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IndexService {

    private final IndexRepository indexInfoRepository;

    public IndexService(IndexRepository indexInfoRepository) {
        this.indexInfoRepository = indexInfoRepository;
    }

    public List<Index> listar() {
        return indexInfoRepository.findAll();
    }

    public Optional<Index> obtenerPorId(Long id) {
        return indexInfoRepository.findById(id);
    }

    public Index guardar(Index indexInfo) {
        return indexInfoRepository.save(indexInfo);
    }

    public void eliminar(Long id) {
        indexInfoRepository.deleteById(id);
    }
}