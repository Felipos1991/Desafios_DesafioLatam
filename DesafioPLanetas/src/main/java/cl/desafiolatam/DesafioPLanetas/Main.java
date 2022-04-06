package cl.desafiolatam.DesafioPLanetas;

import java.util.ArrayList;

import com.desafiolatam.models.Luna;
import com.desafiolatam.models.Planeta;
import com.desafiolatam.models.Sistema;


public class Main {

	public static void main(String[] args) {

	ArrayList<Planeta> planetas=new ArrayList<Planeta>();
	
	Planeta venusPlaneta=new Planeta("Venus",108200000L,12104);
	Planeta mercurioPlaneta=new Planeta("Mercurio",57910000L,4880);
	Planeta martePlaneta=new Planeta("Marte",227940000L,6794);
	Planeta tierraPlaneta=new Planeta("Tierra",149600000L,12756);
	Planeta jupiterPlaneta=new Planeta("Jupiter",778330000L,142984);
	Planeta saturnoPlaneta=new Planeta("Saturno",1429400000L,108728);
	Planeta uranoPlaneta=new Planeta("Urano",2870990000L,51118);
	Planeta neptunoPlaneta=new Planeta("Neptuno",4504300000L,49532);
	
	planetas.add(uranoPlaneta);
	planetas.add(jupiterPlaneta);
	planetas.add(martePlaneta);
	planetas.add(mercurioPlaneta);
	planetas.add(neptunoPlaneta);
	planetas.add(saturnoPlaneta);
	planetas.add(tierraPlaneta);
	planetas.add(venusPlaneta);
	
	ArrayList<Luna> lunasTierra=new ArrayList<Luna>();
	Luna lunaTierra=new Luna("Luna",3476,27.3f);
	lunasTierra.add(lunaTierra);
	
	ArrayList<Luna> lunasVenus=new ArrayList<Luna>();
	//arrayList vacío
	
	ArrayList<Luna> lunasMercurio=new ArrayList<Luna>();
	//arrayList vacío
	
	ArrayList<Luna> lunasMarte=new ArrayList<Luna>();
	Luna lunaMarte1=new Luna("Deimos",8,1.263f);
	Luna lunaMarte2=new Luna("Phobos",560,0.319f);
	lunasMarte.add(lunaMarte1);
	lunasMarte.add(lunaMarte2);
	
	ArrayList<Luna> lunasJupiter=new ArrayList<Luna>();
	Luna lunaJupiter1=new Luna("Callisto",4800,16.69f);
	Luna lunaJupiter2=new Luna("Cyllene",2,737.8f);
	lunasJupiter.add(lunaJupiter1);
	lunasJupiter.add(lunaJupiter2);
	
	ArrayList<Luna> lunasSaturno=new ArrayList<Luna>();
	Luna lunaSaturno1=new Luna("Atlas",999,0.602f);
	Luna lunaSaturno2=new Luna("Calypso",480,1.888f);
	lunasSaturno.add(lunaSaturno1);
	lunasSaturno.add(lunaSaturno2);
	
	ArrayList<Luna> lunasUrano=new ArrayList<Luna>();
	Luna lunaUrano1=new Luna("Caliban",80,579.5f);
	Luna lunaUrano2=new Luna("Juliet",84,0.493f);
	lunasUrano.add(lunaUrano1);
	lunasUrano.add(lunaUrano2);
	
	ArrayList<Luna> lunasNeptuno=new ArrayList<Luna>();
	Luna lunaNepturo1=new Luna("Triton",2705,5.788f);
	Luna lunaNeptuno2=new Luna("Larissa",200,0.56f);
	lunasNeptuno.add(lunaNepturo1);
	lunasNeptuno.add(lunaNeptuno2);
	
	Sistema sistema=new Sistema();
	sistema.agregarPlaneta(neptunoPlaneta);
	sistema.agregarPlaneta(jupiterPlaneta);
	sistema.agregarPlaneta(martePlaneta);
	sistema.agregarPlaneta(mercurioPlaneta);
	sistema.agregarPlaneta(saturnoPlaneta);
	sistema.agregarPlaneta(tierraPlaneta);
	sistema.agregarPlaneta(uranoPlaneta);
	sistema.agregarPlaneta(venusPlaneta);
	
	jupiterPlaneta.setLunas(lunasJupiter);
	neptunoPlaneta.setLunas(lunasNeptuno);
	martePlaneta.setLunas(lunasMarte);
	mercurioPlaneta.setLunas(lunasMercurio);
	saturnoPlaneta.setLunas(lunasSaturno);
	tierraPlaneta.setLunas(lunasTierra);
	uranoPlaneta.setLunas(lunasUrano);
	venusPlaneta.setLunas(lunasVenus);
	
	
	sistema.mostrarInfoPlanetas();

	
	}

}
