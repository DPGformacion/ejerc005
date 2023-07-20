package es.cic;

import java.util.ArrayList;
import java.util.List;

public class DibujoImpl implements Dibujo {

	List<Figura> listado = new ArrayList<Figura>();

	@Override
	public String crear(List<Figura> listado, Figura figura) {

		String creacion = "";
		listado.add(figura);

		// Aqui se crearia la figura en la interfaz, sustituyendo a creacion que solo
		// sirve para testing
		if (figura instanceof Circulo) {
			creacion = "circulo";

		} else if (figura instanceof Cuadrado) {
			creacion = "cuadrado";

		} else if (figura instanceof Linea) {
			creacion = "linea";

		} else {
			creacion = "punto";
		}

		return creacion;
	}

	@Override
	public boolean eliminar(List<Figura> listado, Figura figura) {

		boolean eliminado = listado.remove(figura);
		return eliminado;
	}

	@Override
	public List<Figura> mover(List<Figura> listado, Figura figura, int newX, int newY) {

		listado.remove(figura);

		if (figura instanceof Linea) {
			figura.setXcord(newX);
			figura.setYcord(newY);
			((Linea) figura).setXpunto( ((Linea) figura).getXpunto() + newX);
			((Linea) figura).setYpunto( ((Linea) figura).getYpunto() + newY);

		} else {
			figura.setXcord(newX);
			figura.setYcord(newY);
		}

		listado.add(figura);
		return listado;

	}

	@Override
	public List<Figura> transformar(List<Figura> listado, Figura figura, Integer newSize, Integer newX, Integer newY) {

		listado.remove(figura);
		
		if (figura instanceof Circulo) {
			((Circulo) figura).setRadio(newSize);

		} else if (figura instanceof Cuadrado) {
			((Cuadrado) figura).setLado(newSize);

		} else if (figura instanceof Linea) {
			figura.setXcord(newX);
			figura.setYcord(newY);
		}
		
		listado.add(figura);
		return listado;
	}

	@Override
	public boolean comprobarTamaño(Figura figura){
		
		Lienzo l = new Lienzo();
		if (figura.getXcord() > l.getX() || figura.getYcord() > l.getY()) {
			return false;
		}
		
		return true;
	}

}
