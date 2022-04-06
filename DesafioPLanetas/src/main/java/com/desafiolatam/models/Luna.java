package com.desafiolatam.models;


public class Luna {
	
	public String nombre_luna;
	public int diametro_luna;
	public float tiempoOrbita;
	
	public Luna() {
		super();
	}

	public Luna(String nombre_luna, int diametro_luna, float tiempoOrbita) {
		super();
		this.nombre_luna = nombre_luna;
		this.diametro_luna = diametro_luna;
		this.tiempoOrbita = tiempoOrbita;
	}

	public String getNombre_luna() {
		return nombre_luna;
	}

	public void setNombre_luna(String nombre_luna) {
		this.nombre_luna = nombre_luna;
	}

	public int getDiametro_luna() {
		return diametro_luna;
	}

	public void setDiametro_luna(int diametro_luna) {
		this.diametro_luna = diametro_luna;
	}

	public float getTiempoOrbita() {
		return tiempoOrbita;
	}

	public void setTiempoOrbita(float tiempoOrbita) {
		this.tiempoOrbita = tiempoOrbita;
	}

	@Override
	public String toString() {
		return "Luna de nombre " + nombre_luna + " que mide " + diametro_luna + " km de diámetros y el tiempo de orbita"
				+ " es de "
				+ tiempoOrbita+" días. ";
	}
	
	

}