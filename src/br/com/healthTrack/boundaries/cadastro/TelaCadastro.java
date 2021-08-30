package br.com.healthTrack.boundaries.cadastro;

import java.util.Scanner;

import br.com.healthTrack.controller.ControleUsuario;
import br.com.healthTrack.test.Teste;

public class TelaCadastro {
	
	private ControleUsuario controle;
	
	public TelaCadastro(ControleUsuario controle) {
		this.controle = controle;
	}

	public void printar() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|            CADASTRO               |");
		System.out.println("|___________________________________|");
		System.out.println();
		System.out.println("Nome: "+controle.mostrarUsuario().getNome());
		System.out.println();
		System.out.println("E-mail: "+controle.mostrarUsuario().getEmail());
		System.out.println();
		System.out.println("Altura: "+controle.mostrarUsuario().getAltura()+" m");
		System.out.println();
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("| Digite 1 para voltar ao menu      |");
		System.out.println("| Digite 2 para editar dados        |");
		System.out.println("|___________________________________|");
		System.out.println();
		System.out.print(">>> ");
		
	}
	
	public void editar() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|          EDITAR CADASTRO          |");
		System.out.println("|___________________________________|");
		System.out.println();
		
	}
	
	public void avisarSucesso() {
		
		System.out.println();
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|         CADASTRO ALTERADO!        |");
		System.out.println("|___________________________________|");
		System.out.println();
		
	}
	
	public void executar(String opcao) {
		Scanner sc = new Scanner(System.in);
		switch(opcao) {
		case "1":{
			Teste.chamarTelaMenu(sc);
			break;
		}
		case "2":{
			editarCadastro(controle);
			break;
		}
		default:
			Teste.chamarTelaInvalida();
			Teste.chamarTelaCadastro(sc);
		}
	}
	
	private void editarCadastro(ControleUsuario controle) {
		Scanner sc = new Scanner(System.in);
		editar();
		System.out.print("-> Nome: ");
		String nome = sc.next();
		System.out.print("-> Email: ");
		String email = sc.next();
		System.out.print("-> Altura: ");
		double altura = Double.parseDouble(sc.next().replace(",", "."));
		if(controle.estaInvalido(email)) {
			Teste.chamarTelaCadastro(sc);
			Teste.main(null);
		}
		controle.editarUsuario(nome, email, altura);
		avisarSucesso();
		Teste.chamarTelaCadastro(sc);
	}
	
	

}
