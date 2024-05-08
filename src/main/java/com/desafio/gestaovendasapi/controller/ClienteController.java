package com.desafio.gestaovendasapi.controller;

import com.desafio.gestaovendasapi.repository.ClienteRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/cliente"})
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List findAll() {
        return repository.findAll();
    }


}
