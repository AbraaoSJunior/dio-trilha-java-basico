package iphone;

import funcoesTelefone.funcoes.Funcionalidades;
import funcoesTelefone.navegacao.Navegador;
import funcoesTelefone.navegacao.NavegadorInternet;
import funcoesTelefone.reproducao.ReprodutorMusical;
import funcoesTelefone.telefone.AparelhoTelefonico;

public class IPhone {
	public static void main(String[] args) {
		Funcionalidades usuario = new Funcionalidades();
		usuario.adicionarNovaAba();
		usuario.exibirPagina();
		usuario.atualizarPagina();
		usuario.tocarMusica();
		usuario.pausarMusica();
		usuario.selecionarMusica();
		usuario.ligar();
		usuario.atender();
		usuario.iniciarCorreioVoz();
	}
}
