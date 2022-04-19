package com.desafiolatam.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibroVenta {

	private String nombreVenta;
	private String fechaVenta;
	Cliente cliente;
	Vehiculo vehiculo;

	public LibroVenta(String nombreVenta, String fechaVenta, Cliente cliente, Vehiculo vehiculo) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
		this.cliente = cliente;
		this.vehiculo = vehiculo;
	}

	public LibroVenta(String nombreVenta, String fechaVenta) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public LibroVenta() {
		super();
	}

	public String getNombreVenta() {
		return nombreVenta;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public void guardarVenta() {
		System.out.println("----------Registro de Venta----------");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese nombre de venta");
		String nombre_venta=sc.nextLine();
		
		//El archivo se guardará en la carpeta src
		File archivo=new File("src/"+nombre_venta+".txt");
		
		if(!archivo.exists()) {
			
			try {
				
				System.out.println("Ingrese Nombre de Cliente");
				String nombre_cliente=sc.nextLine();
				System.out.println("Ingrese edad de cliente (Formato numérico)");
				int edad_cliente=sc.nextInt();
				Cliente cliente=new Cliente(nombre_cliente,edad_cliente);
				sc.nextLine();
				
				System.out.println("Ingrese patente de vechículo (Formato Chile alfanumérico)");
				String patente=sc.nextLine();
				Vehiculo vehiculo=new Vehiculo(patente);
				
				System.out.println("Ingrese fecha de venta (Ej.02122022 (DíaMesAño)");
				String fecha_venta=sc.nextLine();
				LibroVenta libroVenta=new LibroVenta(nombre_venta,fecha_venta,cliente,vehiculo);
				int fechaNumerica=Integer.parseInt(fecha_venta);
				archivo.createNewFile();
				
				FileWriter archivoWriter=new FileWriter(archivo);
				BufferedWriter archivoBuff = new BufferedWriter(archivoWriter);
				String archivoVehiculo="Patente: "+libroVenta.getVehiculo().getPatente()+"\n"+"Nombre Cliente: "+libroVenta.getCliente().getNombreCliente()+"\n"
						+"Edad Cliente: "+libroVenta.getCliente().getEdadCliente()+"\n"+"Fecha de venta: "+fechaNumerica+"\n"+"Nombre Venta: "+libroVenta.getNombreVenta();
				
				archivoBuff.write(archivoVehiculo);
				archivoBuff.close();
				archivoWriter.close();
				System.out.println("Archivo exportado con éxito."
						+ "Para ingresar nuevo informe, ejecute nuevamente el programa.");
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InputMismatchException ime) {
				System.out.println("Error en el ingreso de los datos. Siga el formato de ingreso.");
				System.out.print("Ejecute nuevamente"); 
			}catch (NumberFormatException nfe) {
				System.out.println("El formato de fecha ingresago debe corresponder al indicado."
						+ "\n Vuelta a ejecutar el programa.");
			}
	}else {
		System.out.println("Archivo existe, ejecute nuevamente programa y escoja otro nombre");
	}

}

}
