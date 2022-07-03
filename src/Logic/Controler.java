package Logic;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Domain.Arista;
import Domain.CarImage;
import Domain.User;
import Domain.Vertex;
import GUI.Administrator;
import GUI.Car;
import GUI.Map;
import GUI.NewUser;
import GUI.Principal;
import GUI.Start;
import Graphs.GrafoException;
import Graphs.GrafoListaAdyacencia;

public class Controler implements ActionListener, KeyListener, MouseListener{

	private Start start;
	private NewUser newUser;
	private Principal principal;
	private Files file;
	private CarType type;
	private Car car;
	private CarImage image;
	private Administrator admin;
	private ArrayList<Vertex> vertex;
	private ArrayList<Arista> arista;
	
	private int vertexLength, cont;
	private String password = "";
	private String name = "";
	private boolean condition = false, condition2 = false;
	private String []data, values;
	
	private GrafoListaAdyacencia graph;
	
	private Map map ;
	
	private ImageIcon carX = new ImageIcon("/Images/CarX.png");

	public Controler() {
		this.start = new Start();
		this.newUser = new NewUser();
		this.principal = new Principal();
		this.file = new Files();
		this.type = new CarType();
		this.car = new Car();
		this.admin = new Administrator();
		
		this.data = new String[5];
		
		this.vertex = new ArrayList<>();
		this.arista = new ArrayList<>();
		
		this.map = new Map();
		init();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {}
	
	private void verifyNewUser() {
		if(newUser.getTPassword().getText().equals(newUser.getTConfirmPassword().getText())) {
			this.password = newUser.getTPassword().getText();
			if(this.password.length() >= 8) {
				this.condition = true;
			}else {
				JOptionPane.showMessageDialog(null, "Passwords contain less than 8 characters.", "Warning", JOptionPane.WARNING_MESSAGE);	
			}
		}else {
			JOptionPane.showMessageDialog(null, "Passwords do not match, try again.", "Warning", JOptionPane.WARNING_MESSAGE);	
			}
		if(newUser.getTUserName().getText().equals("") || newUser.getTName().getText().equals("")||newUser.getTPaymentMethod().getText().equals("")||newUser.getTEmail().getText().equals("")||newUser.getTAdress().getText().equals("") || this.password.equals("") || newUser.getTPhoneNumber().getText().equals("")) {
			JOptionPane.showMessageDialog(null, "One or more fields are empty, try again.", "Warning", JOptionPane.WARNING_MESSAGE);	
		}else {
			this.condition2 = true;
		}
	}
	
	private void saveUser() {
		if(this.condition== true && condition2 == true) {
		User user = new User(newUser.getTUserName().getText(), newUser.getTName().getText(),newUser.getTPaymentMethod().getText(), newUser.getTEmail().getText(), newUser.getTAdress().getText(), this.password, newUser.getTPhoneNumber().getText());
		this.name = user.getUserName();
		file.addUser(user);
		file.saveNamePassword(this.name, this.password);
		JOptionPane.showMessageDialog(null, "Saved successfully.\nYour user is: "+ user.getUserName()+"\nYour password is: "+user.getPassword());	
		}
	}
	
	private void verifyUser() {
		if(start.getTUsername().getText().equals(null)&& start.getTPassword().getText().equals(null)){
			JOptionPane.showMessageDialog(null, "User or password are empty, try again.", "Warning", JOptionPane.WARNING_MESSAGE);	
		}else {
			boolean condition3 = false;
			condition3 = file.verifyUser(start.getTUsername().getText(), start.getTPassword().getText());
			if(condition3 == true) {
				JOptionPane.showMessageDialog(null, "Successful start.", "Information", JOptionPane.INFORMATION_MESSAGE);	
				start.setVisible(false);
				principal.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, "User or passwrod is wrong, try again.", "Warning", JOptionPane.WARNING_MESSAGE);	
			}
		}
	}
	
	private void extractData() {
		file.returnData(this.data, start.getTUsername().getText());
		principal.getLUserName().setText("User: "+this.data[0]);
		principal.getLName().setText("Name: "+this.data[1]);
		principal.getLPaymentMethod().setText("Payment method: "+this.data[2]);
		principal.getLEmail().setText("Email: "+this.data[3]);
		principal.getLCelephoneNumber().setText("Celephone number: "+this.data[4]);
		principal.getLStars().setText("Stars: ");
		principal.getLTrips().setText("Trips: ");
	}
	
	private void createGraph() {
		graph = new GrafoListaAdyacencia(Integer.parseInt(admin.getTNumberPlaces().getText()));
	}
	
	private void addVertex(String nodes) throws GrafoException{
		String[] vertices = nodes.split(",");
		for (int i = 0; i < vertices.length; i++) {
			graph.addVertex(vertices[i]);
		}
		this.vertexLength = vertices.length;
	}
	
	private void addArista(String lugar, String destino, int peso) throws GrafoException {
		graph.addEdgeWeight(lugar, destino, peso);
		System.out.println(graph.existEdge(lugar, destino));
	}
	
