Descrição
Crie uma classe ContaBancaria que contenha um número da conta, nome do titular e saldo. O programa deve permitir depositar um valor e exibir o saldo atualizado. Para tornar o programa mais seguro e estruturado, utilize encapsulamento, implementando métodos getters e setters para manipular o saldo da conta. Além disso, garanta que o saldo inicial e os depósitos sejam sempre valores positivos. Caso contrário, o programa deve exibir uma mensagem de erro antes de continuar.

Entrada
Um número inteiro (número da conta).
Uma string (nome do titular).
Um número decimal (saldo inicial).
Um número decimal (valor do depósito).
Saída
O saldo atualizado após o depósito no seguinte formato: Conta #<numero> - Titular: <titular> - Saldo: R$<saldo formatado com duas casas decimais>
Se o saldo inicial for negativo, exibir antes da saída: Erro: O saldo nao pode ser negativo.
Se o depósito for negativo ou zero, exibir antes da saída: Erro: O valor do deposito deve ser positivo.
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
12345
Joao Silva
1000.00
500.50	Conta #12345 - Titular: Joao Silva - Saldo: R$1500.50
5555
Carlos Pereira
500.00
-100.00	Erro: O valor do deposito deve ser positivo.
2024
Ana Oliveira
-50.00	Erro: O saldo nao pode ser negativo.
Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

Os desafios apresentados aqui têm como objetivo principal exercitar os conceitos aprendidos e proporcionar um primeiro contato com lógica de programação. Caso não tenha experiência em programação, utilize o template disponível e preencha com os conceitos aprendidos. Para resetar o template, basta clicar em “Restart Code”.
import java.util.Scanner;

class ContaBancaria {
    private int numero;      
    private String titular;  
    private double saldo;    

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;

        // TODO: Verifica se o saldo inicial é negativo:
        
            // TODO: Retorne a mensagem de erro adequada:
            
            // TODO: Interrompa a criação do objeto e não continua:
            
        }

        this.saldo = saldo;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor <= 0) { // Verifica se o valor do depósito é inválido
            System.out.println("Erro: O valor do depósito deve ser positivo.");
            return; // Interrompe a execução e não realiza o depósito
        }
        saldo += valor; // Atualiza o saldo apenas se o depósito for válido
    }

    // TODO: Crie o método para exibir as informações da conta:
    

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        
        String titular = scanner.nextLine();
        
        double saldo = scanner.nextDouble();
        
        // TODO: Verifique se o saldo inicial é negativo e encerra o programa:
        
            // TODO: Retorne a condição para informar que o saldo nao pode ser negativo:
            
            scanner.close();
            return;
        }

        double deposito = scanner.nextDouble();

        // Verificação se o depósito é inválido e encerra o programa
        if (deposito <= 0) {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
            scanner.close();
            return;
        }

        // TODO: Crie um objeto ContaBancaria com os valores lidos:
        
        
        conta.depositar(deposito);
        
        conta.exibirSaldo();

        scanner.close();
    }
}

import java.util.Scanner;

class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    // Construtor com verificação de saldo negativo
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;

        if (saldo < 0) {
            System.out.println("Erro: O saldo nao pode ser negativo.");
        }

        // Mesmo que o saldo seja negativo, inicializamos como zero para evitar nulls
        this.saldo = saldo < 0 ? 0 : saldo;
    }

    // Método para realizar depósito com verificação
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do deposito deve ser positivo.");
            return;
        }
        this.saldo += valor;
    }

    // Getter para saldo
    public double getSaldo() {
        return this.saldo;
    }

    // Método para exibir saldo formatado
    public void exibirSaldo() {
        System.out.printf("Conta #%d - Titular: %s - Saldo: R$%.2f\n", numero, titular, saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        String titular = scanner.nextLine();

        double saldo = scanner.nextDouble();

        if (saldo < 0) {
            System.out.println("Erro: O saldo nao pode ser negativo.");
            scanner.close();
            return;
        }

        double deposito = scanner.nextDouble();

        if (deposito <= 0) {
            System.out.println("Erro: O valor do deposito deve ser positivo.");
            scanner.close();
            return;
        }

        ContaBancaria conta = new ContaBancaria(numero, titular, saldo);

        conta.depositar(deposito);
        conta.exibirSaldo();

        scanner.close();
    }
}
