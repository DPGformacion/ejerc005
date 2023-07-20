package es.cic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

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
		assertEquals(999, listado.get(0).xcord, 0.000001);
		assertEquals(998, listado.get(0).ycord, 0.000001);
		assertEquals(1079, ((Linea) listado.get(1)).xpunto, 0.000001);
		assertEquals(1078, ((Linea) listado.get(1)).ypunto, 0.000001);
	}
	
	@Test
	public void testTransformarFigura() {	
		Figura f = new Circulo(999, 40, 40, "negro", 100);
		listado = dibujo.transformarFigura(listado, f, 199, null, null);
		assertEquals(199, ((Circulo) listado.get(0)).radio, 0.000001);
		
		f = new Cuadrado(999, 40, 40, "negro", 100);
		listado = dibujo.transformarFigura(listado, f, 199, null, null);
		assertEquals(199, ((Cuadrado) listado.get(1)).lado, 0.000001);
		
		f = new Linea(999, 40, 40, "negro", 100, 80, 80, 80);
		listado = dibujo.transformarFigura(listado, f, null, 999, 998);
		assertEquals(999, listado.get(2).xcord, 0.000001);
		assertEquals(998, listado.get(2).ycord, 0.000001);
	}
	
	@Test
	public void testComprobarTamaño() {
		Figura f = new Circulo(999, 1000001, 1, "negro", 100);
		assertFalse(dibujo.comprobarTamaño(f));
		
		f = new Circulo(999, 1000000, 1, "negro", 100);
		assertTrue(dibujo.comprobarTamaño(f));
	}

}
