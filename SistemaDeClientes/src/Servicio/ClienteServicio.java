package Servicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Modelo.CategoriaEnum;
import Modelo.CategoriaEnum.Categoria;
import Modelo.Cliente;

public class ClienteServicio {

	private ArrayList<Cliente> listaClientes;

	public ClienteServicio() {
		super();
		this.listaClientes = new ArrayList<Cliente>();
	}

	public ClienteServicio(ArrayList<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public void listarCliente() {
		for (Cliente cliente : listaClientes) {
			System.out.println("----------Datos del Cliente---------");
			System.out.println("Run del Cliente: " + cliente.getRunCliente());
			System.out.println("Nombre del Cliente: " + cliente.getNombreCliente());
			System.out.println("Apellido del Cliente: " + cliente.getApellidoCliente());
			System.out.println("Años como cliente: " + cliente.getAniosCliente());
			System.out.println("Estado Cliente: " + cliente.getEstado());
			System.out.println("\n--------------------------------------\n");
		}
	}

	public void agregarCliente(Scanner sc) {
		sc.nextLine();

		System.out.println("----------Crear Cliente----------\n");
		System.out.println("Ingresa Run del Cliente \n");
		String runCliente = sc.nextLine();

		System.out.println("Ingrese Nombre del Cliente");
		String nombreCliente = sc.nextLine();

		System.out.println("Ingrese apellido del Cliente");
		String apellidoCliente = sc.nextLine();

		System.out.println("Ingrese años como Cliente: ");
		String aniosCliente = sc.nextLine();

		System.out.println("\n----------Cliente Agregado----------\n");

		Cliente cliente = new Cliente();
		cliente.setRunCliente(runCliente);
		cliente.setNombreCliente(nombreCliente);
		cliente.setApellidoCliente(apellidoCliente);
		cliente.setAniosCliente(aniosCliente);
		cliente.setEstado(Categoria.Activo.toString());

		System.out.println(cliente);
		listaClientes.add(cliente);
	}

	public ArrayList<Cliente> cargarClientes() {
		String archivo = "src/ClientesImportados.csv";
		ArrayList<Cliente> clientesARetornar = new ArrayList<Cliente>();

		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String lineaArchivo = br.readLine();

			while (lineaArchivo != null) {
				String[] elementoCliente = lineaArchivo.split(",");
				Cliente clienteTemporal = new Cliente(elementoCliente[0], elementoCliente[1], elementoCliente[2],
						elementoCliente[3], elementoCliente[4]);
				clientesARetornar.add(clienteTemporal);
				lineaArchivo = br.readLine();

				fr.close();
				br.close();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n***********Archivo importado con éxito***********\n");
		return clientesARetornar;
	}

	public void editarClientes(ArrayList<Cliente> clientes) {
		Scanner ed = new Scanner(System.in);
		System.out.println("Ingrese el número 1 para continuar con la edición de datos");
		int opcion = ed.nextInt();
		ed.nextLine();
		String rutCliente = "";

		if (opcion == 1) {
			System.out.println("\n******Ingrese rut del cliente******\n");
			rutCliente = ed.nextLine();

			boolean verificador = true;
			for (int i = 0; i < clientes.size(); i++) {

				rutCliente.compareTo(clientes.get(i).getRunCliente());
				if (rutCliente.compareTo(clientes.get(i).getRunCliente()) == 0) {
					System.out.println("\n******Cliente encontrado******\n");
					verificador = false;
					if (opcion == 1) {
						int opcion_editar = 0;
						System.out.println("------Editar Cliente------");
						System.out.println("------Seleccione que desea hacer------");
						System.out.println("------1.Cambiar el estado del cliente------");
						System.out.println("------2.Editar los datos ingresados del cliente------");
						opcion_editar = ed.nextInt();
						if (opcion_editar == 1) {
							ed.nextLine();
							System.out.println("Actualizando estado de cliente");
							System.out.println("El estado actual es: " + clientes.get(i).getEstado());
							System.out.println("1.Si desea mantener inactivo");
							System.out.println("2.Si desea mantener activo");
							int opcion_actividad = ed.nextInt();
							if (opcion_actividad == 1) {
								clientes.get(i).setEstado(Categoria.Inactivo.toString());
							} else if (opcion_actividad == 2) {
								clientes.get(i).setEstado(Categoria.Activo.toString());
							}
							System.out.println("El estado del cliente es:" + clientes.get(i).getEstado());
						} else if (opcion_editar == 2) {
							ed.nextLine();
							System.out.println("Ingrese opción a editar de los datos del cliente");
							System.out.println("1.Rut: " + clientes.get(i).getRunCliente());
							System.out.println("2.Nombre :" + clientes.get(i).getNombreCliente());
							System.out.println("3.Apellido :" + clientes.get(i).getApellidoCliente());
							System.out.println("4.Años como cliente: " + clientes.get(i).getAniosCliente());
							int opcion_datos = ed.nextInt();

							switch (opcion_datos) {
							case 1: {
								System.out.println("1. Ingrese nuevo rut del cliente");
								ed.nextLine();
								String nuevo_rut = ed.nextLine();
								clientes.get(i).setRunCliente(nuevo_rut);
								System.out.println("Rut Actualizado");
								break;
							}
							case 2: {
								System.out.println("2.Ingrese nuevo nombre de cliente");
								String nuevo_nombre = ed.nextLine();
								clientes.get(i).setNombreCliente(nuevo_nombre);
								System.out.println("Nombre Actualizado");
								break;
							}
							case 3: {
								System.out.println("3.Ingrese nuevo apellido de cliente");
								String nuevo_apellido = ed.nextLine();
								clientes.get(i).setApellidoCliente(nuevo_apellido);
								System.out.println("Apelido Actualizado");
								break;
							}
							case 4: {
								System.out.println("4.Ingrese Años como cliente");
								String nuevo_anios = ed.nextLine();
								clientes.get(i).setAniosCliente(nuevo_anios);
								System.out.println("Años como cliente Actualizado");
								break;
							}

							}

						}
					}
					
				}
				if (verificador == true) {
					System.out.println("\n******Cliente no encontrado******\n");
				}
			}
		}
	}
}
