package com.example.livraria.controller;

import com.example.livraria.model.Autor;
import com.example.livraria.model.Livro;
import com.example.livraria.service.AutorService;
import com.example.livraria.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LivroController {
    private final LivroService livroService;
    private final AutorService autorService;

    public LivroController(LivroService livroService, AutorService autorService) {
        this.livroService = livroService;
        this.autorService = autorService;
    }

    @GetMapping("/buscar-livro")
    public List<Livro> buscarLivroPorTitulo(@RequestParam String titulo) {
        return livroService.buscarPorTitulo(titulo);
    }

    @GetMapping("/listar-livros")
    public List<Livro> listarLivros() {
        return livroService.listarTodos();
    }

    @GetMapping("/listar-autores")
    public List<Autor> listarAutores() {
        return autorService.listarAutores();
    }

    @GetMapping("/autores-vivos")
    public List<Autor> listarAutoresVivosNoAno(@RequestParam int ano) {
        return autorService.listarAutoresVivosNoAno(ano);
    }

    @GetMapping("/livros-idioma")
    public List<Livro> listarLivrosPorIdioma(@RequestParam String idioma) {
        return livroService.buscarPorIdioma(idioma);
    }
}