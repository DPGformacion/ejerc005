package es.cic;

public class Circulo extends Figuras{

	public int radio;

	public Circulo(int centro, int xcord, int ycord, String color, int radio) {
		super(centro, xcord, ycord, color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	
}
