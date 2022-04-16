package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class leerNoticia {

	
	public ArrayList<Noticia> obtenerNoticia() {

		String archivo = "src/noticias.txt";
		ArrayList<String> listaNoticias = new ArrayList<String>();

		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String lineaArchivo = br.readLine();

			while (lineaArchivo != null) {
				listaNoticias.add(lineaArchivo);
				lineaArchivo=br.readLine();
			}
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<Noticia> listaNews = new ArrayList<Noticia>();
		for (int i = 0; i < listaNoticias.size(); i++) {
			if(listaNoticias.get(i).length()>0) {
			String[] elemNoticia=listaNoticias.get(i).split("@@");
			Noticia noticia=new Noticia(elemNoticia[0], elemNoticia[1], elemNoticia[2]);
			listaNews.add(noticia);
			}
			
		}
		
		System.out.println(listaNews);
		
		return null;

	}
	
}
