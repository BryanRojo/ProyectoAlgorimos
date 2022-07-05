package Domain;

import java.awt.Color;
import java.awt.Graphics;

public class Arista {

	private int x;
	private int y;
	private int x2;
	private int y2;
	private String weight;
	
	public Arista(int x, int y, int x2, int y2, String weight) {
		super();
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
		this.weight = weight;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void drawVertex(Graphics g){
		 g.setColor(Color.white);
		 g.drawLine(x, y, x2, y2);
		 g.drawString(this.weight, x, y);
		
	 }
	
}
