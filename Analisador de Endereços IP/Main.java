import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String ip = scanner.nextLine(); 
        scanner.close(); 

        // Chame o método validarIP passando o IP como parâmetro e imprimir "ip valido" ou "ip invalido"
        if (validarIP(ip)) {
            System.out.println("ip valido");
        } else {
            System.out.println("ip invalido");
        }
    }

    // Método para validar um endereço IP
    public static boolean validarIP(String ip) {
        // Divida a string IP pelo caractere "." e armazenar as partes em um array
        String[] partes = ip.split("\\."); // Use \\., pois . é caractere especial em regex

        // Verifique se o array contém exatamente 4 partes
        if (partes.length != 4) {
            return false;
        }

        // Percorra cada parte do array e verificar se é um número válido
        for (String parte : partes) {
            // Verifique se a parte é válida
            if (!ehNumeroValido(parte)) {
                return false;
            }
        }

        return true;
    }

    // Método auxiliar para verificar se uma string representa um número válido entre 0 e 255
    private static boolean ehNumeroValido(String str) {
        try {
            int num = Integer.parseInt(str); 
            return num >= 0 && num <= 255; 
        } catch (NumberFormatException e) {
            return false; 
        }
    }
}
