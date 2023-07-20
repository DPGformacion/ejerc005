package es.cic;

public class Cuadrado extends Figura {

	private int lado;
	private int angulo;

	public Cuadrado(int id, int xcord, int ycord, String color, int lado) {
		super(id, xcord, ycord, color);
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
}
