package telefone;

import domain.IPhone;

public class AparelhoTelefonico implements IPhone {

	@Override
	public void exemplometodo1() {
		System.out.println("Aparelho Telefônico: Exemplo de método 1");
	}

	@Override
	public void exemploMetodo2(String exemplo) {
		System.out.println("Aparelho Telefônico: Exemplo de método 2 com parâmentro: " + exemplo);
	}
	
	public void ligar(String numero) {
		System.out.println("Aparelho Telefônico: Ligando para o numero: " + numero);
	}
  
	public void atender() {
		System.out.println("Aparelho Telefônico: Ligação atendida");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Aparelho Telefônico: Correio de voz iniciado");
	}
}
