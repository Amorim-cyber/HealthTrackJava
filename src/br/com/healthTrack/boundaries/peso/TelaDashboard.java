package br.com.healthTrack.boundaries.peso;

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
		System.out.println("|                                   |");
		calcularIMC();
		System.out.println("|                                   |");
		System.out.println("|Digite 1 para voltar ao menu       |");
		System.out.println("|___________________________________|");
		System.out.println();
		System.out.print(">>> ");
		
	}
	
	public void executar(String opcao) {
		switch(opcao) {
		case "1":{
			Teste.chamarTelaMenu();
			break;
		}
		default:
			Teste.chamarTelaInvalida();
			Teste.chamarTelaDashboard();
		}
	}
	
	
	private void listar() {
		
		controle.mostrarResultados();
		
	}
	
	private void calcularIMC() {
		controle.calcularIMC();
	}

}
