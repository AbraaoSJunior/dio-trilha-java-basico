package funcoesTelefone.telefone;

public class Telefone implements AparelhoTelefonico {
	public void ligar() {
		String String = "98765432";
		System.out.println("Realizando ligação para " + String);
	}
	public void atender() {
		System.out.println("Atendendo ligação");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

}
