package br.com.healthTrack.entities;

import java.util.List;

import br.com.healthTrack.interfaces.InterfaceUsuario;
import br.com.healthTrack.model.Pessoa;

public class Usuario extends Pessoa implements InterfaceUsuario{
	
	private String email;

	public Usuario(String nome, double altura, List<Peso> pesos, String email) {
		super(nome,altura,pesos);
		this.email = email;
	}

	@Override
	public Usuario mostrarUsuario() {
		return this;
	}

	@Override
	public void editarUsuario(String nome, String email, double altura) {
		this.nome = nome;
		this.email = email;
		this.altura = altura;
		
	}
	
	@Override
	public List<Peso> mostrarPesos() {
		return pesos;
	}

	@Override
	public void registrarNovoPeso(double peso) {
		long id = pesos.size();
		pesos.add(new Peso(id,peso));
		
	}

	@Override
	public void editarPeso(long id, double peso) {
		pesos.get((int) id).setPeso(peso);
	}

	@Override
	public void deletarPeso(long id) {
		pesos.remove((int) id);
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public Peso mostrarPesoPorID(long id) {
		
		return pesos.get((int) id);
	}

}
