package es.cic;

public class Linea extends Figura {

	private int xpunto;
	private int ypunto;

	public Linea(int id, int xcord, int ycord, String color, int punto, int xpunto, int ypunto) {
		super(id, xcord, ycord, color);
		this.xpunto = xpunto;
		this.ypunto = ypunto;
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

}
