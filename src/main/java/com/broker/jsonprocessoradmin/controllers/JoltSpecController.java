package com.broker.jsonprocessoradmin.controllers;

import java.util.List;

import com.broker.jsonprocessoradmin.dto.JoltSpecDTO;
import com.broker.jsonprocessoradmin.services.JoltSpecServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/specs")
public class JoltSpecController {

    @Autowired
    private JoltSpecServices services;

    @GetMapping
    public ResponseEntity<List<JoltSpecDTO>> findAll () {
        List<JoltSpecDTO> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<JoltSpecDTO> findById (@PathVariable String id) {
        JoltSpecDTO spec = services.findById(id);
        return ResponseEntity.ok().body(spec);
    }

    @PostMapping
    public ResponseEntity<JoltSpecDTO> insert (@RequestBody JoltSpecDTO dto) {
        JoltSpecDTO spec = services.insert(dto);
        return ResponseEntity.ok().body(spec);
    }

    //put

    //delete
}
