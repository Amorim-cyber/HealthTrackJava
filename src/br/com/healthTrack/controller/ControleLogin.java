package br.com.healthTrack.controller;

import br.com.healthTrack.entities.Conta;

public class ControleLogin {
	
	private Conta conta = new Conta();
	
	public boolean estaInvalido(String senha, String senha2,String email) {
		if(!senha.equals(senha2) || !email.contains("@")) {
			return true;
		}
		return false;
	}

	public void registrarConta(String login, String senha, String nome, String email, double altura) {
		conta.registrarNovaConta(0, nome, email, altura, login, senha);
	}

	public Conta logar(String login, String senha) {
		return conta.logar(login, senha);
	}

	public void mandarEmail(String email) {
		
		new Conta().mandarEmail(email);
		
	}
	
	public void deletar() {
		conta.deletarConta();
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void editarConta(String login, String senha) {
		conta.editarConta(login, senha);
	}

	

	
}
