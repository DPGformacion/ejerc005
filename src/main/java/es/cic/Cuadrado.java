package es.cic;

public class Cuadrado extends Figuras {

	public int lado;
	public int angulo;

	public Cuadrado(int centro, int xcord, int ycord, String color, int lado, int angulo) {
		super(centro, xcord, ycord, color);
		this.lado = lado;
		this.angulo = angulo;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getAngulo() {
		return angulo;
	}

	public void setAngulo(int angulo) {
		this.angulo = angulo;
	}
	
}
