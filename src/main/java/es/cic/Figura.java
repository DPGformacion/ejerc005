package es.cic;

public class Figura {

	public int id;
	public int xcord;
	public int ycord;
	public String color;
	
	public Figura(int id, int xcord, int ycord, String color) {
		super();
		this.id = id;
		this.xcord = xcord;
		this.ycord = ycord;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
