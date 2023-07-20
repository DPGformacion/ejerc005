package es.cic;

import java.util.List;

public interface Dibujo {

	public String crear(List<Figura> listado, Figura figura);
	
	public boolean eliminar(List<Figura> listado, Figura figura);
	
	public List<Figura> mover(List<Figura> listado, Figura figura, int newX, int newY);
	
	public List<Figura> transformar(List<Figura> listado, Figura figura, Integer newSize, Integer newX, Integer newY);
	
	public boolean comprobarTamaño(Figura figura);
}
