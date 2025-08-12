# 🥶❄️ Fridge API 🥶❄️

Projeto em Java para gerenciar alimentos de uma geladeira, aplicando boas práticas com **DTOs** e **Mappers** para proteger dados internos e organizar o fluxo de informações.

## ❄️ Descrição

Esta API REST em Java permite cadastrar, listar e remover alimentos armazenados em uma geladeira.  
Utiliza o banco de dados em memória **H2**, facilitando testes e desenvolvimento sem necessidade de configuração externa.

A arquitetura adota **DTOs** para transferência segura de dados e **Mappers** para converter entre entidades e DTOs.

Atualmente os métodos **GET (listar)**, **POST (cadastrar)** e **DELETE (remover)** estão implementados e funcionando. Atualizações e filtros podem ser adicionados futuramente.

## ⚙️ Tecnologias

- Java 17+
- Spring Boot
- Spring Data JPA
- Banco de dados H2 (em memória)
- Maven

## 🗂️ Estrutura do Projeto

- `controller`: endpoints REST  
- `dto`: objetos de transferência  
- `mapper`: conversão entidade ↔ DTO  
- `model`: entidades do banco  
- `repository`: acesso ao banco  
- `service`: regras de negócio  

## 🚀 Funcionalidades

- Listar todos os alimentos (`GET /food`)  
- Cadastrar novo alimento (`POST /food`)  
- Remover alimento por ID (`DELETE /food/{id}`)  
- Uso de DTOs para ocultar dados sensíveis  
- Mapeamento automático entre entidade e DTO  

## ▶️ Como rodar

1. Clone o repositório:

```bash
git clone https://github.com/Daniel-Macedo-dev/Fridge.git
```

2. Abra o projeto na IDE (IntelliJ, Eclipse, etc).  
3. Configure JDK 17+.  
4. Execute:

```bash
mvn spring-boot:run
```

5. Acesse a API:

```
http://localhost:8080/food
```

6. Para acessar o console web do banco H2 (útil para ver e manipular dados):

```
http://localhost:8080/h2-console
```

- **JDBC URL:** `jdbc:h2:mem:testdb`  
- **Usuário:** `sa`  
- **Senha:** *(deixe em branco)*

---

Qualquer dúvida ou sugestão, fique à vontade para abrir uma issue ou pull request.  
Obrigado por conferir o projeto! 🧊🥳
