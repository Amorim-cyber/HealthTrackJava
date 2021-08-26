package br.com.healthTrack.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.healthTrack.entities.Peso;
import br.com.healthTrack.entities.Usuario;

public class ControlePesos {

	private Usuario usuario;
	
	public boolean estaInvalido(long id) {
		if(usuario.mostrarPesoPorID(id)==null) {
			return true;
		}
		return false;
	}

	public ControlePesos(Usuario usuario) {
		this.usuario = usuario;
	}

	public void mostrarPesos() {
		List<Peso> pesos = usuario.mostrarPesos().stream()
		        .sorted(Comparator.comparingLong(Peso::getId).reversed())
		        .collect(Collectors.toList());
		
		if(pesos == null) {
			System.out.println("|Nenhum peso registrado no momento  |");
			System.out.println();
		}else {
			for(Peso peso : pesos) {
				System.out.println("|  "+peso.getId()+"         "+peso.getData()+"      "+peso.getPeso()+"     |");
				System.out.println();
			}
		}
	}

	public void registrarNovoPeso(double peso) {
		usuario.registrarNovoPeso(peso);
		
	}

	public void editarPeso(long id, double peso) {
		usuario.editarPeso(id, peso);
	}

	public void deletarPeso(long id) {
		usuario.deletarPeso(id);
		
	}

	public void mostrarResultados() {
		List<Peso> pesos = usuario.mostrarPesos().stream()
		        .sorted(Comparator.comparingLong(Peso::getId).reversed())
		        .collect(Collectors.toList());
		
		if(pesos == null) {
			System.out.println("|Nenhum peso registrado no momento  |");
			System.out.println();
		}else {
			
			for(Peso peso : pesos) {
				int index = (int)(peso.getPeso()/120*22);
				System.out.println("|  "+peso.getId()+" "+"█".repeat(index)+" ".repeat(22-index)+" |");
				System.out.println();
			}
		}
		
	}

	public void calcularIMC() {
		double imc = usuario.mostrarPesos().get(usuario.mostrarPesos().size()-1).getPeso()/usuario.getAltura()*usuario.getAltura();
		System.out.println("|IMC: "+imc+"                          |");
		
	}

	
	
}
