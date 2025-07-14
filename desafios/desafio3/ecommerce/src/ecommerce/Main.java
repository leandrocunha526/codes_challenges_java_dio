package ecommerce;

import java.util.Scanner;

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
