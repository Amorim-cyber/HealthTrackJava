package br.com.healthTrack.model;

import java.util.List;

import br.com.healthTrack.entities.Peso;

public abstract class Pessoa {
	
	protected String nome;
	protected double altura;
	protected List<Peso> pesos;
	
	
	public Pessoa(String nome, double altura, List<Peso> pesos) {
		this.nome = nome;
		this.altura = altura;
		this.pesos = pesos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public List<Peso> getPesos() {
		return pesos;
	}
	public void setPesos(List<Peso> pesos) {
		this.pesos = pesos;
	}
	
	

}
