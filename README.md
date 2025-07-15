# 🏛️ Sistema de Gerenciamento de Livros

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-green)
![License](https://img.shields.io/badge/License-MIT-yellow)

Um sistema completo para gerenciamento de livros e autores com:
- **API RESTful** 
- **Interface de console interativa**
- **Banco de dados H2 em memória**

## 🚀 Funcionalidades

| Opção | Descrição                                  | Endpoint API                     |
|-------|-------------------------------------------|----------------------------------|
| 1     | Buscar livro por título                   | `GET /api/buscar-livro?titulo=`  |
| 2     | Listar todos os livros                    | `GET /api/listar-livros`         |
| 3     | Listar autores registrados                | `GET /api/listar-autores`        |
| 4     | Autores vivos em determinado ano          | `GET /api/autores-vivos?ano=`    |
| 5     | Livros por idioma                         | `GET /api/livros-idioma?idioma=` |

## 🛠️ Tecnologias

- **Backend**:
  - Java 17
  - Spring Boot 3.2.0
  - Spring Data JPA
  - H2 Database

- **Ferramentas**:
  - Maven
  - Spring Boot DevTools

## ⚙️ Configuração

### Pré-requisitos
- JDK 17+
- Maven 3.6+
- (Opcional) IDE como IntelliJ ou VS Code

### Instalação
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/livraria-spring.git
Navegue até o diretório:

bash
cd livraria-spring
Execute o projeto:

bash
mvn spring-boot:run

🌐 Acessando o Sistema
Via Console
O menu interativo aparecerá automaticamente no terminal após iniciar:

Escolha o número de sua opção:
1 - Buscar livro pelo título
2 - Listar livros registrados
3 - Listar autores registrados
4 - Listar autores vivos em 1990
5 - Listar livros em português
0 - Sair
Opção: _

Via API
Acesse os endpoints através de:

http://localhost:8080/api/[endpoint]

🏗️ Estrutura do Código

src/main/java/com/example/livraria/
├── controller/       # LivroController.java
├── model/            # Entidades (Livro.java, Autor.java)
├── repository/       # Interfaces JPA
├── service/          # Regras de negócio
├── ConsoleApp.java   # Menu interativo
└── LivrariaApplication.java # Classe principal

📝 Licença
Este projeto está sob licença.

Desenvolvido por: Arthur Syllos.
