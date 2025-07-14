package ecommerce;

//Classe que representa um Pedido:
class Pedido {
 private int id;
 private String cliente;
 private double valorTotal;

 // Construtor para inicializar os atributos
 public Pedido(int id, String cliente, double valorTotal) {
     this.id = id;
     this.cliente = cliente;
     this.valorTotal = valorTotal;
 }

 // Método para exibir as informações formatadas
 public void exibirPedido() {
     System.out.printf("Pedido #%d - Cliente: %s - Total: R$%.2f\n", id, cliente, valorTotal);
 }
}
