package com.example.livraria;

import com.example.livraria.model.Autor;
import com.example.livraria.model.Livro;
import com.example.livraria.service.AutorService;
import com.example.livraria.service.LivroService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleApp implements CommandLineRunner {
    private final LivroService livroService;
    private final AutorService autorService;
    private final Scanner scanner;

    public ConsoleApp(LivroService livroService, AutorService autorService) {
        this.livroService = livroService;
        this.autorService = autorService;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run(String... args) throws Exception {
        int opcao;
        do {
            System.out.println("\nEscolha o número de sua opção:");
            System.out.println("1 - Buscar livro pelo título");
            System.out.println("2 - Listar livros registrados");
            System.out.println("3 - Listar autores registrados");
            System.out.println("4 - Listar autores vivos em um determinado ano");
            System.out.println("5 - Listar livros em um determinado idioma");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    buscarLivroPorTitulo();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    listarAutores();
                    break;
                case 4:
                    listarAutoresVivos();
                    break;
                case 5:
                    listarLivrosPorIdioma();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void buscarLivroPorTitulo() {
        System.out.print("Digite o título ou parte dele: ");
        String titulo = scanner.nextLine();
        livroService.buscarPorTitulo(titulo).forEach(System.out::println);
    }

    private void listarLivros() {
        livroService.listarTodos().forEach(System.out::println);
    }

    private void listarAutores() {
        autorService.listarAutores().forEach(System.out::println);
    }

    private void listarAutoresVivos() {
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        autorService.listarAutoresVivosNoAno(ano).forEach(System.out::println);
    }

    private void listarLivrosPorIdioma() {
        System.out.print("Digite o idioma: ");
        String idioma = scanner.nextLine();
        livroService.buscarPorIdioma(idioma).forEach(System.out::println);
    }
}
