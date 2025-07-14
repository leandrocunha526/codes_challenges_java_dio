# Descrição

Em um sistema de backend, recebemos requisições HTTP de clientes e precisamos analisar qual método HTTP foi usado.  
Seu programa deve receber uma string contendo uma linha de log de requisição no formato:

```
<METODO> <ROTA> <STATUS_CODE>
```

E deve exibir apenas o método HTTP utilizado (`GET`, `POST`, `PUT`, `DELETE`).

---

## Entrada

Uma string contendo uma requisição HTTP.

---

## Saída

O método HTTP utilizado.

---

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.  
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada             | Saída |
| ------------------- | ----- |
| `GET /home 200`     | GET   |
| `POST /login 201`   | POST  |
| `PUT /user/42 200`  | PUT   |

---

> **Atenção:**  
> É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

---

Os desafios apresentados aqui têm como objetivo principal exercitar os conceitos aprendidos e proporcionar um primeiro contato com lógica de programação.  
Caso não tenha experiência em programação, utilize o template disponível e preencha com os conceitos aprendidos.  
Para resetar o template, basta clicar em **“Restart Code”**.
