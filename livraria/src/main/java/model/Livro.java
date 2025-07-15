package com.example.livraria.model;

import jakarta.persistence.*;
import java.time.Year;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String idioma;
    private Year anoPublicacao;
    
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
    
    // Getters e Setters
}