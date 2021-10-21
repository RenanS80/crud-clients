<h1 align="center">
    Primeira entrega - Bootcamp DevSuperior
</h1>

## 📃 Sobre
<p><strong>Enunciado</strong><p>
<p>Você deverá entregar um projeto Spring Boot 2.4 contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas:<p>
<ul>
    <li>Busca paginada de recursos</li>
    <li>Busca de recurso por id</li>
    <li>Inserir novo recurso</li>
    <li>Atualizar recurso</li>
    <li>Deletar recurso</li>
</ul>

<p>Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir:</p>
<img src="https://ik.imagekit.io/zqxyh6u3ylz/crud-clients/Sem_título__gk2eEvm_.jpg?updatedAt=1634857294651" alt="Diagrama de classe">

<p>Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS</p>

---

## 💻 Endpoints 
<p>Foram implementados e testados no Postman os seguintes endpoints:</p>
<strong>Busca paginada de clientes</strong> <br>
GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name <br><br>

<strong>Busca de cliente por id</strong> <br>
GET /clients/1 <br>

<strong>Inserção de novo cliente</strong> <br>
POST /clients

```bash
{ 
    "name": "Renan",
    "cpf": "12345678901",
    "income": 6500.0,
    "birthDate": "1994-07-20T10:30:00Z",
    "children": 2 
}
```

<strong>Atualização de cliente</strong> <br>
PUT /clients/1

```bash
{ 
    "name": "Renan",
    "cpf": "12345678901",
    "income": 6500.0,
    "birthDate": "1994-07-20T10:30:00Z",
    "children": 2 
}
```

<strong>Deleção de cliente</strong> <br>
DELETE /clients/1
