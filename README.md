# 🍽️ ReservasRestaurante

API REST para gerenciamento de **clientes, mesas e reservas** de restaurante, desenvolvida em **Java 21** com **Spring Boot 3.5.6**.  
O projeto oferece um backend simples e extensível para controle de reservas, ideal para estudos ou como base para aplicações reais.

---

## ✨ Funcionalidades

- 👤 **Clientes**
  - Cadastro, consulta, atualização e exclusão
- 🪑 **Mesas**
  - Gerenciamento de mesas (capacidade, disponibilidade etc.)
- 📅 **Reservas**
  - Criação de reservas associando cliente + mesa + horário
  - Validação de disponibilidade
  - Atualização e cancelamento de reservas

---

## 🛠️ Tecnologias

- ☕ **Java 21**
- 🌱 **Spring Boot 3.5.6**
- 🗄️ **Spring Data JPA**
- 🛢️ Banco de dados (H2 / MySQL / PostgreSQL – configurável)
- 🔧 **Maven**
- ✅ **JUnit** (testes unitários)

---

## 📂 Estrutura do Projeto
├── src/main/java/com/unifacisa/reservas_restaurante/
│ ├── controllers/ # Endpoints REST
│ ├── entities/ # Entidades JPA (Cliente, Mesa, Reserva)
│ ├── repositories/ # Interfaces de persistência
│ ├── services/ # Regras de negócio
│ └── Application.java # Classe principal
│
├── src/main/resources/
│ └── application.properties # Configurações (porta, banco de dados, etc.)
│
├── pom.xml
└── README.md

---

## ⚙️ Configuração

Edite o arquivo `application.properties` de acordo com seu banco:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/reservas
spring.datasource.username=root
spring.datasource.password=suasenha
spring.jpa.hibernate.ddl-auto=update
server.port=8080

---

▶️ Como rodar

Clone o repositório

git clone https://github.com/natthliaa/ReservasRestaurante.git
cd ReservasRestaurante

Compile e rode a aplicação

mvn spring-boot:run

Acesse no navegador ou Postman/Insomnia:

http://localhost:8080
---
📌 Endpoints principais
👤 Clientes

| Método | Endpoint         | Ação                        |
| ------ | ---------------- | --------------------------- |
| GET    | `/clientes`      | Listar clientes             |
| GET    | `/clientes/{id}` | Buscar cliente por ID       |
| POST   | `/clientes`      | Criar novo cliente          |
| PUT    | `/clientes/{id}` | Atualizar cliente existente |
| DELETE | `/clientes/{id}` | Remover cliente             |

🪑 Mesas
| Método | Endpoint      | Ação           |
| ------ | ------------- | -------------- |
| GET    | `/mesas`      | Listar mesas   |
| POST   | `/mesas`      | Criar mesa     |
| PUT    | `/mesas/{id}` | Atualizar mesa |
| DELETE | `/mesas/{id}` | Remover mesa   |

📅 Reservas
| Método | Endpoint         | Ação                       |
| ------ | ---------------- | -------------------------- |
| GET    | `/reservas`      | Listar reservas            |
| GET    | `/reservas/{id}` | Buscar reserva por ID      |
| POST   | `/reservas`      | Criar nova reserva         |
| PUT    | `/reservas/{id}` | Atualizar reserva          |
| DELETE | `/reservas/{id}` | Cancelar / excluir reserva |

✅ Testes

Rode os testes com:
mvn test

📄 Licença
Este projeto é livre para uso acadêmico e pessoal.
