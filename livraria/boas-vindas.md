# 📚 Sistema de Gerenciamento de Livros

<div align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Java-17+-blue" alt="Java 17+">
  <img src="https://img.shields.io/badge/License-MIT-green" alt="License MIT">
</div>

## 🎉 Seja Bem-Vindo!

Olá, Dev! Este é um sistema completo para gestão de bibliotecas desenvolvido com Spring Boot. 
Perfect para quem deseja aprender ou implementar:

✔️ API RESTful robusta  
✔️ Interface de console amigável  
✔️ Arquitetura MVC bem estruturada  
✔️ Integração com banco de dados H2  

```java
// Exemplo de como nosso sistema funciona
Livro livro = new Livro("Dom Casmurro", "Português", 1899);
livroRepository.save(livro); // Simples assim!

✨ Features Principais
Código	Funcionalidade	HTTP Method	Endpoint
📖 1	Busca por título	GET	/api/buscar-livro
📚 2	Listagem completa	GET	/api/listar-livros
✍️ 3	Autores cadastrados	GET	/api/listar-autores
🎂 4	Autores vivos por ano	GET	/api/autores-vivos
🌍 5	Livros por idioma	GET	/api/livros-idioma
🚀 Começando
Pré-requisitos:

JDK 17+

Maven 3.6+

Git (opcional)

Executando:

bash
git clone https://github.com/seu-user/livraria-spring.git
cd livraria-spring
mvn spring-boot:run

Acesse:

Console: Menu automático no terminal

API: http://localhost:8080/api

H2 Console: http://localhost:8080/h2-console

🏆 Arquitetura

com.example.livraria
├── controller/    # Rotas API
├── model/         # Entidades JPA
├── repository/    # Spring Data JPA
├── service/       # Lógica de negócio
└── config/        # Configurações

💡 Por que usar?

100% Pronto para Produção

Documentação Completa

Fácil Customização

Modelo para Aprendizado

<div align="center"> <sub>Desenvolvido por <a href="#">Arthur Syllos</a></sub> </div> ```
