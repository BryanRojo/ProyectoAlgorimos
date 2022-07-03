package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Administrator extends JFrame{
	
	private JButton bSave, bSave2, bBack, bReturn;
	private JTextField tNumberPlaces;
	private JLabel lInstruction,lInstruction2;
	private JTextArea aPlaces;
	private JScrollPane scrollPane;

	public Administrator() {
		
		add(getBSave());
		add(getTNumberPlaces());
		add(getLInstruction());
		
		add(getBSave2());
		add(getScrollPane());
		add(getLInstruction2());
		
		add(getBBack());
		add(getBReturn());
		
		setLayout(null);
		setTitle("Administrator");
		setBounds(100,100,300,250);
		getContentPane().setBackground(Color.black);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		
	}
	
	public JTextField getTNumberPlaces() {
		if(tNumberPlaces==null) {
			tNumberPlaces = new JTextField();
			tNumberPlaces.setBounds(100, 70, 80, 20);
			tNumberPlaces.setColumns(10);
			
			tNumberPlaces.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char caracter = e.getKeyChar();
			      if(((caracter < '0') ||
			         (caracter > '9')) &&
			         (caracter != '\b'))
			      {
			         e.consume();
			      }
			   }
			});
		}
		return tNumberPlaces;
	}
	public JButton getBSave() {
		if (bSave == null) {
			bSave = new JButton("Save");
			bSave.setFont(new Font("Tahoma", Font.BOLD, 19));
			bSave.setBounds(90, 130, 105, 25);
		}
		return bSave;
	}
	
	public JLabel getLInstruction() {
		if (lInstruction == null) {
			lInstruction = new JLabel("Enter the number of places desired");
			lInstruction.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lInstruction.setForeground(Color.white);
			lInstruction.setBounds(40, 25, 300, 25);
		}
		return lInstruction;
	}
	
	public JTextArea getAPlaces() {
		if(aPlaces==null) {
			aPlaces = new JTextArea();
			aPlaces.setBounds(100, 70, 80, 20);
			aPlaces.setColumns(10);
		}
		return aPlaces;
	}
	public JButton getBSave2() {
		if (bSave2 == null) {
			bSave2 = new JButton("Save");
			bSave2.setFont(new Font("Tahoma", Font.BOLD, 19));
			bSave2.setBounds(90, 160, 105, 25);
			bSave2.setVisible(false);
		}
		return bSave2;
	}
	
	public JLabel getLInstruction2() {
		if (lInstruction2 == null) {
			lInstruction2 = new JLabel("Enter the places");
			lInstruction2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lInstruction2.setForeground(Color.white);
			lInstruction2.setBounds(90, 25, 100, 25);
			lInstruction2.setVisible(false);
		}
		return lInstruction2;
	}
	
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(60, 54, 170, 100);
			scrollPane.setViewportView(getAPlaces());
			scrollPane.setVisible(false);
		}
		return scrollPane;
	}
	
	public JButton getBReturn() {
		if(bReturn == null) {
			bReturn = new JButton();
			bReturn.setForeground(Color.white);
			bReturn.setBackground(Color.black);
			bReturn.setText("Return");
			bReturn.setBorder(null);
			bReturn.setBounds(0,190,80,20);
			bReturn.setFont(new Font("Calibri", Font.BOLD, 14));
			bReturn.setVisible(false);
		}
		return bReturn;
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
