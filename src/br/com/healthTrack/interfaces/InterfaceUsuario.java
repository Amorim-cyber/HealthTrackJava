package br.com.healthTrack.interfaces;

import java.util.List;

import br.com.healthTrack.entities.Peso;
import br.com.healthTrack.entities.Usuario;

public interface InterfaceUsuario {
	
	public abstract Usuario mostrarUsuario();

	public abstract void editarUsuario(String nome, String email, double altura);
	
	public abstract List<Peso> mostrarPesos();
	
	public abstract Peso mostrarPesoPorID(long id);
	
	public abstract void registrarNovoPeso(double peso);

	public abstract void editarPeso(long id,double peso);

	public abstract void deletarPeso(long id);
	
}
