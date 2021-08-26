package br.com.healthTrack.controller;

import br.com.healthTrack.entities.Usuario;

public class ControleUsuario {
	
	private Usuario usuario;

	public ControleUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario mostrarUsuario() {
		return usuario.mostrarUsuario();
	}

	public void editarUsuario(String nome, String email, double altura) {
		usuario.editarUsuario(nome, email, altura);
		
	}

	public boolean estaInvalido(String email) {
		if(!email.contains("@")) {
			return true;
		}
		return false;
	}
	
}
