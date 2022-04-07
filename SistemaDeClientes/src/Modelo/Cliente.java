package Modelo;

import Modelo.CategoriaEnum.Categoria;

public class Cliente {
	
	String runCliente;
	String nombreCliente;
	String apellidoCliente;
	String aniosCliente;
	String estado;

	
	public Cliente(String runCliente, String nombreCliente, String apellidoCliente, String aniosCliente,
			String estado) {
		super();
		this.runCliente = runCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.aniosCliente = aniosCliente;
		this.estado = estado;
	}


	
	public Cliente() {
		super();
	}




	public Cliente(String runCliente, String nombreCliente, String apellidoCliente, String aniosCliente) {
		super();
		this.runCliente = runCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.aniosCliente = aniosCliente;
	}

	public String getRunCliente() {
		return runCliente;
	}

	public void setRunCliente(String runCliente) {
		this.runCliente = runCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getAniosCliente() {
		return aniosCliente;
	}

	public void setAniosCliente(String aniosCliente) {
		this.aniosCliente = aniosCliente;
	}





	@Override
	public String toString() {
		return "Cliente runCliente=" + runCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
				+ apellidoCliente + ", aniosCliente=" + aniosCliente;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public void setCategoriaEnum(Categoria activo) {
		
		
	}
	
	
	

}

