package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame{
	
	private JLabel lUserName, lName, lStars, lPaymentMethod, lEmail, lCelephoneNumber, lTrips, lStart, lDestiny;
	private JComboBox tStart, tDestiny;
	private JButton bAdmin, bTerms, bStart, bBack;
	
	private PanelPrincipal panel = new PanelPrincipal();
	
	private Font font3 = new Font("Calibri", Font.ITALIC, 28);
	private Font font2 = new Font("Cambria", Font.PLAIN, 16);
	private Font font = new Font("Calibri", Font.ITALIC, 16);
	
	public Principal() {
		
		panel.add(getLUserName());
		panel.add(getLName());
		panel.add(getLStars());
		panel.add(getLPaymentMethod());
		panel.add(getLEmail());
		panel.add(getLCelephoneNumber());
		panel.add(getLTrips());
		panel.add(getLStart());
		panel.add(getLDestiny());
		
		panel.add(getTStart());
		panel.add(getTDestiny());
		
		panel.add(getBAdmin());
		panel.add(getBTerms());
		panel.add(getBStart());
		panel.add(getBBack());
		
		panel.setLayout(new BorderLayout(0,0));
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setTitle("Principal");
		setContentPane(panel);
		setBounds(100,100,800,500);
		//setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	
	}
	
	public JLabel getLUserName() {
		if(lUserName == null) {
			lUserName = new JLabel();
			lUserName.setBounds(100,80,120,20);
			lUserName.setForeground(Color.black);
			lUserName.setFont(font);
		}
		return lUserName;
	}
	
	public JLabel getLName() {
		if(lName == null) {
			lName = new JLabel();
			lName.setBounds(15,120,300,20);
			lName.setForeground(Color.black);
			lName.setFont(font);
		}
		return lName;
	}
	
	public JLabel getLStars() {
		if(lStars == null) {
			lStars = new JLabel();
			lStars.setBounds(15,160,80,20);
			lStars.setForeground(Color.black);
			lStars.setFont(font);
		}
		return lStars;
	}
	public JLabel getLPaymentMethod() {
		if(lPaymentMethod == null) {
			lPaymentMethod = new JLabel();
			lPaymentMethod.setBounds(15,200,280,20);
			lPaymentMethod.setForeground(Color.black);
			lPaymentMethod.setFont(font);
		}
		return lPaymentMethod;
	}
	public JLabel getLEmail() {
		if(lEmail == null) {
			lEmail = new JLabel();
			lEmail.setBounds(15,240,295,20);
			lEmail.setForeground(Color.black);
			lEmail.setFont(font);
		}
		return lEmail;
	}
	public JLabel getLCelephoneNumber() {
		if(lCelephoneNumber == null) {
			lCelephoneNumber = new JLabel();
			lCelephoneNumber.setBounds(15,280,280,20);
			lCelephoneNumber.setForeground(Color.black);
			lCelephoneNumber.setFont(font);
		}
		return lCelephoneNumber;
	}
	
	public JLabel getLTrips() {
		if(lTrips == null) {
			lTrips = new JLabel();
			lTrips.setBounds(15,320,80,20);
			lTrips.setForeground(Color.black);
			lTrips.setFont(font);
		}
		return lTrips;
	}
	
	public JLabel getLStart() {
		if(lStart == null) {
			lStart = new JLabel();
			lStart.setBounds(475,220,250,35);
			lStart.setForeground(Color.white);
			lStart.setText("Starting point");
			lStart.setFont(font3);
		}
		return lStart;
	}
	
	public JLabel getLDestiny() {
		if(lDestiny == null) {
			lDestiny = new JLabel();
			lDestiny.setBounds(475,300,250,35);
			lDestiny.setForeground(Color.white);
			lDestiny.setText("Arrival point");
			lDestiny.setFont(font3);
		}
		return lDestiny;
	}
	
	public JComboBox getTStart() {
		if(tStart == null) {
			tStart = new JComboBox();
			tStart.setBounds(475,250,150,30);
			tStart.setForeground(Color.black);
			tStart.setFont(font);
		}
		return tStart;
	}
	
	public JComboBox getTDestiny() {
		if(tDestiny == null) {
			tDestiny = new JComboBox();
			tDestiny.setBounds(475,330,150,30);
			tDestiny.setForeground(Color.black);
			tDestiny.setFont(font);
		}
		return tDestiny;
	}
	
	public JButton getBAdmin() {
		if(bAdmin == null) {
			bAdmin = new JButton();
			bAdmin.setForeground(Color.white);
			bAdmin.setBackground(Color.black);
			bAdmin.setText("Switch to managed mode");
			bAdmin.setBounds(30,390,230,30);
			bAdmin.setBorder(null);
			bAdmin.setFont(font);
		}
		return bAdmin;
	}
	public JButton getBTerms() {
		if(bTerms == null) {
			bTerms = new JButton();
			bTerms.setForeground(Color.black);
			bTerms.setBackground(Color.white);
			bTerms.setText("Terms and conditions");
			bTerms.setBounds(30,435,220,20);
			bTerms.setBorder(null);
			bTerms.setFont(font2);
		}
		return bTerms;
	}
	
	public JButton getBStart() {
		if(bStart == null) {
			bStart = new JButton();
			bStart.setForeground(Color.black);
			bStart.setBackground(Color.white);
			bStart.setText("Start trip");
			bStart.setBounds(440,400,220,40);
			bStart.setBorder(null);
			bStart.setFont(font2);
		}
		return bStart;
	}
	
	public JButton getBBack() {
		if(bBack == null) {
			bBack = new JButton();
			bBack.setForeground(Color.black);
			bBack.setBackground(Color.white);
			bBack.setText("Go back");
			bBack.setBounds(695,0,89,30);
			bBack.setFont(font2);
		}
		return bBack;
	}
	
}