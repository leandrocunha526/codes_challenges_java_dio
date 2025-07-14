package domain;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
	/**
     * O sistema deverá receber dois parâmetros via terminal que representarão dois
     * números inteiros,
     * com estes dois números você deverá obter a quantidade de interações (for) e
     * realizar a impressão no console
     * (System.out.print) dos números incrementados, exemplo: Se você passar os
     * números 12 e 30,
     * logo teremos uma interação (for) com 18 ocorrências para imprimir os números,
     * exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
     * Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar
     * a exceção customizada
     * chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo
     * parâmetro deve ser maior que o primeiro."
     * Scanner input = new Scanner(System.in);
    */
	public static void main(String[] args) {
		System.out.println("-----------------Desafio Controle de fluxo-----------------");
		System.out.println("Digite dois valores para saber o número de interações sobre eles");
		System.out.println("1º valor: ");
		Scanner scanner = new Scanner(System.in);
		int parametro1 = lerInteiro(scanner);
		System.out.println("2º valor: ");
		int parametro2 = lerInteiro(scanner);
		try {
			contar(parametro1, parametro2);
		} catch(ParametrosInvalidosException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	 private static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
	    if(parametro1 >= parametro2) {
	    	throw new ParametrosInvalidosException();
	    } else {
	    	int diferenca = parametro2 - parametro1;
	    	for (int i = 1; i <= diferenca; i++) {
	    		System.out.println("Imprimindo a " + i + "ª interação: " + i);
	    	}
	    }	
	}

	 private static int lerInteiro(Scanner scanner) {
		while(true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch(NumberFormatException e) {
			   System.out.println("Entrada inválida. Por favor digite um número inteiro");	
			}
			
		}
	 }
}
