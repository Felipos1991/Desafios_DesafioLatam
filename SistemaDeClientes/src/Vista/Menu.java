package Vista;

import java.util.Scanner;

import Servicio.ClienteServicio;


public class Menu {

	public void Menu_metodo() {
		
		Scanner sc= new Scanner(System.in);
		ClienteServicio clienteServicio=new ClienteServicio();
		//añadir instancias
		
		int opcion_main = 0;
		do {
		
		System.out.println("********************Sistema de Clientes******************");
		System.out.println();
		System.out.println("*********************************************************");
		System.out.println("****                  1-Listar Clientes              ****");
		System.out.println("****                  2-Agregar Cliente              ****");
		System.out.println("****                  3-Editar Cliente               ****");
		System.out.println("****                  4-Cargar Datos                 ****");
		System.out.println("****                  5-Exportar Datos               ****");
		System.out.println("****                       6-Salir                   ****");
		System.out.println("*********************************************************");
		System.out.println("****                  Ingrese una opción             ****\n");
	
		opcion_main=sc.nextInt();
		
		switch (opcion_main) {
		case 1:
			clienteServicio.listarCliente();;
			
			break;

		case 2:
			clienteServicio.agregarCliente(sc);
			break;
		
		case 3:
			clienteServicio.editarClientes(clienteServicio.getListaClientes());
				break;
		case 4:
			clienteServicio.setListaClientes(clienteServicio.cargarClientes());;
		break;
		
		case 5:
			clienteServicio.exportar(clienteServicio.getListaClientes());
			break;
		}
		
		
		}while( opcion_main>=1 && opcion_main<=5);
		System.out.println("Abandonando el sistema de clientes...");
		}
}
