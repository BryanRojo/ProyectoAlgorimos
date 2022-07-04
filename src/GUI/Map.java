package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class Map extends JFrame {
	
	private PanelAdministrator panel;
	private JButton p;
	
	public Map(int vertexLen, String []values) {
		
		System.out.println(vertexLen);
		panel = new PanelAdministrator(vertexLen, values);
		panel.add(g());
		panel.setLayout(new BorderLayout(0,0));
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setTitle("New User");
		setContentPane(panel);
		setBounds(100,100,800,480);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	public JButton g() {
		if(p == null) {
			p = new JButton() ;
			p.setBounds(100,100,20,10);
			p.setText("P");
		}
		return p;
	}
}
