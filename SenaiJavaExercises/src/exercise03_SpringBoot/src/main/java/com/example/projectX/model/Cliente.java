package com.example.projectX.model;

// Domain driven design

import jakarta.persistence.*; // Importando o Jakarta para gerenciamento de banco de dados

// Importando os utilitários para o Lombok Assistente

@Entity // Definindo através da notação que a Class cliente será identificada como Entidade
@Table(name = "tab_cliente") // Definindo um nome para a Class cliente como tabela
// AllArgsConstructor - Substitui o construtor com todos os atributos
// NoArgsConstructor - Substitui construtores incluindo o vázio e os apague
// Data - Substitui os Getters and Setters e toString

public class Cliente {

    @Id // Atributo PK para identificação
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Long id;

    @Column(nullable = false) // Notnull = Falso, ou seja, não é possível o user deixar o campo vázio
    private String nome;

    // Notnull = Falso, ou seja, não é possível o user deixar o campo vázio
    @Column(nullable = false, unique = true)  // Unique = Verdadeiro, ou seja, não é possível manter dois telefones iguais no database
    private String telefone;
}
