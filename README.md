# Reservas de Restaurante

[![Java](https://img.shields.io/badge/Java-21-blue)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/SpringBoot-3.5.6-green)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

Sistema de **gerenciamento de reservas de restaurante** com Spring Boot, permitindo operações **CRUD** em entidades inter-relacionadas: **Cliente**, **Reserva** e **Mesa**, com diferentes tipos de relacionamentos.

---

## Funcionalidades CRUD

### Clientes
- `GET /clientes` → Listar todos
- `POST /clientes` → Adicionar novo

```json
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "telefone": "11999999999"
}
DELETE /clientes/{id} → Remover pelo ID

Reservas
GET /reservas

POST /reservas

json
Copiar código
{
  "data": "2025-10-05",
  "hora": "19:00",
  "status": "CONFIRMADA",
  "clienteId": 1,
  "mesasIds": [1, 2]
}
DELETE /reservas/{id}

Mesas
GET /mesas

POST /mesas

json
Copiar código
{
  "numero": 5,
  "capacidade": 4
}
DELETE /mesas/{id}

Relacionamentos:

Cliente ↔ Reserva → Um-para-Muitos

Reserva ↔ Mesa → Muitos-para-Muitos

Tecnologias
Java 21

Spring Boot 3.5.6

Spring Data JPA

H2 Database (em memória)

Maven

Lombok (opcional)

Como rodar o projeto
Clone o repositório:

bash
Copiar código
git clone https://github.com/natthliaa/ReservasRestaurante.git
cd ReservasRestaurante
Configure o banco em application.properties (H2):

properties
Copiar código
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
Rode a aplicação:

bash
Copiar código
mvn spring-boot:run
Acesse os endpoints via Postman ou navegador.

Console H2: http://localhost:8080/h2-console
