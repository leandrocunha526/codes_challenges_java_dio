import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leia a linha de entrada:
        String linha = scanner.nextLine();
        
        scanner.close();
        
        // Divida a string usando espaço como delimitador:
        String[] partes = linha.split(" ");
        
        // Exiba o primeiro elemento (método HTTP):
        System.out.println(partes[0]);
    }
}
