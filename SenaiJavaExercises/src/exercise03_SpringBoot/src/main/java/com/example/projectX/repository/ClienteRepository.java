package com.example.projectX.repository;

// Importando utilitários de repository
import com.example.projectX.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Definindo que a interface é identidicada como um repositório
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Quando extendemos o JPARepository automaticamente é importado o CRUD
    // // SAVE, DELETE, UPDATE, findById, findAll
}
