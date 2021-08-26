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
	
	public static void chamarTelaMenu() {
		telaMenu.printar();
		
		Scanner sc = new Scanner(System.in);
		
		telaMenu.executar(sc.next());
		
		sc.close();
		
	}
	
	public static void chamarTelaCadastro() {
		telaCadastro.printar();
		
		Scanner sc = new Scanner(System.in);
		
		telaCadastro.executar(sc.next());
		
		sc.close();
		
	}
	
	public static void chamarTelaPesos() {
		telaPesos.printar();
		
		Scanner sc = new Scanner(System.in);
		
		telaPesos.executar(sc.next());
		
		sc.close();
		
	}
	
	public static void chamarTelaDashboard() {
		telaDashboard.printar();
		
		Scanner sc = new Scanner(System.in);
		
		telaDashboard.executar(sc.next());
		
		sc.close();
	}
	
	public static void iniciarTelaMenu(ControleLogin controle) {
		telaMenu = new TelaMenu(controle);
		chamarTelaMenu();
	}
	
	public static void iniciarTelaCadastro(ControleUsuario controle) {
		telaCadastro = new TelaCadastro(controle);
		chamarTelaCadastro();
	}
	
	public static void iniciarTelaPesos(ControlePesos controle) {
		telaPesos = new TelaPesos(controle);
		chamarTelaPesos();
	}
	
	public static void iniciarTelaDashboard(ControlePesos controle) {
		telaDashboard = new TelaDashboard(controle);
		chamarTelaDashboard();
	}
}
