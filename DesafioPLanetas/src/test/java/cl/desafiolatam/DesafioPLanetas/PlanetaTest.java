package cl.desafiolatam.DesafioPLanetas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.Test;

import com.desafiolatam.models.Luna;
import com.desafiolatam.models.Planeta;

public class PlanetaTest {

	
	private static Logger logger=Logger.getLogger("");
	
	@Test
	public void testCantidadLunas() {
		logger.info("Test para cantidad de lunas ingresadas");
		ArrayList<Luna> testLunasJupiter=new ArrayList<Luna>();
		Luna lunaJupiter1=new Luna("Callisto",4800,16.69f);
		Luna lunaJupiter2=new Luna("Cyllene",2,737.8f);
		testLunasJupiter.add(lunaJupiter1);
		testLunasJupiter.add(lunaJupiter2);
		Planeta jupiter=new Planeta("Jupiter",778330000L,142984);
		jupiter.setLunas(testLunasJupiter);
		assertEquals(2,jupiter.getLunas().size());
	}
	
	@Test
	public void testNombrePlaneta() {
		logger.info("Test para probar nombre de planetas");
		Planeta jupiter=new Planeta("Jupiter",778330000L,142984);
	
		assertTrue(jupiter.getNombre_planeta().equals("Jupiter"));
	}
	
	@Test
	public void testIngresoCorrectoLunas() {
		logger.info("Test para probar el ingreso correcto de las lunas");
		ArrayList<Luna> testLunasJupiter=new ArrayList<Luna>();
		Luna lunaJupiter1=new Luna("Callisto",4800,16.69f);
		Luna lunaJupiter2=new Luna("Cyllene",2,737.8f);
		testLunasJupiter.add(lunaJupiter1);
		testLunasJupiter.add(lunaJupiter2);
		Planeta jupiter=new Planeta("Jupiter",778330000L,142984);
		jupiter.setLunas(testLunasJupiter);
		assertTrue(jupiter.getLunas().size()>0);
	}
	
	@Test
	public void testCantidadLunasTrue() {
		logger.info("Test para probar cantidad correcta de lunas(False/True)");
		ArrayList<Luna> testLunasJupiter=new ArrayList<Luna>();
		Luna lunaJupiter1=new Luna("Callisto",4800,16.69f);
		Luna lunaJupiter2=new Luna("Cyllene",2,737.8f);
		testLunasJupiter.add(lunaJupiter1);
		testLunasJupiter.add(lunaJupiter2);
		Planeta jupiter=new Planeta("Jupiter",778330000L,142984);
		jupiter.setLunas(testLunasJupiter);
		assertTrue(jupiter.getLunas().size()==2);
	}
	
	
}
		

