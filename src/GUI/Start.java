package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Start extends JFrame{
	
	private JLabel lLogin, lUsername, lPassword;
	private JButton bEnter , bNewUser;
	private JTextField tUsername, tPassword;
	
	private Font font = new Font("Cambria", Font.ITALIC, 35);
	private Font font2 = new Font("Calibri", Font.PLAIN, 22);
	private Font font3 = new Font("Calibri", Font.ITALIC, 18);
	
	private PanelStart panel = new PanelStart();
	
	public Start() {
		
		panel.add(getLLogin());
		panel.add(getLUsername());
		panel.add(getLPassword());
		panel.add(getBEnter());
		panel.add(getBNewUser());
		panel.add(getTUsername());
		panel.add(getTPassword());
		
		panel.setLayout(new BorderLayout(0,0));
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setTitle("Principal");
		setContentPane(panel);
		setBounds(100,100,800,480);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public JLabel getLLogin() {
		if(lLogin == null) {
			lLogin = new JLabel();
			lLogin.setForeground(Color.white);
			lLogin.setText("¡Welcome!");
			lLogin.setBounds(510,50,200,80);
			lLogin.setFont(font);
		}
		return lLogin;
	}
	
	public JLabel getLUsername() {
		if(lUsername == null) {
			lUsername = new JLabel();
			lUsername.setForeground(Color.white);
			lUsername.setText("Username:");
			lUsername.setBounds(520,130,200,80);
			lUsername.setFont(font2);
		}
		return lUsername;
	}
	
	public JLabel getLPassword() {
		if(lPassword == null) {
			lPassword = new JLabel();
			lPassword.setForeground(Color.white);
			lPassword.setText("Password:");
			lPassword.setBounds(520,200,200,80);
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
			bEnter.setBounds(525,310,100,25);
			bEnter.setFont(font3);
		}
		return bEnter;
	}
	
	public JButton getBNewUser() {
		if(bNewUser == null) {
			bNewUser = new JButton();
			bNewUser.setForeground(Color.white);
			bNewUser.setBackground(Color.black);
			bNewUser.setText("¿New usser?");
			bNewUser.setBounds(670,410,120,20);
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
			tUsername.setBounds(520,185,140,23);
			tUsername.setFont(font3);
		}
		return tUsername;
	}
	
	public JTextField getTPassword() {
		if(tPassword == null) {
			tPassword = new JTextField();
			tPassword.setForeground(Color.black);
			tPassword.setBackground(Color.white);
			tPassword.setBounds(520,255,140,23);
			tPassword.setFont(font3);
		}
		return tPassword;
	}
	
	
}
