package GUI;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelAdministrator extends JPanel{

	public PanelAdministrator() {
		
	this.setSize(750,480);
	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/Map.png"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);
	}
	
	
}
