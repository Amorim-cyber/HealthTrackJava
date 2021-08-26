package br.com.healthTrack.entities;

import br.com.healthTrack.interfaces.InterfaceConta;

public class Conta implements InterfaceConta{
	
	private int id;
	private Usuario usuario;
	private String login;
	private String senha;
	
	public Conta() {}

	@Override
	public Conta logar(String login, String senha) {
		if(login.equals(this.login) && senha.equals(this.senha)) {
			return this;
		}
		return null;
	}

	@Override
	public void registrarNovaConta(int id, String nome, String email, double altura, String login, String senha) {
		this.id = id;
		this.usuario = new Usuario(nome, altura, null, email);
		this.login = login;
		this.senha = senha;
	}

	@Override
	public void editarConta(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	@Override
	public void deletarConta() {
		this.id = 0;
		this.usuario = null;
		this.login = "";
		this.senha = "";
		System.out.println();
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|         CONTA DELETADA!           |");
		System.out.println("|___________________________________|");
		System.out.println();
		
	}
	
	public void mandarEmail(String email) {
		System.out.println();
		System.out.println(".___________________________________.");
		System.out.println("|                                   |");
		System.out.println("|         E-MAIL ENVIADO!           |");
		System.out.println("|___________________________________|");
		System.out.println();
		System.out.println("Destino: "+email);
		System.out.println();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
