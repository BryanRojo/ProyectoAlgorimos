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
	//private Vertex vertex;
	private ArrayList<Vertex> vertex;
	private ArrayList<Arista> arista;
	private int vertexLen, cont, ca;
	private String []value;
	private Graphics gg;
	private int x =0;
	private int y =0;
	private int x2 = 0;
	private int y2 =0;
	
	
	public PanelAdministrator(int vertexLength, String []values) {
		
		this.addMouseListener(this);
		this.setSize(750,480);
		this.vertex = new ArrayList<>();
		this.arista = new ArrayList<>();
		this.vertexLen = vertexLength;
		this.value = values;

	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/Map.png"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);

        gg = g;
        draw();

	}
	
	public void createVertex(int x, int y) {
		String places = "";
		for( int i = this.cont; i<this.vertexLen;i++) {
			places = this.value[i];
			System.out.println("g"+ value[i]+ this.vertexLen);
			this.cont +=1;
			break;
		}
		
		vertex.add(new Vertex(x, y, places));
	}
	
	public void createArista(int x, int y, int x2, int y2) {
		arista.add(new Arista(x, y, x2,y2));
	}
	
	public void draw() {
		for(int i =0; i<this.vertex.size(); i++) {
			this.vertex.get(i).drawVertex(gg);
		}
		
		for(int i =0; i<this.arista.size(); i++) {
			this.arista.get(i).drawVertex(gg);
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
	
		if(this.cont<this.vertexLen) {
		createVertex(e.getX(), e.getY());	
		System.out.println("g"+this.cont);
		}else {
			System.out.println("Haga click");
			if(ca == 0) {
				this.x = e.getX();
				this.y = e.getY();
			this.ca =1;
			System.out.println("2xy"+x+y);

			System.out.println("Otra vez");
			}else {	
				this.x2 = e.getX();
				this.y2 = e.getY();
				System.out.println("2xy"+x2+y2);
				createArista(x2,y2,x,y);
				this.ca = 0;
			}	
		}
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