	private void addNode() {
		try {
			addVertex(admin.getAPlaces().getText());
			this.values=admin.getAPlaces().getText().split(",");
			addArista(this.values);
			//admin.dispose();
		} catch (GrafoException e1) {
			
			e1.printStackTrace();
		}
	
	}
	
	private void addArista( String[]values) {//Panel modificador de aristas
		//try {
			//addArista((String)a.lugar().getSelectedItem(), (String)a.destino().getSelectedItem(), Integer.parseInt(a.getDistancia().getText()));
			//JOptionPane.showMessageDialog(null, "Se añadio la arista de: "+(String)a.lugar().getSelectedItem()+" a "+(String)a.destino().getSelectedItem()+" con "+a.getDistancia().getText()+" Km.");
			//a.getDistancia().setText("");
		//} catch (NumberFormatException | GrafoException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		//}
	}
	
	public void createVertex(int x, int y) {
		String places = "";
		for( int i = this.cont; i<this.vertexLength;i++) {
			places = this.values[i];
			this.cont +=1;
			break;
		}
		
		this.vertex.add(new Vertex(x, y, places));
	}
	
	public void draw(Graphics g) {
		for( int i = 0; i< this.vertexLength;i++ ) {
			this.vertex.get(i).drawVertex(g);
		}
	}
	
	private void goBack() {
		newUser.setVisible(false);
		principal.setVisible(false);
		start.setVisible(true);
	}

	private void visible() {
		newUser.setVisible(true);
		start.setVisible(false);
	}
	
	private void visible2() {
		if(this.condition == true && this.condition2 == true) {
			newUser.setVisible(false);
			start.setVisible(true);
			newUser.getTUserName().setText(null);
			newUser.getTName().setText(null); 
			newUser.getTAdress().setText(null);
			newUser.getTPassword().setText(null);
			newUser.getTConfirmPassword().setText(null);
			newUser.getTPhoneNumber().setText(null);
		}
	}
	
	private void visible3() {
		car.setVisible(true);
		principal.setVisible(false);
	}
	
	private void visible4() {
		principal.setVisible(true);
		car.setVisible(false);
	}
	
	private void visible5() {
		admin.getScrollPane().setVisible(true);
		admin.getLInstruction2().setVisible(true);
		admin.getBSave2().setVisible(true);
		admin.getBReturn().setVisible(true);
		
		admin.getLInstruction().setVisible(false);
		admin.getBSave().setVisible(false);
		admin.getTNumberPlaces().setVisible(false);
	}
	
	private void visible6() {
		admin.getScrollPane().setVisible(false);
		admin.getLInstruction2().setVisible(false);
		admin.getBSave2().setVisible(false);
		admin.getBReturn().setVisible(false);
		
		admin.getLInstruction().setVisible(true);
		admin.getBSave().setVisible(true);
		admin.getTNumberPlaces().setVisible(true);
	}
	
	private void visible7() {
		principal.setVisible(true);
		admin.setVisible(false);
	}
	
	private void visible8() {
		admin.setVisible(true);
		principal.setVisible(false);
	}
	
	private void visible9() {
		map.setVisible(true);
	}
	
	private void termsAndConditions() {
		JOptionPane.showMessageDialog(null,"Application created in java language for academic purposes only, UCR 2022, business informatics.", "Information", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void init() {
		start.getBNewUser().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible();
			}
		});
		
		newUser.getBVerify().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verifyNewUser();
				saveUser();
				visible2();
			}
		});
		
		newUser.getBBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				goBack();
			}
		});
		
		start.getBEnter().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verifyUser();
				extractData();
			}
		});
		
		principal.getBAdmin().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible8();
			}
		});
		
		principal.getBTerms().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				termsAndConditions();
			}
		});
		
		principal.getBStart().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible3();
			}
		});
		
		principal.getBBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				goBack();
			}
		});
		
		admin.getBSave().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createGraph();
				//admin.dispose();
				visible5();
			}
		});
		
		admin.getBReturn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible6();
			}
		});
		
		admin.getBBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible7();
			}
		});
		
		admin.getBSave2().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNode();
				visible9();
			}
		});
		
		
		car.getBChoose().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible4();
			}
		});
		
		car.getBChoose().addKeyListener(new KeyListener() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP)
					car.getLTest().setText(type.next());
				if(e.getKeyCode() == KeyEvent.VK_DOWN)
					car.getLTest().setText(type.before());
				
					car.getLTest().setText(type.print());
					if(car.getLTest().getText().equals("Car X")) {
						car.getLTest().setIcon(carX);
						car.getLTest().setIconTextGap(1);
						car.getLTest().setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
						car.getLTest().setVerticalAlignment(javax.swing.SwingConstants.CENTER);
						car.getLTest().setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
						car.getLTest().setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
						
					}
			}
			
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
		});
		
		car.getBBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible4();
			}
		});
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		createVertex(e.getX(), e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
