package com.broker.jsonprocessoradmin.services;

import java.util.List;
import java.util.stream.Collectors;

import com.broker.jsonprocessoradmin.dto.JoltSpecDTO;
import com.broker.jsonprocessoradmin.entities.JoltSpec;
import com.broker.jsonprocessoradmin.repositories.JoltSpecRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JoltSpecServices {

    @Autowired
    private JoltSpecRepository repository;
    
    @Transactional
    public List<JoltSpecDTO> findAll () {
        List<JoltSpec> list = repository.findAll();
        return list.stream().map(j -> new JoltSpecDTO(j)).collect(Collectors.toList());
    }

    @Transactional
    public JoltSpecDTO findById (String id) {
        JoltSpec spec = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Null id."));
        return new JoltSpecDTO(spec);
    }

    @Transactional
    public JoltSpecDTO findByName (String name) {
        try {
            JoltSpec spec = repository.findByName(name);
            return new JoltSpecDTO(spec);
        } catch (NullPointerException e) {
            return null; // tratar exceção
        }
    }

    @Transactional
    public JoltSpecDTO insert (JoltSpecDTO dto) {
        JoltSpec spec = new JoltSpec(dto);
        spec = repository.insert(spec);
        return new JoltSpecDTO(spec);
    }

    @Transactional
    public JoltSpecDTO update (JoltSpecDTO dto) {
        JoltSpec spec = repository.findById(dto.getId()).orElse(new JoltSpec(dto));
        spec.setName(dto.getName());
        spec.setOperation(dto.getOperation());
        spec.setSpec(dto.getSpec());
        spec = repository.save(spec);
        return new JoltSpecDTO(spec);
    }

    @Transactional
    public void delete (String id) {
        JoltSpec spec = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("This spec doesn't exist"));
        repository.delete(spec);
    }
}
