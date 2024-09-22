package funcoesTelefone.reproducao;

public class Musicas implements ReprodutorMusical {
	public void tocarMusica() {
		String musica = "Civil war";
		System.out.println("Reproduzindo música " + musica);
	}
	public void pausarMusica() {
		System.out.println("Música em pausa");
	}
	public void selecionarMusica() {
		System.out.println("Selecionando música:");
	}
	
	
}
