package es.cic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DibujoImplTest {
	
	DibujoImpl dibujo = new DibujoImpl();
	List<Figura> listado = new ArrayList<Figura>();
	
	@Test
	public void testCrear() {
		Figura f = new Circulo(999, 40, 40, "negro", 100);
		assertEquals("circulo", dibujo.crear(listado, f));
		
		f = new Cuadrado(999, 40, 40, "negro", 100);
		assertEquals("cuadrado", dibujo.crear(listado, f));
		
		f = new Linea(999, 40, 40, "negro", 100, 80, 80);
		assertEquals("linea", dibujo.crear(listado, f));
		
		f = new Figura(999, 40, 40, "negro");
		assertEquals("punto", dibujo.crear(listado, f));
	}
	
	@Test
	public void testEliminar() {
		Figura f = new Circulo(999, 40, 40, "negro", 100);
		listado.add(f);
		assertTrue(dibujo.eliminar(listado, f));
	}
	
	@Test
	public void testMover() {
		Figura f = new Circulo(999, 40, 40, "negro", 100);
		listado = dibujo.mover(listado, f, 999, 998);
		assertEquals(999, listado.get(0).getXcord(), 0.000001);
		assertEquals(998, listado.get(0).getYcord(), 0.000001);
		
		f = new Linea(999, 40, 40, "negro", 100, 80, 80);
		listado = dibujo.mover(listado, f, 999, 998);
		assertEquals(999, listado.get(0).getXcord(), 0.000001);
		assertEquals(998, listado.get(0).getYcord(), 0.000001);
		assertEquals(1079, ((Linea) listado.get(1)).getXpunto(), 0.000001);
		assertEquals(1078, ((Linea) listado.get(1)).getYpunto(), 0.000001);
	}
	
	@Test
	public void testTransformar() {	
		Figura f = new Circulo(999, 40, 40, "negro", 100);
		listado = dibujo.transformar(listado, f, 199, null, null);
		assertEquals(199, ((Circulo) listado.get(0)).getRadio(), 0.000001);
		
		f = new Cuadrado(999, 40, 40, "negro", 100);
		listado = dibujo.transformar(listado, f, 199, null, null);
		assertEquals(199, ((Cuadrado) listado.get(1)).getLado(), 0.000001);
		
		f = new Linea(999, 40, 40, "negro", 100, 80, 80);
		listado = dibujo.transformar(listado, f, null, 999, 998);
		assertEquals(999, listado.get(2).getXcord(), 0.000001);
		assertEquals(998, listado.get(2).getYcord(), 0.000001);
	}
	
	@Test
	public void testComprobarTamaño() {
		Figura f = new Circulo(999, 1000001, 1, "negro", 100);
		assertFalse(dibujo.comprobarTamaño(f));
		
		f = new Circulo(999, 1000000, 1, "negro", 100);
		assertTrue(dibujo.comprobarTamaño(f));
	}

}
