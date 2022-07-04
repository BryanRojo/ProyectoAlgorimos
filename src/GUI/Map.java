package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class Map extends JFrame {
	
	private PanelAdministrator panel;
	private JButton bBack;;
	
	public Map(int vertexLen, String []values) {
		
		System.out.println(vertexLen);
		panel = new PanelAdministrator(vertexLen, values);
		panel.add(getBBack());
		panel.setLayout(new BorderLayout(0,0));
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setTitle("New User");
		setContentPane(panel);
		setBounds(100,100,800,480);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	public JButton getBBack() {
		if(bBack == null) {
			bBack = new JButton();
			bBack.setForeground(Color.white);
			bBack.setBackground(Color.black);
			bBack.setText("Exit");
			bBack.setBorder(null);
			bBack.setBounds(195,190,80,20);
			
			bBack.setFont(new Font("Calibri", Font.BOLD, 15));
		}
		return bBack;
	}
}
