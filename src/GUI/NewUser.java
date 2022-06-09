package GUI;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewUser extends JFrame {

	private JLabel  lNewEntry, lName, lLastName, lPhoneNumber, lAdress, lPassword, lConfirmPassword;
	private JTextField tName, tLastName, tPhoneNumber, tAdress, tPassword, tConfirmPassword;
	private JButton bVerify;
	private Font font = new Font("Times New Roman", Font.PLAIN, 22);
	private Font font3 = new Font("Calibri", Font.ITALIC, 16);
	
	public NewUser() {
		
		add(getLNewEntry());
		add(getLName());
		add(getLLastName());
		add(getLAdress());
		add(getLPhoneNumber());
		add(getLPassword());
		add(getLConfirmPassword());
		add(getTName());
		add(getTLastName());
		add(getTAdress());
		add(getTPhoneNumber());
		add(getTPassword());
		add(getTConfirmPassword());
		add(getBVerify());
		
		setLayout(null);
		setTitle("New User");
		setSize(250,500);
		//setVisible(true);
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
	
	public JLabel getLName() {
		if(lName == null) {
			lName = new JLabel();
			lName.setForeground(Color.black);
			lName.setText("Name:");
			lName.setBounds(40,55,100,80);
			lName.setFont(font3);
		}
		return lName;
	}
	
	public JLabel getLLastName() {
		if(lLastName == null) {
			lLastName = new JLabel();
			lLastName.setForeground(Color.black);
			lLastName.setText("Last name:");
			lLastName.setBounds(40,105,100,80);
			lLastName.setFont(font3);
		}
		return lLastName;
	}
	
	public JLabel getLPhoneNumber() {
		if(lPhoneNumber == null) {
			lPhoneNumber = new JLabel();
			lPhoneNumber.setForeground(Color.black);
			lPhoneNumber.setText("Phone number:");
			lPhoneNumber.setBounds(40,155,100,80);
			lPhoneNumber.setFont(font3);
		}
		return lPhoneNumber;
	}
	
	public JLabel getLAdress() {
		if(lAdress == null) {
			lAdress = new JLabel();
			lAdress.setForeground(Color.black);
			lAdress.setText("Adress:");
			lAdress.setBounds(40,205,100,80);
			lAdress.setFont(font3);
		}
		return lAdress;
	}
	
	public JLabel getLPassword() {
		if(lPassword == null) {
			lPassword = new JLabel();
			lPassword.setForeground(Color.black);
			lPassword.setText("New password:");
			lPassword.setBounds(40,255,100,80);
			lPassword.setFont(font3);
		}
		return lPassword;
	}
	
	public JLabel getLConfirmPassword() {
		if(lConfirmPassword == null) {
			lConfirmPassword = new JLabel();
			lConfirmPassword.setForeground(Color.black);
			lConfirmPassword.setText("Confirm password:");
			lConfirmPassword.setBounds(40,305,120,80);
			lConfirmPassword.setFont(font3);
		}
		return lConfirmPassword;
	}
	
	public JTextField getTName() {
		if(tName == null) {
			tName = new JTextField();
			tName.setForeground(Color.black);
			tName.setBackground(Color.white);
			tName.setBounds(55,105,120,20);
			tName.setFont(font3);
		}
		return tName;
	}
	
	public JTextField getTLastName() {
		if(tLastName == null) {
			tLastName = new JTextField();
			tLastName.setForeground(Color.black);
			tLastName.setBackground(Color.white);
			tLastName.setBounds(55,155,120,20);
			tLastName.setFont(font3);
		}
		return tLastName;
	}
	
	public JTextField getTPhoneNumber() {
		if(tPhoneNumber == null) {
			tPhoneNumber = new JTextField();
			tPhoneNumber.setForeground(Color.black);
			tPhoneNumber.setBackground(Color.white);
			tPhoneNumber.setBounds(55,205,120,20);
			tPhoneNumber.setFont(font3);
			}
		return tPhoneNumber;
	}
	
	public JTextField getTAdress() {
		if(tAdress == null) {
			tAdress = new JTextField();
			tAdress.setForeground(Color.black);
			tAdress.setBackground(Color.white);
			tAdress.setBounds(55,255,120,20);
			tAdress.setFont(font3);
		}
		return tAdress;
	}
	
	public JTextField getTPassword() {
		if(tPassword == null) {
			tPassword = new JTextField();
			tPassword.setForeground(Color.black);
			tPassword.setBackground(Color.white);
			tPassword.setBounds(55,305,120,20);
			tPassword.setFont(font3);
		}
		return tPassword;
	}
	public JTextField getTConfirmPassword() {
		if(tConfirmPassword == null) {
			tConfirmPassword = new JTextField();
			tConfirmPassword.setForeground(Color.black);
			tConfirmPassword.setBackground(Color.white);
			tConfirmPassword.setBounds(55,355,120,20);
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
			bVerify.setBounds(67,405,97,30);
			bVerify.setFont(font3);
		}
		return bVerify;
	}
}
