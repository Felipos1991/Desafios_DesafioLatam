package com.desafiolatam.models;

import java.util.ArrayList;

public class Sistema {

		private ArrayList<Planeta> planetas=new ArrayList<Planeta>();
		
		public void agregarPlaneta(Planeta planeta) {
			this.planetas.add(planeta);
		}
		
		
		
		public void mostrarInfoPlanetas() {
			//recorrer planetas
			for(int i=0;i<planetas.size();i++) {
				System.out.println(planetas.get(i));
			}
			
			
		}
		
	
}
