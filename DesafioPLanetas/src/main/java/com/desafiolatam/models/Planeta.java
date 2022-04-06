package com.desafiolatam.models;

import java.util.ArrayList;

public class Planeta {

	private String nombre_planeta;
	private Long distanciaSol;
	private int diametro;
	private ArrayList<Luna> Lunas=new ArrayList<Luna>() ;
	
	
	public Planeta() {
		super();
	
	}

	public Planeta(String nombre_planeta, Long distanciaSol, int diametro) {
		super();
		this.nombre_planeta = nombre_planeta;
		this.distanciaSol = distanciaSol;
		this.diametro = diametro;
	}

	public String getNombre_planeta() {
		return nombre_planeta;
	}

	public void setNombre_planeta(String nombre_planeta) {
		this.nombre_planeta = nombre_planeta;
	}

	public long getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(Long distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public ArrayList<Luna> getLunas() {
		return Lunas;
	}

	public void setLunas(ArrayList<Luna> lunas) {
		Lunas = lunas;
	}


	@Override
	public String toString() {
		return "Planeta: " + nombre_planeta + " está a " + distanciaSol + " km del sol, su tamaño es de " + diametro
				+ " km de diámetro, y tiene "+ getLunas().size()+" Luna/s. \n"+Lunas.toString().replace("[","").replace("]", "");
				
	}

	
	
	
	
	
}