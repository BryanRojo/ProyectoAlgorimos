package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Domain.Arista;
import Domain.Vertex;


public class PanelAdministrator extends JPanel implements MouseListener, Runnable{
	
	private Thread thread;
	private int FPS=60;
	private long time=1000/FPS;
	private long espera;
	private Vertex vertex;
	private ArrayList<Arista> arista;
	private int vertexLen;
	
	public PanelAdministrator(int vertexLength) {
		
		this.addMouseListener(this);
		this.setSize(750,480);
		this.vertex = new Vertex();
		this.arista = new ArrayList<>();
		this.vertexLen = vertexLength;

	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/Map.png"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);
        this.vertex.drawVertex(g);
	}
	
	/*private void c(Graphics g) {
		for (int i = 0 ; i <this.vertexLen; i++) {
			this.vertex.get(i).drawVertex(g);
		}
	}*/
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
	@Override
	public void run() {
		long start;
		long elapse;
		//System.out.println(System.nanoTime());
		while(true) {
			start=System.nanoTime();
			//operaciones
			repaint();
			elapse=System.nanoTime()-start;
			this.espera=this.time-elapse/1000000; 
			if(this.espera<0) this.espera=5;
			try {
				Thread.sleep(this.espera); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
	}
	
	public void addNotify() {
		super.addNotify();
		if(this.thread==null) {
			this.thread=new Thread(this);
			this.thread.start();
		}
	} 
	
}
