package funcoesTelefone.navegacao;

public class Navegador implements NavegadorInternet {
	public void exibirPagina() {
		String url="https://github.com/AbraaoSJunior";
		System.out.println("Exibindo página da internet: " + url);		
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

}
