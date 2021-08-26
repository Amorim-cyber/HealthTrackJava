package br.com.healthTrack.interfaces;

import br.com.healthTrack.entities.Conta;

public interface InterfaceConta {
	
	public abstract Conta logar(String login, String senha);

	public abstract void registrarNovaConta(int id, String nome, String email, double altura, String login, String senha);

	public abstract void editarConta(String login, String senha);

	public abstract void deletarConta();
	
}
