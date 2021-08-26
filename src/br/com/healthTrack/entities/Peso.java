package br.com.healthTrack.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Peso {
	
	private long id;
	private Date data;
	private double peso;

	public Peso(long id, double peso) {
		data=java.util.Calendar.getInstance().getTime();
		this.id = id;
		this.peso = peso;
	}
		
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getData() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		return formato.format(data);
	}

	public void setData(String data) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		try {
			this.data = formato.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	
}
