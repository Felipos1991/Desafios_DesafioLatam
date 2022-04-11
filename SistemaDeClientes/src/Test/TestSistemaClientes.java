package Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.Test;

import Modelo.Cliente;
import Modelo.CategoriaEnum.Categoria;

public class TestSistemaClientes {

	private static Logger logger = Logger.getLogger("");
	
	
	@Test
	public void testAgregarCliente() {
		logger.info("Prueba adición cliente");
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		Cliente clientePrueba = new Cliente("17856599-0", "Felipe", "Silva", "1", Categoria.Activo.toString());
		boolean Prueba = listaClientes.add(clientePrueba);
		assertTrue("Adición exitosa", Prueba);
	}
	
	@Test
	public void testClienteNull() {
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		listaClientes=null;
		Cliente clienteNulo=new Cliente();
		String runCliente ="";
		String nombreCliente ="";
		String apellidoCliente ="";
		String aniosCliente ="";
		clienteNulo.setRunCliente(runCliente);
		clienteNulo.setNombreCliente(nombreCliente);;
		clienteNulo.setApellidoCliente(apellidoCliente);;
		clienteNulo.setAniosCliente(aniosCliente);
		clienteNulo.setEstado(null);
		
		if(runCliente!=null && nombreCliente!=null && apellidoCliente!=null && aniosCliente!=null && !runCliente.equals("") && !nombreCliente.equals("") && !apellidoCliente.equals("") && !aniosCliente.equals("")) {
			listaClientes.add(clienteNulo);
		}else {
			System.out.println("Lista Clientes "+listaClientes);
		}
		assertNull(listaClientes);
	}
	
	
	
}
