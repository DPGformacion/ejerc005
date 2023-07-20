package es.cic;

public class Circulo extends Figura{

	public int radio;

	public Circulo(int id, int xcord, int ycord, String color, int radio) {
		super(id, xcord, ycord, color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	
}
