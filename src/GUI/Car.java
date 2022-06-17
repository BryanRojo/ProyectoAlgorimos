package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Car extends JFrame {

	private JLabel lTest, lL;
	private JButton bChoose, bBack;
	
	private PanelCarType panel = new PanelCarType();
	
	public Car() {
	
		panel.add(getBChoose());
		panel.add(getLTest());
		panel.add(getBBack());
		
		panel.setLayout(new BorderLayout(0,0));
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setTitle("Car type");
		setContentPane(panel);
		setBounds(100, 100, 800, 480);
		setLocationRelativeTo(null);
		//setVisible(true);
		
	}
	public JLabel getLTest() {
		if(lTest == null) {
			lTest = new JLabel();
			lTest.setBounds(200, 200, 257, 64);
			lTest.setEnabled(false);
		}
		return lTest;
	}
		
	public JButton getBChoose() {
		if(bChoose==null) {
			bChoose = new JButton("Choose");
			bChoose.setBounds(336, 97, 85, 21);
			bChoose.setBackground(Color.black);
			bChoose.setForeground(Color.white);
		}
		return bChoose;
	}
	
	public JButton getBBack() {
		if(bBack == null) {
			bBack = new JButton();
			bBack.setForeground(Color.white);
			bBack.setBackground(Color.black);
			bBack.setText("Go back");
			bBack.setBounds(693,410,89,30);
		}
		return bBack;
	}
}