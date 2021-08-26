package br.com.healthTrack.boundaries;

import java.util.Scanner;

import br.com.healthTrack.controller.ControleLogin;
import br.com.healthTrack.controller.ControlePesos;
import br.com.healthTrack.controller.ControleUsuario;
import br.com.healthTrack.test.Teste;

public class TelaMenu {

	private ControleLogin controle;
	private ControleUsuario controle2;
	private ControlePesos controle3;
	
	public TelaMenu(ControleLogin controle) {
		this.controle = controle;
	}

	public void printar() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|               MENU                |");
		System.out.println("|                                   |");
		System.out.println("|O que deseja ?                     |");
		System.out.println("|                                   |");
		System.out.println("|(1) Ver cadastro                   |");
		System.out.println("|(2) Ir para o dashboard            |");
		System.out.println("|(3) Ver lista de pesos             |");
		System.out.println("|(4) Editar conta                   |");
		System.out.println("|(5) Deletar conta                  |");
		System.out.println("|(6) Deslogar                       |");
		System.out.println("|___________________________________|");
		System.out.println();
		System.out.print(">>> ");
		
	}
	
	public void editar() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|          EDITAR CONTA             |");
		System.out.println("|___________________________________|");
		System.out.println();
		
	}
	
	public void avisarSucesso() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|         CONTA ALTERADA!           |");
		System.out.println("|___________________________________|");
		System.out.println();
		
	}
	
	public void executar(String opcao) {
		
		switch(opcao) {
		case "1":{
			controle2 = new ControleUsuario(controle.getConta().getUsuario());
			Teste.iniciarTelaCadastro(controle2);
			break;
		}
		case "2":{
			controle3 = new ControlePesos(controle.getConta().getUsuario());
			Teste.iniciarTelaDashboard(controle3);
			break;		
		}
		case "3":{
			controle3 = new ControlePesos(controle.getConta().getUsuario());
			Teste.iniciarTelaPesos(controle3);
			break;		
		}
		case "4":{
			editarConta(controle);
			break;		
		}
		case "5":{
			controle.deletar();
			Teste.main(null);
			break;
		}
		case "6":{
			Teste.main(null);
			break;
		}
		default:
			Teste.chamarTelaInvalida();
			Teste.chamarTelaMenu();
		}
	}

	
	private void editarConta(ControleLogin controle) {
		Scanner sc = new Scanner(System.in);
		editar();
		System.out.print("-> Novo Login: ");
		String login = sc.next();
		System.out.print("-> Nova Senha: ");
		String senha = sc.next();
		controle.editarConta(login, senha);
		sc.close();
		avisarSucesso();
		Teste.chamarTelaMenu();
	}
	
	
}
