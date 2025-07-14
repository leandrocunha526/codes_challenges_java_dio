package reprodutor;

import domain.IPhone;

public class ReprodutorMusical implements IPhone {

	@Override
	public void exemplometodo1() {
		System.out.println("Reprodutor Musical: Exemplo de método");
	}

	@Override
	public void exemploMetodo2(String exemplo) {
		System.out.println("Reprodutor Musical: Exemplo de método 2 com parâmentro: " + exemplo);
	}
	
	public void tocar() {
		System.out.println("Reprodutor Musical: Tocar música.");
	}
	
	public void pausar() {
		System.out.println("Reprodutor Musical: Música pausada.");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Reprodutor Musical: Música selecionada: " + musica);
	}
}
