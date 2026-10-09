# Projeto JDBC

Uma aplicação Java desenvolvida como parte dos meus estudos em Java, acompanhando o curso **Java COMPLETO, de Nelio Alves, na Udemy**.

O projeto foi criado com finalidade educacional para praticar **Programação Orientada a Objetos (POO), JDBC, MySQL, SQL e o padrão de projeto DAO**.

## Sobre o Projeto

Este projeto demonstra como uma aplicação Java pode se comunicar com um banco de dados relacional utilizando **JDBC (Java Database Connectivity)**.

A aplicação gerencia **vendedores e departamentos**, implementando operações de banco de dados por meio do padrão **DAO (Data Access Object)**.

O repositório representa uma etapa do meu aprendizado, na qual pratiquei a conexão de uma aplicação Java com um banco de dados MySQL e a implementação de operações CRUD.

> **Projeto educacional:** desenvolvido durante o acompanhamento das aulas e dos exercícios do curso de Java de Nelio Alves, disponível na Udemy.

## Tecnologias Utilizadas

- Java
- JDBC
- MySQL
- SQL
- Programação Orientada a Objetos (POO)
- Padrão DAO
- Eclipse IDE

## Estrutura do Projeto

```text
src/
├── application/
│   ├── Program.java
│   └── Program2.java
│
├── db/
│   ├── DB.java
│   ├── DbException.java
│   └── DbIntegrityException.java
│
└── model/
    ├── dao/
    │   ├── DaoFactory.java
    │   ├── DepartmentDao.java
    │   ├── SellerDao.java
    │   └── impl/
    │
    └── entities/
        ├── Department.java
        └── Seller.java
```

## Funcionalidades

### Vendedores (Seller)

- Cadastrar vendedores.
- Atualizar informações dos vendedores.
- Excluir vendedores.
- Buscar um vendedor pelo ID.
- Listar todos os vendedores.
- Buscar vendedores por departamento.

### Departamentos (Department)

- Acessar os dados dos departamentos por meio da camada DAO.
- Gerenciar informações dos departamentos.
- Estabelecer relacionamentos entre departamentos e vendedores.

## Integração com o Banco de Dados

A aplicação utiliza **JDBC** para estabelecer a comunicação entre Java e MySQL.

A camada de acesso ao banco de dados é responsável por:

- Abrir conexões com o banco de dados.
- Executar comandos SQL.
- Utilizar `PreparedStatement` para executar consultas e operações.
- Processar resultados de consultas com `ResultSet`.
- Tratar exceções relacionadas ao banco de dados.
- Fechar os recursos utilizados nas operações.

## Padrão de Projeto DAO

O projeto utiliza o padrão **DAO (Data Access Object)** para separar a lógica de acesso ao banco de dados das entidades da aplicação e de outros componentes.

O fluxo principal funciona da seguinte forma:

```text
Aplicação
    ↓
DaoFactory
    ↓
DAO
    ↓
JDBC
    ↓
MySQL
```

Essa separação contribui para uma melhor organização do código e mantém as operações de acesso ao banco de dados concentradas na camada DAO.

## Conceitos Praticados

Durante o desenvolvimento deste projeto, pratiquei os seguintes conceitos:

- Programação Orientada a Objetos em Java.
- Classes e objetos.
- Interfaces.
- Polimorfismo.
- Coleções.
- Generics.
- JDBC.
- SQL e MySQL.
- `Connection`.
- `PreparedStatement`.
- `ResultSet`.
- Operações CRUD (criação, consulta, atualização e exclusão).
- Relacionamentos entre dados.
- Tratamento de exceções.
- Padrão de projeto DAO.
- Organização de aplicações em camadas.

## Como Executar o Projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/joaopascoal1v-sudo/Projeto-jdbc.git
```

### 2. Configurar o MySQL

Crie o banco de dados e as tabelas necessárias para a execução da aplicação.

### 3. Configurar a conexão com o banco de dados

Configure os parâmetros de conexão de acordo com o ambiente local do MySQL.

**Importante:** não publique senhas reais nem credenciais confidenciais no repositório.

### 4. Executar a aplicação

Abra o projeto no Eclipse e execute uma das classes principais localizadas no diretório:

```text
src/application/
```

## Objetivo de Aprendizado

Este projeto faz parte da minha jornada de aprendizado em Java e integração com bancos de dados.

O principal objetivo foi compreender como uma aplicação Java se comunica com um banco de dados relacional e como diferentes camadas podem ser organizadas para separar responsabilidades.

Por meio deste projeto, pratiquei conceitos fundamentais como **JDBC, SQL, operações CRUD, DAO, programação orientada a objetos e relacionamentos entre dados**.

## Referência do Curso

Projeto desenvolvido durante os estudos do curso **Java COMPLETO: Programação Orientada a Objetos + Projetos**, ministrado por **Nelio Alves** e disponível na Udemy.

O repositório é publicado para fins educacionais e de portfólio, demonstrando minha evolução prática no aprendizado de Java.

## Melhorias Futuras

Conforme avanço nos estudos, pretendo ampliar e aprimorar o projeto com funcionalidades e melhorias, como:

- Validação de dados de entrada.
- Aprimoramento do tratamento de exceções.
- Implementação de testes automatizados.
- Melhorias nas funcionalidades de busca e filtragem.
- Inclusão de regras de negócio adicionais.
- Integração com uma API REST.
- Configuração com Docker.
- Aprimoramento da documentação.

## Autor

**João Pascoal**

GitHub: https://github.com/joaopascoal1v-sudo
