package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Road extends JFrame{

	private JButton bLogin, bBack, bReturn;
	private JLabel lFrom,lTo, lDistance, lInstruction;
	private JComboBox cPlace, cDestiny;
	private JTextField tDistance;
	
	public Road(String[] values) {
		
		add(getBLogin());
		add(getCPlace());
		add(getCDestiny());
		add(getTDistance());
		
		add(getLFrom());
		add(getLTo());
		add(getLDistance());
		add(getLInstruction());
		
		add(getBBack());
		add(getBReturn());
		
		setLayout(null);
		setTitle("Road");
		setBounds(100,100,450,308);
		getContentPane().setBackground(Color.black);
		setResizable(false);
		setLocationRelativeTo(null);
	
	}
	
	public JLabel getLInstruction() {
		if(lInstruction == null) {
			lInstruction = new JLabel("ADD ADDRESSES");
			lInstruction.setFont(new Font("Tahoma", Font.BOLD, 28));
			lInstruction.setBounds(100, 10, 423, 76);
		}
		return lInstruction;
	}
	
	public JLabel getLFrom() {
		if(lFrom == null) {
			lFrom = new JLabel();
			lFrom.setForeground(Color.white);
			lFrom.setFont(new Font("Tahoma", Font.BOLD, 15));
			lFrom.setBounds(30, 96, 114, 25);
		}
		return lFrom;
	}
	
	public JLabel getLTo() {
		if(lTo == null) {
			lTo = new JLabel();
			lTo.setForeground(Color.white);
			lTo.setFont(new Font("Tahoma", Font.BOLD, 15));
			lTo.setBounds(302, 96, 114, 25);
		}
		return lTo;
	}
	
	public JLabel getLDistance() {
		if(lDistance == null) {
			lDistance = new JLabel();
			lDistance.setForeground(Color.white);
			lDistance.setFont(new Font("Tahoma", Font.BOLD, 15));
			lDistance.setBounds(178, 96, 114, 25);
		}
		return lDistance;
	}
	
	
	public JComboBox getCPlace() {
		if(cPlace==null) {
			cPlace = new JComboBox();
			cPlace.setBounds(30, 133, 99, 21);
		}
		return cPlace;
	}
	
	public JComboBox Place() {
		return cPlace;
	}
	
	public JComboBox getCDestiny() {
		if(cDestiny==null) {
			cDestiny = new JComboBox();
			cDestiny.setBounds(300, 133, 99, 21);
		}
		return cDestiny;
	}
	
	public JComboBox destiny() {
		return cDestiny;
	}
	
	public JButton getBLogin() {
		if (bLogin == null) {
			bLogin = new JButton("Guardar");
			bLogin.setBackground(Color.white);
			bLogin.setForeground(Color.black);
			bLogin.setFont(new Font("Tahoma", Font.BOLD, 19));
			bLogin.setBounds(166, 199, 115, 30);
		}
		return bLogin;
	}
	
	public JTextField getTDistance() {
		if(tDistance==null) {
			tDistance = new JTextField();
			tDistance.setBounds(168, 137, 96, 19);
			tDistance.setColumns(10);
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
			bReturn.setBounds(0,250,80,20);
			bReturn.setFont(new Font("Calibri", Font.BOLD, 14));
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
			bBack.setBounds(350,250,80,20);
			bBack.setFont(new Font("Calibri", Font.BOLD, 15));
		}
		return bBack;
	}
	
}
