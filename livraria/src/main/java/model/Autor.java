package com.example.livraria.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private LocalDate dataFalecimento;
    
    // Getters e Setters
}