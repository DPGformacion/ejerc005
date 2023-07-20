package es.cic;

import java.util.List;

public interface Dibujo {

	public String crearFigura(List<Figura> listado, Figura figura);
	
	public boolean eliminarFigura(List<Figura> listado, Figura figura);
	
	public List<Figura> moverFigura(List<Figura> listado, Figura figura, int newX, int newY);
	
	public void transformarFigura(List<Figura> listado, Figura figura);
	
	public void comprobarTamaño(List<Figura> listado, Figura figura);
}
