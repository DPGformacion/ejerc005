package es.cic;

public class Linea extends Figuras {

	public int punto;
	public int xpunto;
	public int ypunto;
	public int angulo;

	public Linea(int centro, int xcord, int ycord, String color, int punto, int xpunto, int ypunto, int angulo) {
		super(centro, xcord, ycord, color);
		this.punto = punto;
		this.xpunto = xpunto;
		this.ypunto = ypunto;
		this.angulo = angulo;
	}

	public int getPunto() {
		return punto;
	}

	public void setPunto(int punto) {
		this.punto = punto;
	}

	public int getXpunto() {
		return xpunto;
	}

	public void setXpunto(int xpunto) {
		this.xpunto = xpunto;
	}

	public int getYpunto() {
		return ypunto;
	}

	public void setYpunto(int ypunto) {
		this.ypunto = ypunto;
	}

	public int getAngulo() {
		return angulo;
	}

	public void setAngulo(int angulo) {
		this.angulo = angulo;
	}

}
