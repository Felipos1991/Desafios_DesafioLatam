package Main;

public class Noticia {
	
	private String imagen;
	private String titulo;
	private String cuerpo;
	
	
	
	
	public Noticia(String titulo, String cuerpo,String imagen) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.imagen=imagen;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Noticia() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
}
