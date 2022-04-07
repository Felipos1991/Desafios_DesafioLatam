package Modelo;

public class CategoriaEnum {

	public enum Categoria {
		Activo("Activo"), Inactivo("Inactivo");
		
		Categoria(String value){
			this.value=value;
		}
		public String value;
		@Override
		public String toString() {
			return value;
		}
	}

	
	
	
	

}
