# Projeto API RESTful
## O projeto projeto-api-banco-santander é uma API RESTful desenvolvida em Java, utilizando o framework Spring Boot. A API depende das seguintes bibliotecas:​

Spring Web​

Spring Data JPA​

MySQL Driver​

H2 Database​

PostgreSQL Driver​

O modelo de classes do projeto inclui as seguintes entidades:​

User: representa o usuário e possui atributos como name, account, features, card e news.​

Account: associada a um usuário, contém informações como number, agency, balance e limit.​

Feature: representa funcionalidades disponíveis para o usuário, com atributos icon e description.​

Card: relacionado ao usuário, possui atributos como number e limit.​

News: representa notícias ou atualizações, com icon e description.​

As relações entre as classes são:​

Um User possui uma Account.​

Um User possui múltiplas Feature.​

Um User possui um Card.​

Um User possui múltiplas News.

## Dependências da API
- **Spring Web**
- **Spring Data JPA**
- **MySQL Driver**
- **H2 Database**
- **PostgreSQL Driver**


## Diagrma de clases

``` mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
