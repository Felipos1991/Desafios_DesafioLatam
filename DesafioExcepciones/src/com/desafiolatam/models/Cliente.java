package com.desafiolatam.models;

public class Cliente {

	private String nombreCliente;
	private int edadCliente;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombreCliente, int edadCliente) {
		super();
		this.nombreCliente = nombreCliente;
		this.edadCliente = edadCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getEdadCliente() {
		return edadCliente;
	}

	public void setEdadCliente(int edadCliente) {
		this.edadCliente = edadCliente;
	}
	
	
	
}
