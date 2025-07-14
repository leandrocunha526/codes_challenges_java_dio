import java.util.Scanner;

public class Main {
	/*
	 * Descrição
	No desenvolvimento de sistemas backend, é comum gerar identificadores únicos para pedidos, transações e outros registros. Seu desafio é criar um programa que receba um nome e um número, e retorne um identificador no formato nome-numero. O nome deve ser convertido para letras minúsculas, e os espaços devem ser removidos.

	Entrada
	Uma string contendo o nome.
	Um número inteiro representando o ID.
	Saída
	Uma string formatada no seguinte padrão: nome-numero, onde:

	nome está em letras minúsculas.
	Um número inteiro representando o ID.
	Exemplos
	A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

	Entrada	Saída
	Joao
	42	joao-42
	Maria
	99	maria-99
	SistemaX
	7	sistemax-7
	Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

	Os desafios apresentados aqui têm como objetivo principal exercitar os conceitos aprendidos e proporcionar um primeiro contato com lógica de programação. Caso não tenha experiência em programação, utilize o template disponível e preencha com os conceitos aprendidos. Para resetar o template, basta clicar em “Restart Code”.
	*/
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo a string (nome)
        String nome = scanner.nextLine();

        // Lendo o número inteiro (ID)
        int id = scanner.nextInt();

        // Formate o identificador:
        // - Converter para minúsculas: toLowerCase()
        // - Remover espaços: replace(" ", "")
        String nomeFormatado = nome.toLowerCase().replace(" ", "");

        // Concatenar com o número no formato solicitado
        String identificador = nomeFormatado + "-" + id;

        // Exiba o resultado
        System.out.println(identificador);

        // Fechando o scanner
        scanner.close();
    }
}
