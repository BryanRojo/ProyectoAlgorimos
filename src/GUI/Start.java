package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Start extends JFrame{
	
	private JLabel lAppName, lLogin, lUsername, lPassword;
	private JButton bEnter , bNewUser;
	private JTextField tUsername, tPassword;
	private Font font = new Font("Cambria", Font.ITALIC, 22);
	private Font font2 = new Font("Calibri", Font.PLAIN, 20);
	private Font font3 = new Font("Calibri", Font.ITALIC, 14);
	
	public Start() {
		
		add(getLAppName());
		add(getLLogin());
		add(getLUsername());
		add(getLPassword());
		add(getBEnter());
		add(getBNewUser());
		add(getTUsername());
		add(getTPassword());
	
		setLayout(null);
		setTitle("Principal");
		setSize(300,450);
		setVisible(true);
		getContentPane().setBackground(new Color(246,209,151));
		setLocationRelativeTo(null);
	}
	
	public JLabel getLAppName() {
		if(lAppName == null) {
			lAppName = new JLabel();
			lAppName.setForeground(Color.black);
			lAppName.setText("Transport CVNBN");
			lAppName.setBounds(55,5,200,80);
			lAppName.setFont(font);
		}
		return lAppName;
	}
	
	public JLabel getLLogin() {
		if(lLogin == null) {
			lLogin = new JLabel();
			lLogin.setForeground(Color.black);
			lLogin.setText("¡Welcome!");
			lLogin.setBounds(100,70,200,80);
			lLogin.setFont(font2);
		}
		return lLogin;
	}
	
	public JLabel getLUsername() {
		if(lUsername == null) {
			lUsername = new JLabel();
			lUsername.setForeground(Color.black);
			lUsername.setText("Username:");
			lUsername.setBounds(70,120,200,80);
			lUsername.setFont(font2);
		}
		return lUsername;
	}
	
	public JLabel getLPassword() {
		if(lPassword == null) {
			lPassword = new JLabel();
			lPassword.setForeground(Color.black);
			lPassword.setText("Password:");
			lPassword.setBounds(70,180,200,80);
			lPassword.setFont(font2);
		}
		return lPassword;
	}
	
	public JButton getBEnter() {
		if(bEnter == null) {
			bEnter = new JButton();
			bEnter.setForeground(Color.black);
			bEnter.setBackground(Color.white);
			bEnter.setText("Login");
			bEnter.setBounds(72,280,100,20);
			bEnter.setFont(font3);
		}
		return bEnter;
	}
	
	public JButton getBNewUser() {
		if(bNewUser == null) {
			bNewUser = new JButton();
			bNewUser.setForeground(Color.black);
			bNewUser.setBackground(new Color(246,209,151));
			bNewUser.setText("¿New usser?");
			bNewUser.setBounds(170,380,120,20);
			bNewUser.setFont(font3);
			bNewUser.setBorder(null);
		}
		return bNewUser;
	}
	
	public JTextField getTUsername() {
		if(tUsername == null) {
			tUsername = new JTextField();
			tUsername.setForeground(Color.black);
			tUsername.setBackground(Color.white);
			tUsername.setBounds(70,175,120,20);
			tUsername.setFont(font3);
		}
		return tUsername;
	}
	
	public JTextField getTPassword() {
		if(tPassword == null) {
			tPassword = new JTextField();
			tPassword.setForeground(Color.black);
			tPassword.setBackground(Color.white);
			tPassword.setBounds(70,230,120,20);
			tPassword.setFont(font3);
		}
		return tPassword;
	}
	
	
}
