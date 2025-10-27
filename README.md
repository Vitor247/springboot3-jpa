# Sobre o projeto
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Vitor247/springboot3-jpa/blob/main/LICENSE) 

Springboot3 JPA é uma aplicação backend desenvolvida durante o curso *Java Completo* da [DevSuperior](https://devsuperior.com.br "Site da DevSuperior"), com foco no domínio de mapeamentos do JPA/Hibernate.

A proposta é simular um pequeno sistema de vendas com entidades relacionadas, explorando algumas relações como:

- Um para muitos (1:N)
- Muitos para muitos (N:N)
- Relação com atributos extras na associação (OrderItem)

O projeto utiliza um banco **H2 em memória** e permite realizar operações CRUD expostas via API REST, possibilitando o consumo através de ferramentas como o Postman.

## Modelo conceitual
![Modelo Conceitual](https://github.com/Vitor247/assets/blob/main/springboot3-jpa/model.png)

## Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2 Database
- Postman

## Como executar o projeto

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/Vitor247/springboot3-jpa

# entrar na pasta do projeto
cd springboot3-jpa

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Vitor Camilo Inácio

https://www.linkedin.com/in/vitorcamilo-dev
