package br.com.healthTrack.boundaries.login;

import java.util.Scanner;
import br.com.healthTrack.controller.ControleLogin;
import br.com.healthTrack.test.Teste;

public class TelaLogin {
	
	private ControleLogin controle = new ControleLogin();
	
	public void printar() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|     BEM VINDO AO HEALTHTRACK!     |");
		System.out.println("|                                   |");
		System.out.println("|O que deseja ?                     |");
		System.out.println("|                                   |");
		System.out.println("|(1) Logar na minha conta           |");
		System.out.println("|(2) Criar uma nova conta           |");
		System.out.println("|(3) Esqueci minha senha            |");
		System.out.println("|(4) Sair                           |");
		System.out.println("|___________________________________|");
		System.out.println();
		System.out.print(">>> ");
		
	}
	
	public void logar() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|              LOGIN!               |");
		System.out.println("|___________________________________|");
		System.out.println();
		
	}
	
	public void avisarSucesso() {
	
		System.out.println();
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|     CONTA CRIADA COM SUCESSO!     |");
		System.out.println("|___________________________________|");
		System.out.println();
		
	}
	
	public void sair() {
		System.out.println();
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|        PROGRAMA FINALIZADO        |");
		System.out.println("|                                   |");
		System.out.println("| Adeus                             |");
		System.out.println("|___________________________________|");
		System.out.println();
	}
	
	public void executar(String opcao) {
		Scanner sc = new Scanner(System.in);
		switch(opcao) {
		case "1":{
			logar(controle);
			break;
		}
		case "2":{
			registrarConta(controle);
			break;		
		}
		case "3":{
			mandarEmail(controle);
			break;		
		}
		case "4":{
			sair();
			System.exit(0);
			break;
		}
		default:
			Teste.chamarTelaInvalida();
			Teste.chamarTelaLogin(sc);
		}
	}
	
	private void registrarConta(ControleLogin controle) {
		Scanner sc = new Scanner(System.in);
		Teste.chamarTelaNovaConta();
		System.out.print("-> Novo Login: ");
		String login = sc.next();
		System.out.print("-> Nova Senha: ");
		String senha = sc.next();
		System.out.print("-> Confirmar Senha: ");
		String senha2 = sc.next();
		System.out.print("-> Nome: ");
		String nome = sc.next();
		System.out.print("-> Email: ");
		String email = sc.next();
		System.out.print("-> Altura: ");
		double altura = Double.parseDouble(sc.next().replace(",", "."));
		if(controle.estaInvalido(senha, senha2, email)) {
			Teste.chamarTelaInvalida();
			Teste.chamarTelaLogin(sc);
		}
		controle.registrarConta(login, senha, nome, email, altura);
		avisarSucesso();
		Teste.chamarTelaLogin(sc);
	}
	
	private void logar(ControleLogin controle) {
		Scanner sc = new Scanner(System.in);
		logar();
		System.out.print("-> Login: ");
		String login = sc.next();
		System.out.print("-> Senha: ");
		String senha = sc.next();
		if(controle.logar(login,senha)==null) {
			Teste.chamarTelaInvalida();
			Teste.chamarTelaLogin(sc);
		};
		Teste.iniciarTelaMenu(controle);
	}
	
	private void mandarEmail(ControleLogin controle){
		Scanner sc = new Scanner(System.in);
		Teste.chamarTelaRecuperar();
		String email = sc.next();
		controle.mandarEmail(email);
		Teste.chamarTelaLogin(sc);
	}
	

}
