package GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class Map extends JFrame {
	
	private PanelAdministrator panel = new PanelAdministrator();
	
	public Map() {
		
	panel.setLayout(new BorderLayout(0,0));
	panel.setBorder(new EmptyBorder(5,5,5,5));
	setTitle("New User");
	setContentPane(panel);
	setBounds(100,100,800,480);
	//setVisible(true);
	setResizable(false);
	setLocationRelativeTo(null);
	}
}
