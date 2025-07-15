package com.example.livraria.service;

import com.example.livraria.model.Autor;
import com.example.livraria.repository.AutorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    public List<Autor> listarAutoresVivosNoAno(int ano) {
        return autorRepository.findAutoresVivosNoAno(ano);
    }
}