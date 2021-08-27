package br.com.healthTrack.boundaries.peso;

import java.util.Scanner;

import br.com.healthTrack.controller.ControlePesos;
import br.com.healthTrack.test.Teste;

public class TelaDashboard {
	
	private ControlePesos controle;
	
	public TelaDashboard(ControlePesos controle) {
		this.controle = controle;
	}
	
	public void printar() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|             DASHBOARD             |");
		System.out.println("|                                   |");
		listar();
		calcularIMC();
		System.out.println("|                                   |");
		System.out.println("|Digite 1 para voltar ao menu       |");
		System.out.println("|___________________________________|");
		System.out.println();
		System.out.print(">>> ");
		
	}
	
	public void executar(String opcao) {
		Scanner sc = new Scanner(System.in);
		switch(opcao) {
		case "1":{
			Teste.chamarTelaMenu(sc);
			break;
		}
		default:
			Teste.chamarTelaInvalida();
			Teste.chamarTelaDashboard(sc);
		}
	}
	
	
	private void listar() {
		
		controle.mostrarResultados();
		
	}
	
	private void calcularIMC() {
		controle.calcularIMC();
	}

}
