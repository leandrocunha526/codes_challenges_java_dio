Descrição
Um e-commerce precisa de um sistema para armazenar pedidos. Crie uma classe Pedido que contém um número do pedido, nome do cliente e valor total. O programa deve receber essas informações e imprimir um resumo do pedido.

Entrada
A entrada consiste em três valores, que devem ser informados pelo usuário em três linhas separadas:

Um número inteiro representando o ID do pedido.
Uma string representando o nome do cliente.
Um número decimal representando o valor total do pedido.
Saída
A saída deve exibir os detalhes do pedido em uma única linha, no seguinte formato: Pedido #<ID> - Cliente: <Nome do Cliente> - Total: R$<Valor Total>

>> O valor total deve ser exibido com duas casas decimais, mesmo que o número inserido não as tenha.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
101
Joao Silva
150.75	Pedido #101 - Cliente: Joao Silva - Total: R$150.75
202
Maria Souza
89.99	Pedido #202 - Cliente: Maria Souza - Total: R$89.99
303
Pedro Santos
200.00	Pedido #303 - Cliente: Pedro Santos - Total: R$200.00
Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

Os desafios apresentados aqui têm como objetivo principal exercitar os conceitos aprendidos e proporcionar um primeiro contato com lógica de programação. Caso não tenha experiência em programação, utilize o template disponível e preencha com os conceitos aprendidos. Para resetar o template, basta clicar em “Restart Code”.


 
TESTES
Teste #1

Teste #2

Teste #3

Teste #4

Dúvidas ?
import java.util.Scanner;

// Classe que representa um Pedido:
class Pedido {
    private int id;
    private String cliente;
    private double valorTotal;

    // TODO: Crie o construtor para inicializar os atributos da classe:
    

    // TODO: Implemente o método para exibir as informações do pedido formatadas corretamente:
    
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        scanner.nextLine(); 

        String cliente = scanner.nextLine();

        double valorTotal = scanner.nextDouble();

        Pedido pedido = new Pedido(id, cliente, valorTotal);

        pedido.exibirPedido();

        scanner.close();
    }
}



import java.util.Scanner;

// Classe que representa um Pedido:
class Pedido {
    private int id;
    private String cliente;
    private double valorTotal;

    public Pedido(int id, String cliente, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public void exibirPedido() {
        System.out.printf("Pedido #%d - Cliente: %s - Total: R$%.2f\n", id, cliente, valorTotal);
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = Integer.parseInt(scanner.nextLine());

        String cliente = scanner.nextLine();

        // Corrige o erro de vírgula/ponto na entrada
        String valorStr = scanner.nextLine().replace(",", ".");
        double valorTotal = Double.parseDouble(valorStr);

        Pedido pedido = new Pedido(id, cliente, valorTotal);
        pedido.exibirPedido();

        scanner.close();
    }
}
