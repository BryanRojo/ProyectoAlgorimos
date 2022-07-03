package Domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Vertex {
	
	private int x;
	private int y;
	private String place;
	private BufferedImage image;
	
	public Vertex(int x, int y, String place) {
		super();
		this.x = x;
		this.y = y;
		this.place = place;
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	public void drawVertex(Graphics g){
		 
		 try {
				this.image=ImageIO.read(getClass().getResourceAsStream("/Images/pp.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		 g.drawOval(x, y, 15, 15);
		 g.setColor(Color.white);
		// g.drawImage(this.image, (int)this.x, (int)this.y,40,40, null);
		 g.drawString(""+this.place, 5, 15);
	 }
	
}
