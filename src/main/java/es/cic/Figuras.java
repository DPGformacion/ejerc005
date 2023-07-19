package es.cic;

public class Figuras {

	public int centro;
	public int xcord;
	public int ycord;
	public String color;
	
	public Figuras(int centro, int xcord, int ycord, String color) {
		super();
		this.centro = centro;
		this.xcord = xcord;
		this.ycord = ycord;
		this.color = color;
	}

	public int getPoint() {
		return centro;
	}

	public void setPoint(int centro) {
		this.centro = centro;
	}

	public int getXcord() {
		return xcord;
	}

	public void setXcord(int xcord) {
		this.xcord = xcord;
	}

	public int getYcord() {
		return ycord;
	}

	public void setYcord(int ycord) {
		this.ycord = ycord;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
