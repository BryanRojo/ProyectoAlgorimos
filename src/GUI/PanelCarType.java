package GUI;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelCarType extends JPanel{
	
		public PanelCarType() {
			
		this.setSize(750,480);
		}
		
		@Override
		public void paint(Graphics g) {
			Dimension dimension = this.getSize();
	        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/CarType.png"));
	        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
	        setOpaque(false);
	        super.paintChildren(g);
		}
}
