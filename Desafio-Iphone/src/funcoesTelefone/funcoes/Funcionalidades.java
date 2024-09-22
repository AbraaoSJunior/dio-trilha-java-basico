package funcoesTelefone.funcoes;

import funcoesTelefone.navegacao.NavegadorInternet;
import funcoesTelefone.reproducao.ReprodutorMusical;
import funcoesTelefone.telefone.AparelhoTelefonico;

public class Funcionalidades implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
	public void tocarMusica() {
		System.out.println("Reproduzindo música ");
	}
	public void pausarMusica() {
		System.out.println("Música em pausa");
	}
	public void selecionarMusica() {
		String musica = "Civil war";
		System.out.println("Selecionando música: " + musica);
	}
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
