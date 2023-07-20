package es.cic;

import java.util.List;

public interface Dibujo {

	public String crearFigura(List<Figura> listado, Figura figura);
	
	public boolean eliminarFigura(List<Figura> listado, Figura figura);
	
	public List<Figura> moverFigura(List<Figura> listado, Figura figura, int newX, int newY);
	
	public List<Figura> transformarFigura(List<Figura> listado, Figura figura, Integer newSize, Integer newX, Integer newY);
	
	public boolean comprobarTamaño(Figura figura);
}
