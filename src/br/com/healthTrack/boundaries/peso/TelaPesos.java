package br.com.healthTrack.boundaries.peso;

import java.util.Scanner;

import br.com.healthTrack.controller.ControlePesos;
import br.com.healthTrack.test.Teste;

public class TelaPesos {
	
	private ControlePesos controle;
	
	public TelaPesos(ControlePesos controle) {
		this.controle = controle;
	}

	public void printar() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|          LISTA DE PESOS           |");
		System.out.println("|                                   |");
		System.out.println("|  ID        DATA            KG     |");
		System.out.println("|                                   |");
		listar();
		System.out.println("| Digite 1 para incluir um peso     |");
		System.out.println("| Digite 2 para editar um peso      |");
		System.out.println("| Digite 3 para deletar um peso     |");
		System.out.println("| Digite 4 para voltar ao menu      |");
		System.out.println("|___________________________________|");
		System.out.println();
		System.out.print(">>> ");
		
	}
	
	public void avisarSucesso(String tipo) {
		
		if(tipo.equals("1")) {
			System.out.println(".___________________________________.");
			System.out.println("|                                   |");
			System.out.println("|     PESO CRIADO COM SUCESSO!      |");
			System.out.println("|___________________________________|");
			System.out.println();
		}else if(tipo.equals("2")){
			System.out.println(".___________________________________.");
			System.out.println("|                                   |");
			System.out.println("|     PESO EDITADO COM SUCESSO!     |");
			System.out.println("|___________________________________|");
			System.out.println();
		}else {
			System.out.println(".___________________________________.");
			System.out.println("|                                   |");
			System.out.println("|     PESO DELETADO COM SUCESSO!    |");
			System.out.println("|___________________________________|");
			System.out.println();
		}
		
	}
	
	public void incluir() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|          REGISTRAR PESO           |");
		System.out.println("|___________________________________|");
		System.out.println();
		
	}
	
	public void editar() {
		
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|            EDITAR PESO            |");
		System.out.println("|___________________________________|");
		System.out.println();
		
	}
	
	public void executar(String opcao) {
		Scanner sc = new Scanner(System.in);
		switch(opcao) {
		case "1":{
			registrarPeso();
			break;
		}
		case "2":{
			editarPeso();
			break;
		}
		case "3":{
			deletarPeso();
			break;
		}
		case "4":{
			Teste.chamarTelaMenu(sc);
			break;		
		}
		default:
			Teste.chamarTelaInvalida();
			Teste.chamarTelaPesos(sc);
		}
	}
	
	private void listar() {
		
		controle.mostrarPesos();
		
	}
	
	private void registrarPeso() {
		Scanner sc = new Scanner(System.in);
		incluir();
		System.out.print("-> Digite seu Peso: ");
		double peso = sc.nextFloat();
		controle.registrarNovoPeso(peso);
		avisarSucesso("1");
		Teste.chamarTelaPesos(sc);
	}
	
	private void editarPeso() {
		Scanner sc = new Scanner(System.in);
		editar();
		System.out.print("-> Digite o ID do peso: ");
		long id = sc.nextLong();
		if(controle.estaInvalido(id)) {
			Teste.chamarTelaInvalida();
			Teste.chamarTelaPesos(sc);
		}
		System.out.print("-> Digite o novo Peso: ");
		double peso = sc.nextFloat();
		controle.editarPeso(id,peso);
		avisarSucesso("2");
		Teste.chamarTelaPesos(sc);
	}
	
	private void deletarPeso() {
		Scanner sc = new Scanner(System.in);
		editar();
		System.out.print("-> Digite o ID do peso: ");
		long id = sc.nextLong();
		if(controle.estaInvalido(id)) {
			Teste.chamarTelaInvalida();
			Teste.chamarTelaPesos(sc);
		}
		controle.deletarPeso(id);
		avisarSucesso("3");
		Teste.chamarTelaPesos(sc);
	}

	public ControlePesos getControle() {
		return controle;
	}

	public void setControle(ControlePesos controle) {
		this.controle = controle;
	}
	
}
