package es.cic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DibujoImplTest {
	
	DibujoImpl dibujo = new DibujoImpl();
	List<Figura> listado = new ArrayList<Figura>();
	
	@Test
	public void testCrearFigura() {
		Figura f = new Circulo(999, 40, 40, "negro", 100);
		assertEquals("circulo", dibujo.crearFigura(listado, f));
		
		f = new Cuadrado(999, 40, 40, "negro", 100);
		assertEquals("cuadrado", dibujo.crearFigura(listado, f));
		
		f = new Linea(999, 40, 40, "negro", 100, 80, 80, 80);
		assertEquals("linea", dibujo.crearFigura(listado, f));
		
		f = new Figura(999, 40, 40, "negro");
		assertEquals("punto", dibujo.crearFigura(listado, f));
	}
	
	@Test
	public void testEliminarFigura() {
		Figura f = new Circulo(999, 40, 40, "negro", 100);
		listado.add(f);
		assertTrue(dibujo.eliminarFigura(listado, f));
	}
	
	@Test
	public void testMoverFigura() {
		Figura f = new Circulo(999, 40, 40, "negro", 100);
		listado = dibujo.moverFigura(listado, f, 999, 998);
		assertEquals(999, listado.get(0).xcord, 0.000001);
		assertEquals(998, listado.get(0).ycord, 0.000001);
		
		f = new Linea(999, 40, 40, "negro", 100, 80, 80, 80);
		listado = dibujo.moverFigura(listado, f, 999, 998);
		f = (Linea) listado.get(1);
		assertEquals(999, ((Linea) f).xpunto, 0.000001);
		assertEquals(998, ((Linea) f).ypunto, 0.000001);
	}

}
