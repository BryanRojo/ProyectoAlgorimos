package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class NewUser extends JFrame {

	private JLabel  lNewEntry, lUserName, lName, lPaymentMethod, lEmail, lPhoneNumber, lAdress, lPassword, lConfirmPassword;
	private JTextField tUserName, tName,tPaymentMethod, tEmail, tPhoneNumber, tAdress, tPassword, tConfirmPassword;
	private JButton bVerify, bBack;
	
	private Font font = new Font("Times New Roman", Font.PLAIN, 22);
	private Font font3 = new Font("Calibri", Font.ITALIC, 16);
	
	private PanelNewUser panel = new PanelNewUser();
	
	public NewUser() {
		
		panel.add(getLNewEntry());
		panel.add(getLUserName());
		panel.add(getLName());
		panel.add(getLPaymentMethod());
		panel.add(getLEmail());
		panel.add(getLAdress());
		panel.add(getLPhoneNumber());
		panel.add(getLPassword());
		panel.add(getLConfirmPassword());
		
		panel.add(getTUserName());
		panel.add(getTName());
		panel.add(getTPaymentMethod());
		panel.add(getTEmail());
		panel.add(getTAdress());
		panel.add(getTPhoneNumber());
		panel.add(getTPassword());
		panel.add(getTConfirmPassword());
		
		panel.add(getBVerify());
		panel.add(getBBack());
		
		panel.setLayout(new BorderLayout(0,0));
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setTitle("New User");
		setContentPane(panel);
		setBounds(100,100,800,480);
		//setVisible(true);
		setResizable(false);
		getContentPane().setBackground(new Color(246,187,166));
		setLocationRelativeTo(null);
	}
	
	public JLabel getLNewEntry() {
		if(lNewEntry == null) {
			lNewEntry = new JLabel();
			lNewEntry.setForeground(Color.black);
			lNewEntry.setText("New Entry");
			lNewEntry.setBounds(65,5,200,80);
			lNewEntry.setFont(font);
		}
		return lNewEntry;
	}
	
	public JLabel getLUserName() {
		if(lUserName == null) {
			lUserName = new JLabel();
			lUserName.setForeground(Color.white);
			lUserName.setText("User name:");
			lUserName.setBounds(180,95,100,80);
			lUserName.setFont(font3);
		}
		return lUserName;
	}
	
	public JLabel getLName() {
		if(lName == null) {
			lName = new JLabel();
			lName.setForeground(Color.white);
			lName.setText("Name and last name:");
			lName.setBounds(180,155,180,80);
			lName.setFont(font3);
		}
		return lName;
	}
	
	public JLabel getLPaymentMethod() {
		if(lPaymentMethod == null) {
			lPaymentMethod = new JLabel();
			lPaymentMethod.setForeground(Color.white);
			lPaymentMethod.setText("Payment method:");
			lPaymentMethod.setBounds(450,95,150,80);
			lPaymentMethod.setFont(font3);
		}
		return lPaymentMethod;
	}
	
	public JLabel getLEmail() {
		if(lEmail == null) {
			lEmail = new JLabel();
			lEmail.setForeground(Color.white);
			lEmail.setText("Email:");
			lEmail.setBounds(450,155,100,80);
			lEmail.setFont(font3);
		}
		return lEmail;
	}
	
	public JLabel getLPhoneNumber() {
		if(lPhoneNumber == null) {
			lPhoneNumber = new JLabel();
			lPhoneNumber.setForeground(Color.white);
			lPhoneNumber.setText("Phone number:");
			lPhoneNumber.setBounds(180,215,100,80);
			lPhoneNumber.setFont(font3);
		}
		return lPhoneNumber;
	}
	
	public JLabel getLAdress() {
		if(lAdress == null) {
			lAdress = new JLabel();
			lAdress.setForeground(Color.white);
			lAdress.setText("Adress:");
			lAdress.setBounds(180,275,100,80);
			lAdress.setFont(font3);
		}
		return lAdress;
	}
	
	public JLabel getLPassword() {
		if(lPassword == null) {
			lPassword = new JLabel();
			lPassword.setForeground(Color.white);
			lPassword.setText("New password:");
			lPassword.setBounds(450,215,100,80);
			lPassword.setFont(font3);
		}
		return lPassword;
	}
	
	public JLabel getLConfirmPassword() {
		if(lConfirmPassword == null) {
			lConfirmPassword = new JLabel();
			lConfirmPassword.setForeground(Color.white);
			lConfirmPassword.setText("Confirm password:");
			lConfirmPassword.setBounds(450,275,120,80);
			lConfirmPassword.setFont(font3);
		}
		return lConfirmPassword;
	}
	
	public JTextField getTUserName() {
		if(tUserName == null) {
			tUserName = new JTextField();
			tUserName.setForeground(Color.black);
			tUserName.setBackground(Color.white);
			tUserName.setBounds(190,145,120,20);
			tUserName.setFont(font3);
		}
		return tUserName;
	}
	
	public JTextField getTName() {
		if(tName == null) {
			tName = new JTextField();
			tName.setForeground(Color.black);
			tName.setBackground(Color.white);
			tName.setBounds(190,205,120,20);
			tName.setFont(font3);
		}
		return tName;
	}
	
	public JTextField getTPaymentMethod() {
		if(tPaymentMethod == null) {
			tPaymentMethod = new JTextField();
			tPaymentMethod.setForeground(Color.black);
			tPaymentMethod.setBackground(Color.white);
			tPaymentMethod.setBounds(460,145,120,20);
			tPaymentMethod.setFont(font3);
		}
		return tPaymentMethod;
	}
	
	public JTextField getTEmail() {
		if(tEmail == null) {
			tEmail = new JTextField();
			tEmail.setForeground(Color.black);
			tEmail.setBackground(Color.white);
			tEmail.setBounds(460,205,120,20);
			tEmail.setFont(font3);
		}
		return tEmail;
	}
	
	public JTextField getTPhoneNumber() {
		if(tPhoneNumber == null) {
			tPhoneNumber = new JTextField();
			tPhoneNumber.setForeground(Color.black);
			tPhoneNumber.setBackground(Color.white);
			tPhoneNumber.setBounds(190,265,120,20);
			tPhoneNumber.setFont(font3);
			}
		return tPhoneNumber;
	}
	
	public JTextField getTAdress() {
		if(tAdress == null) {
			tAdress = new JTextField();
			tAdress.setForeground(Color.black);
			tAdress.setBackground(Color.white);
			tAdress.setBounds(190,325,120,20);
			tAdress.setFont(font3);
		}
		return tAdress;
	}
	
	public JTextField getTPassword() {
		if(tPassword == null) {
			tPassword = new JTextField();
			tPassword.setForeground(Color.black);
			tPassword.setBackground(Color.white);
			tPassword.setBounds(460,265,120,20);
			tPassword.setFont(font3);
		}
		return tPassword;
	}
	public JTextField getTConfirmPassword() {
		if(tConfirmPassword == null) {
			tConfirmPassword = new JTextField();
			tConfirmPassword.setForeground(Color.black);
			tConfirmPassword.setBackground(Color.white);
			tConfirmPassword.setBounds(460,325,120,20);
			tConfirmPassword.setFont(font3);
		}
		return tConfirmPassword;
	}
	
	public JButton getBVerify() {
		if(bVerify == null) {
			bVerify = new JButton();
			bVerify.setForeground(Color.white);
			bVerify.setBackground(Color.black);
			bVerify.setText("Verify");
			bVerify.setBounds(345,360,97,30);
			bVerify.setFont(font3);
		}
		return bVerify;
	}
	
	public JButton getBBack() {
		if(bBack == null) {
			bBack = new JButton();
			bBack.setForeground(Color.white);
			bBack.setBackground(Color.black);
			bBack.setText("Go back");
			bBack.setBounds(693,410,89,30);
			bBack.setFont(font3);
		}
		return bBack;
	}
}
