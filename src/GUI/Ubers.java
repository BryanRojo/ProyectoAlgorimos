package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logic.UberType;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Ubers extends JFrame {

	private JPanel contentPane;
	private JTextField jtfTest;
	private JButton jbtnArriba; 
	private JButton jbtnAbajo;
	public Ubers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		contentPane.add(test());
		contentPane.add(getJbtnArriba());
		contentPane.add(getJbtnAbajo());
		
		setVisible(true);
		
		
	}
	
	public JTextField test() {
		if(jtfTest==null) {
			jtfTest = new JTextField();
			jtfTest.setBounds(48, 97, 257, 64);
			jtfTest.setColumns(10);
			jtfTest.setEnabled(false);
		}
		return jtfTest;
	}
	
	public JButton getJbtnArriba() {
		if(jbtnArriba==null) {
			jbtnArriba = new JButton("Arriba");
			jbtnArriba.setBounds(336, 97, 85, 21);
		}
		return jbtnArriba;
	}
	
	public JButton getJbtnAbajo() {
		if(jbtnAbajo==null) {
			jbtnAbajo = new JButton("Abajo");
			jbtnAbajo.setBounds(336, 127, 85, 21);
			
		}
		return jbtnAbajo;
	}

	
}
