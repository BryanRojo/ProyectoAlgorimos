package Logic;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Domain.Arista;
import Domain.CarImage;
import Domain.User;
import Domain.Vertex;
import GUI.Administrator;
import GUI.Car;
import GUI.Drivers;
import GUI.Map;
import GUI.NewUser;
import GUI.PanelAdministrator;
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
	//private CarImage image;
	private Administrator admin;
	private Drivers drivers;
	private ArrayList<Vertex> vertex;
	private ArrayList<Arista> arista;
	
	public int vertexLength, cont, cont2;
	private String password = "", name = "", aristass;
	private boolean condition = false, condition2 = false;
	private String []data, values, aristas;
	
	private GrafoListaAdyacencia graph;
	
	private Map map ;

	public Controler() {
		this.start = new Start();
		this.newUser = new NewUser();
		this.principal = new Principal();
		this.file = new Files();
		this.type = new CarType();
		this.car = new Car();
		this.admin = new Administrator();
		this.drivers=new Drivers();
	
		this.data = new String[5];
		
		this.vertex = new ArrayList<>();
		this.arista = new ArrayList<>();
		init();
		init2();
		init3();
		
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
	
	public void fillData() {
		this.drivers.getIName().setText("Marvin");
		this.drivers.getIBrand().setText("Toyota");
		this.drivers.getIQualification().setText("4,0");
		this.drivers.getIPayment().setText("Efectivo");
		this.drivers.getIName2().setText("Maria");
		this.drivers.getIBrand2().setText("Nissan");
		this.drivers.getIQualification2().setText("4,5");
		this.drivers.getIPayment2().setText("Tarjeta");
		this.drivers.getIName3().setText("Rodrigo");
		this.drivers.getIBrand3().setText("BMW");
		this.drivers.getIQualification3().setText("4,9");
		this.drivers.getIPayment3().setText("Efectivo");
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
	
	private void fillComboBox() {
		String line="";
		line=this.admin.getAPlaces().getText();
		String split[]=line.split(",");
		for(int i =0; i<split.length; i++) {
			if(split[i] != null) {
				principal.getTStart().addItem(split[i]);
				principal.getTDestiny().addItem(split[i]);
				admin.getCPlace().addItem(split[i]);
				admin.getCDestiny().addItem(split[i]);
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
			//addArista(this.values);
		} catch (GrafoException e1) {
			
			e1.printStackTrace();
		}
	
	}
	
	private void addNode2() {
		addArista(this.values);
	}
	
	private void addArista( String[]values) {//Panel modificador de aristas
		
			try {
				addArista((String)admin.Place().getSelectedItem(), (String)admin.destiny().getSelectedItem(), Integer.parseInt(admin.getTDistance().getText()));
				this.aristass+= Integer.parseInt(admin.getTDistance().getText())+ ",";
				
				this.aristas = this.aristass.split(",");
				JOptionPane.showMessageDialog(null, "Path was added: "+((String)admin.Place().getSelectedItem()+ (String)admin.destiny().getSelectedItem()+ Integer.parseInt(admin.getTDistance().getText())+" whit"+admin.getTDistance().getText()+" Km."));
				admin.getTDistance().setText("");
				
			} catch (NumberFormatException | GrafoException e1) {
				e1.printStackTrace();
		}
	}
	
	public void draw(Graphics g) {
		for( int i = 0; i< this.vertexLength;i++ ) {
			this.vertex.get(i).drawVertex(g);
		}
	}
	
	private void JMessage() {
		JOptionPane.showMessageDialog(null,"User: "+this.name+ "\nUber selected: " + "\nChofer selected: "+ "Marvin\n Car: Toyota, \nStarts: 4.0, \nPayment method: efectivo");
	}
	
	private void JMessage2() {
		JOptionPane.showMessageDialog(null,"User: "+this.name+ "\nUber selected: " + "\nChofer selected: "+ "Mar�a\n Car: Nissan, \nStarts: 4.5, \nPayment method: tarjeta");
	}
	
	private void JMessage3() {
		JOptionPane.showMessageDialog(null,"User: "+this.name+ "\nUber selected: " + "\nChofer selected: "+ "Rodrigo\n Car: BMW, \nStarts: 4.9, \nPayment method: efectivo");
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
		drivers.setVisible(true);
		car.setVisible(false);
	}
	
	private void visible04() {
		principal.setVisible(true);
		car.setVisible(false);
	
	}
	
	private void visible5() {
		admin.getBLogin().setVisible(false);
		admin.getCPlace().setVisible(false);
		admin.getCDestiny().setVisible(false);
		admin.getTDistance().setVisible(false);
		
		admin.getLFrom().setVisible(false);
		admin.getLTo().setVisible(false);
		admin.getLDistance().setVisible(false);
		admin.getLInstruction3().setVisible(false);
		admin.getBGoBack().setVisible(false);
		admin.getBNext().setVisible(false);
		
		admin.getScrollPane().setVisible(true);
		admin.getLInstruction2().setVisible(true);
		admin.getBSave2().setVisible(true);
		admin.getBReturn().setVisible(true);
		
		admin.getLInstruction().setVisible(false);
		admin.getBSave().setVisible(false);
		admin.getTNumberPlaces().setVisible(false);
	}
	
	private void visible6() {
		admin.getBLogin().setVisible(false);
		admin.getCPlace().setVisible(false);
		admin.getCDestiny().setVisible(false);
		admin.getTDistance().setVisible(false);
		
		admin.getLFrom().setVisible(false);
		admin.getLTo().setVisible(false);
		admin.getLDistance().setVisible(false);
		admin.getLInstruction3().setVisible(false);
		admin.getBGoBack().setVisible(false);
		admin.getBNext().setVisible(false);
		
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
	//	road.setVisible(false);
	}
	
	private void visible8() {
		admin.setVisible(true);
		principal.setVisible(false);
		//road.setVisible(false);
	}
	
	
	private void visible10(){
		map.setVisible(false);
	}
	
	private void visible11() {
		admin.setVisible(false);
		
	}
	
	private void visible12() {
		principal.setVisible(true);
		drivers.setVisible(false);
	}
	
	private void visible13() {
		drivers.setVisible(false);
		car.setVisible(true);
	}
	
	private void visible14() {
		
		admin.getScrollPane().setVisible(false);
		admin.getLInstruction2().setVisible(false);
		admin.getBSave2().setVisible(false);
		admin.getBReturn().setVisible(false);
		
		admin.getLInstruction().setVisible(false);
		admin.getBSave().setVisible(false);
		admin.getTNumberPlaces().setVisible(false);
		
		admin.getBLogin().setVisible(true);
		admin.getCPlace().setVisible(true);
		admin.getCDestiny().setVisible(true);
		admin.getTDistance().setVisible(true);
		
		admin.getLFrom().setVisible(true);
		admin.getLTo().setVisible(true);
		admin.getLDistance().setVisible(true);
		admin.getLInstruction3().setVisible(true);
		admin.getBGoBack().setVisible(true);
		admin.getBNext().setVisible(true);
		
	}
	
	
	private void visible15() {
		admin.setVisible(true);
		map = new Map(this.vertexLength, this.values, this.aristas);
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
		car.getBChoose().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible4();
				fillData();
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
			}
			
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
		});
		
		car.getBBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible04();
			}
		});
		
		
		drivers.getbChooseDriver1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JMessage();
			}
		});
		
		drivers.getbChooseDriver2().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JMessage2();
			}
		});
		
		drivers.getbChooseDriver3().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JMessage3();
			}
		});
		
		drivers.getbBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible12();
			}
		});
		
		drivers.getBReturn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible5();
			}
		});
		
	}
	
	private void init2() {

		admin.getBSave().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createGraph();
				visible5();
			}
		});
		
		admin.getBReturn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible8();
				visible5();
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
				visible14();
				//visible9();
				fillComboBox();
			}
		});
		
		admin.getBGoBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 	{			
				visible5();
			}
		});
		
		admin.getBLogin().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNode2();
			}
				
		});
		
		admin.getBNext().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible15();
			}
		});
	}
	private void init3() {

		map.getBBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible10();
				visible5();
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
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
