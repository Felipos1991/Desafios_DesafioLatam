package com.desafiolatam.metodos;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.desafiolatam.models.Book;
import com.desafiolatam.models.BookDetail;

public class MetodosBook {

	public void obtenerLista() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com").path("Himuravidal/anchorBooks/books");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Book> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Book>>() {
		});
		System.out.println(listaPublicaciones);
	}

	public void autorTitulo() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com").path("Himuravidal/anchorBooks/books");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Book> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Book>>() {
		});

		for (Book book : listaPublicaciones) {
			System.out.println(book.getAuthor() + " : " + book.getTitle());
		}
	}

	public void libroTresOcho() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com").path("Himuravidal/anchorBooks/books");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Book> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Book>>() {
		});

		for (Book book : listaPublicaciones) {
			if (book.getId() == 3 || book.getId() == 8) {
				System.out.println("Libro número "+book.getId()+": "+book.getAuthor()+","+book.getTitle()+","+book.getCountry());
			} 
		}
	}
	
	public void leerBookDetail() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com").path("Himuravidal/anchorBooks/bookDetail");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<BookDetail> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<BookDetail>>() {
		});
		for (BookDetail bookDetail : listaPublicaciones) {
			System.out.println(bookDetail.toString().replaceFirst(",", ""));
		}
	}
	
	public void librosAnonimos() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com").path("Himuravidal/anchorBooks/books");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Book> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Book>>() {
		});
		System.out.println("Autores Anonimos:\n");
		for (Book book : listaPublicaciones) {
			if(book.getAuthor().equals("Unknown")) {
				System.out.println("Author: "+book.getAuthor()+" - "+book.getTitle());
			}
		}
	}
	
	public void deliveryLibros() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com").path("Himuravidal/anchorBooks/bookDetail");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<BookDetail> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<BookDetail>>() {
		});
		System.out.println("Libros con delivery disponible:\n");
		for (BookDetail bookDetail : listaPublicaciones) {
			
			if(bookDetail.getDelivery()) {
				System.out.println("Libro: "+bookDetail.getTitle());
			}
			
		}
		
	}
		
}
	
	


