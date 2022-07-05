package GUI;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelChooseDriver extends JPanel {

	public PanelChooseDriver() {
		
		this.setSize(750,480);
	}
	
	@Override
	public void paint(Graphics g) {
		Dimension space = this.getSize();
        ImageIcon iconDriver = new ImageIcon(getClass().getResource("/Images/Drivers.jpeg"));
        g.drawImage(iconDriver.getImage(), 0, 0, space.width, space.height, null);
        setOpaque(false);
        super.paintChildren(g);
	}

}
