package com.example.livraria.service;

import com.example.livraria.model.Livro;
import com.example.livraria.repository.LivroRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> buscarPorTitulo(String titulo) {
        return livroRepository.findByTituloContainingIgnoreCase(titulo);
    }

    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }

    public List<Livro> buscarPorIdioma(String idioma) {
        return livroRepository.findByIdioma(idioma);
    }
}