package es.cic;

import java.util.ArrayList;
import java.util.List;

public class DibujoImpl implements Dibujo {
	
	List<Figura> listado = new ArrayList<Figura>();
	
	@Override
	public String crearFigura(List<Figura> listado, Figura figura) {
	
		String creacion = "";
		listado.add(figura);
		
		//Aqui se crearia la figura en la interfaz, sustituyendo a creacion que solo sirve para testing
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
	public boolean eliminarFigura(List<Figura> listado, Figura figura) {
		
		boolean eliminado = listado.remove(figura);
		return eliminado;
	}

	@Override
	public List<Figura> moverFigura(List<Figura> listado, Figura figura, int newX, int newY) {
		
		listado.remove(figura);
		
		if (figura instanceof Linea) {
			((Linea) figura).setXpunto(newX);
			((Linea) figura).setYpunto(newY);

		} else {
			figura.setXcord(newX);
			figura.setYcord(newY);
		}
		
		listado.add(figura);
		return listado;

	}

	@Override
	public void transformarFigura(List<Figura> listado, Figura figura) {
		// TODO Auto-generated method stub

	}

	@Override
	public void comprobarTamaño(List<Figura> listado, Figura figura) {
		// TODO Auto-generated method stub

	}

}
