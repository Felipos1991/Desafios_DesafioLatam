package com.desafiolatam.models;

import java.util.ArrayList;

public class Sistema {

		private ArrayList<Planeta> planetas=new ArrayList<Planeta>();
		
		public void agregarPlaneta(Planeta planeta) {
			this.planetas.add(planeta);
		}
		
		
		//Este método muestra la información conjunta de los planetas y sus lunas.
		//Se modificó el toString de planetas para dicho fin.
		//Para mostrar la información solo del planeta es necesario modificar el toString.
		public void mostrarInfoPlanetasLunas() {
			//recorrer planetas
			for(int i=0;i<planetas.size();i++) {
				System.out.println(planetas.get(i));
			}
			
			
		}
		
	
}
