package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Administrator extends JFrame{
	
	private JButton bSave, bSave2, bBack, bReturn, bLogin, bGoBack, bNext;
	private JTextField tNumberPlaces, tDistance;
	private JLabel lInstruction,lInstruction2,lFrom,lTo, lDistance, lInstruction3;
	private JTextArea aPlaces;
	private JScrollPane scrollPane;
	private JComboBox cPlace, cDestiny;

	public Administrator() {
		
		add(getBSave());
		add(getTNumberPlaces());
		add(getLInstruction());
		
		add(getBSave2());
		add(getScrollPane());
		add(getLInstruction2());
		
		add(getBLogin());
		add(getCPlace());
		add(getCDestiny());
		add(getTDistance());
		
		add(getLFrom());
		add(getLTo());
		add(getLDistance());
		add(getLInstruction3());
		
		add(getBBack());
		add(getBReturn());
		add(getBGoBack());
		add(getBNext());
		
		setLayout(null);
		setTitle("Administrator");
		setBounds(100,100,300,250);
		getContentPane().setBackground(Color.black);
		//setVisible(true);
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
	

	public JLabel getLInstruction3() {
		if(lInstruction3 == null) {
			lInstruction3 = new JLabel("ADD ADDRESSES");
			lInstruction3.setFont(new Font("Tahoma", Font.BOLD, 20));
			lInstruction3.setBounds(50, 10, 200, 30);
			lInstruction3.setVisible(false);
		}
		return lInstruction3;
	}
	
	public JLabel getLFrom() {
		if(lFrom == null) {
			lFrom = new JLabel();
			lFrom.setForeground(Color.white);
			lFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
			lFrom.setBounds(10, 50, 80, 20);
			lFrom.setVisible(false);
		}
		return lFrom;
	}
	
	public JLabel getLTo() {
		if(lTo == null) {
			lTo = new JLabel();
			lTo.setForeground(Color.white);
			lTo.setFont(new Font("Tahoma", Font.BOLD, 12));
			lTo.setBounds(210, 50, 80, 25);
			lTo.setVisible(false);
		}
		return lTo;
	}
	
	public JLabel getLDistance() {
		if(lDistance == null) {
			lDistance = new JLabel();
			lDistance.setForeground(Color.white);
			lDistance.setFont(new Font("Tahoma", Font.BOLD, 12));
			lDistance.setBounds(110, 50, 80, 25);
			lDistance.setVisible(false);
		}
		return lDistance;
	}
	
	
	public JComboBox getCPlace() {
		if(cPlace==null) {
			cPlace = new JComboBox();
			cPlace.setBounds(0, 100, 85, 21);
			cPlace.setVisible(false);
		}
		return cPlace;
	}
	
	public JComboBox Place() {
		return cPlace;
	}
	
	public JComboBox getCDestiny() {
		if(cDestiny==null) {
			cDestiny = new JComboBox();
			cDestiny.setBounds(200, 100, 85, 21);
			cDestiny.setVisible(false);
		}
		return cDestiny;
	}
	
	public JComboBox destiny() {
		return cDestiny;
	}
	
	public JButton getBLogin() {
		if (bLogin == null) {
			bLogin = new JButton("Save");
			bLogin.setBackground(Color.white);
			bLogin.setForeground(Color.black);
			bLogin.setBorder(null);
			bLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
			bLogin.setBounds(100, 140, 100, 25);
			bLogin.setVisible(false);
		}
		return bLogin;
	}
	
	public JButton getBNext() {
		if (bNext == null) {
			bNext = new JButton("Next");
			bNext.setBackground(Color.white);
			bNext.setForeground(Color.black);
			bNext.setBorder(null);
			bNext.setFont(new Font("Tahoma", Font.BOLD, 19));
			bNext.setBounds(100, 180, 95, 25);
			bNext.setVisible(false);
		}
		return bNext;
	}
	
	public JTextField getTDistance() {
		if(tDistance==null) {
			tDistance = new JTextField();
			tDistance.setBounds(100, 100, 80, 19);
			tDistance.setColumns(10);
			tDistance.setVisible(false);
		}
		return tDistance;
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
	
	public JButton getBGoBack() {
		if(bGoBack == null) {
			bGoBack = new JButton();
			bGoBack.setForeground(Color.white);
			bGoBack.setBackground(Color.black);
			bGoBack.setText("Return");
			bGoBack.setBorder(null);
			bGoBack.setBounds(0,190,80,20);
			bGoBack.setFont(new Font("Calibri", Font.BOLD, 14));
			bGoBack.setVisible(false);
		}
		return bGoBack;
	}
}
