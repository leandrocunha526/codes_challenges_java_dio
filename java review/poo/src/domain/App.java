package domain;

import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class App {
	public static void main(String[] args) {
		ReprodutorMusical reprodutor = new ReprodutorMusical();
		NavegadorInternet navegador = new NavegadorInternet();
		AparelhoTelefonico telefone = new AparelhoTelefonico();
		
		System.out.println("Reprodutor musical\n");
		
		reprodutor.exemplometodo1();
		reprodutor.exemploMetodo2("Teste para o reprodutor musical");
		reprodutor.tocar();
		reprodutor.pausar();
		reprodutor.selecionarMusica("Another Brick in the Wall\n");
		
		System.out.println("Navegador de internet\n");
		
		navegador.exemplometodo1();
		navegador.exemploMetodo2("Teste para o nevagador de internet");
		navegador.exibirPagina("https://dio.me");
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		
		System.out.print("\n");
		
		System.out.println("Aparelho telefónico\n");
		
		telefone.exemplometodo1();
		telefone.exemploMetodo2("Teste para o aparelho telefónico");
		telefone.ligar("12345678");
		telefone.atender();
		telefone.iniciarCorreioVoz();
	}
}
