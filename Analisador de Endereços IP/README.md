# Descrição

Um backend precisa processar logs de acessos à API e validar endereços IP. Seu programa deve verificar se um IP contém exatamente 4 números separados por pontos (`.`) e cada número deve estar dentro do intervalo de 0 a 255.

Se todas as condições forem atendidas, o IP é considerado válido. Caso contrário, ele será inválido.

---

## Entrada

O programa recebe uma única string, representando um endereço IP.

---

## Saída

O programa deve imprimir:

- `"ip valido"` se o IP atender a todas as regras.
- `"ip invalido"` caso contrário.

> **Atenção:** os retornos da saída devem ser sem acentuação para esses casos.

---

## Exemplos

| Entrada       | Saída      |
| ------------- | ---------- |
| 192.168.1.1   | ip valido  |
| 256.100.50.25 | ip invalido|
| 123.45.67.89  | ip valido  |

---

**Atenção:** É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

---

Os desafios apresentados aqui têm como objetivo principal exercitar os conceitos aprendidos e proporcionar um primeiro contato com lógica de programação. Caso não tenha experiência em programação, utilize o template disponível e preencha com os conceitos aprendidos. Para resetar o template, basta clicar em “Restart Code”.
