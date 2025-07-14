import java.util.Scanner;

public class Main {
	/*
	 * Descrição
	Ao desenvolver um sistema de redirecionamento de links, um desenvolvedor precisa garantir que todas as URLs estejam padronizadas. Para isso, elas devem seguir as seguintes regras:

	Todas as letras devem estar em minúsculas.
	Não devem conter espaços extras antes ou depois da URL.
	Escreva um programa que receba uma URL digitada pelo usuário e retorne a versão normalizada.

	Entrada
	Uma única linha contendo a URL.
	A URL pode conter letras maiúsculas e minúsculas misturadas.
	Saída
	A URL normalizada deve seguir as seguintes regras:
	Todos os caracteres devem ser convertidos para letras minúsculas.
	Os espaços no início e no fim da URL devem ser removidos.
	A saída deve corresponder exatamente ao formato esperado, sem espaços adicionais ou alterações na estrutura da URL.

	Exemplos
	A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

	Entrada	Saída
	HTTPS://DIO.ME	https://dio.me
	WWW.GOOGLE.COM/SEARCH	www.google.com/search
	hTTps://meuSite.com	https://meusite.com
	Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

	Os desafios apresentados aqui têm como objetivo principal exercitar os conceitos aprendidos e proporcionar um primeiro contato com lógica de programação. Caso não tenha experiência em programação, utilize o template disponível e preencha com os conceitos aprendidos. Para resetar o template, basta clicar em “Restart Code”.
	*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a entrada do usuário
        String url = scanner.nextLine();

        // Normalize a URL:
        // 1) Remover espaços no início e no fim
        // 2) Converter para minúsculas
        String urlNormalizada = url.trim().toLowerCase();

        // Exiba a URL normalizada
        System.out.println(urlNormalizada);

        scanner.close();
    }
}
