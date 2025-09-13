package com.example.projectX.controller;

import com.example.projectX.model.Cliente;
import com.example.projectX.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente) { // Metódo ResponseEntity salvar
        clienteRepository.save(cliente); // Metódo do JPA para salvar / criar o cliente
        return ResponseEntity.ok().body(cliente); // Retornando para o front o objeto cliente em formato jason
    }
}
