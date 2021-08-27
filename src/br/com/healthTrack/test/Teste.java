package br.com.healthTrack.test;

import java.util.Scanner;

import br.com.healthTrack.boundaries.TelaInvalida;
import br.com.healthTrack.boundaries.TelaMenu;
import br.com.healthTrack.boundaries.cadastro.TelaCadastro;
import br.com.healthTrack.boundaries.login.TelaLogin;
import br.com.healthTrack.boundaries.login.TelaNovaConta;
import br.com.healthTrack.boundaries.login.TelaRecuperar;
import br.com.healthTrack.boundaries.peso.TelaDashboard;
import br.com.healthTrack.boundaries.peso.TelaPesos;
import br.com.healthTrack.controller.ControleLogin;
import br.com.healthTrack.controller.ControlePesos;
import br.com.healthTrack.controller.ControleUsuario;

public class Teste {
	
	public static TelaLogin telaLogin = new TelaLogin();
	public static TelaMenu telaMenu;
	public static TelaCadastro telaCadastro;
	public static TelaPesos telaPesos;
	public static TelaDashboard telaDashboard;
	
	public static void main(String[] args) {
		
		telaLogin.printar();
		
		Scanner sc = new Scanner(System.in);
		
		telaLogin.executar(sc.next());
		
		sc.close();
	}
	
	public static void chamarTelaInvalida() {
		new TelaInvalida().printar();
	}
	
	public static void chamarTelaNovaConta() {
		new TelaNovaConta().printar();
	}

	public static void chamarTelaRecuperar() {
		new TelaRecuperar().printar();
	}
	
	public static void chamarTelaLogin(Scanner sc) {
		telaLogin.printar();
		
		telaLogin.executar(sc.next());
		
		sc.close();
		
	}
	
	public static void chamarTelaMenu(Scanner sc) {
		telaMenu.printar();
		
		telaMenu.executar(sc.next());
		
		sc.close();
		
	}
	
	public static void chamarTelaCadastro(Scanner sc) {
		telaCadastro.printar();
		
		telaCadastro.executar(sc.next());
		
		sc.close();
		
	}
	
	public static void chamarTelaPesos(Scanner sc) {
		telaPesos.printar();
		
		telaPesos.executar(sc.next());
		
		sc.close();
		
	}
	
	public static void chamarTelaDashboard(Scanner sc) {
		telaDashboard.printar();
		
		telaDashboard.executar(sc.next());
		
		sc.close();
	}
	
	public static void iniciarTelaMenu(ControleLogin controle) {
		Scanner sc = new Scanner(System.in);
		telaMenu = new TelaMenu(controle);
		chamarTelaMenu(sc);
	}
	
	public static void iniciarTelaCadastro(ControleUsuario controle) {
		Scanner sc = new Scanner(System.in);
		telaCadastro = new TelaCadastro(controle);
		chamarTelaCadastro(sc);
	}
	
	public static void iniciarTelaPesos(ControlePesos controle) {
		Scanner sc = new Scanner(System.in);
		telaPesos = new TelaPesos(controle);
		chamarTelaPesos(sc);
	}
	
	public static void iniciarTelaDashboard(ControlePesos controle) {
		Scanner sc = new Scanner(System.in);
		telaDashboard = new TelaDashboard(controle);
		chamarTelaDashboard(sc);
	}
}
