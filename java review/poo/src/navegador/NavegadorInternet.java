package navegador;

import domain.IPhone;

public class NavegadorInternet implements IPhone {

	@Override
	public void exemplometodo1() {
		System.out.println("Navegador Internet: Exemplo de método");
	}

	@Override
	public void exemploMetodo2(String exemplo) {
		System.out.println("Navegador Internet: Exemplo de método 2 com parâmentro: " + exemplo);
	}
	
	public void exibirPagina(String url) {
		System.out.println("Navegador Internet: Exibindo página: " + url);
	}
	
	public void adicionarNovaAba() {
		System.out.println("Navegador Internet: Nova aba adicionada.");
	}
	
	public void atualizarPagina() {
		System.out.println("Navegador Internet: Página atualizada.");
	}

}
