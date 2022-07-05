package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class Drivers extends JFrame{
	private JLabel lName,lBrand,lQualification,lPayment;
	private JLabel lName2,lBrand2,lQualification2,lPayment2;
	private JLabel lName3,lBrand3,lQualification3,lPayment3;
	private JLabel iName,iBrand,iQualification,iPayment;
	private JLabel iName2,iBrand2,iQualification2,iPayment2;
	private JLabel iName3,iBrand3,iQualification3,iPayment3;
	private JButton bChooseDriver1,bChooseDriver2,bChooseDriver3, bBack, bReturn;
	
	private PanelChooseDriver panel = new PanelChooseDriver();
	
	public Drivers() {
		
		panel.add(getbChooseDriver1());
		panel.add(getbChooseDriver2());
		panel.add(getbChooseDriver3());
		panel.add(getbBack());
		panel.add(getBReturn());
		
		panel.add(getLName());
		panel.add(getLBrand());
		panel.add(getLQualification());
		panel.add(getLPayment());
		
		panel.add(getLName2());
		panel.add(getLBrand2());
		panel.add(getLQualification2());
		panel.add(getLPayment2());
		
		panel.add(getLName3());
		panel.add(getLBrand3());
		panel.add(getLQualification3());
		panel.add(getLPayment3());
		
		panel.add(getIName());
		panel.add(getIBrand());
		panel.add(getIQualification());
		panel.add(getIPayment());
		
		panel.add(getIName2());
		panel.add(getIBrand2());
		panel.add(getIQualification2());
		panel.add(getIPayment2());
		
		panel.add(getIName3());
		panel.add(getIBrand3());
		panel.add(getIQualification3());
		panel.add(getIPayment3());
		
		panel.setLayout(new BorderLayout(0,0));
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setTitle("Choose your driver");
		setContentPane(panel);
		setBounds(100, 100, 800, 480);
		setLocationRelativeTo(null);
	}


	public JButton getbBack() {
		if(bBack == null) {
			bBack = new JButton();
			bBack.setForeground(Color.white);
			bBack.setBackground(Color.gray);
			bBack.setText("Go back");
			bBack.setBounds(693,410,89,30);
		}
		return bBack;
	}
	
	public JButton getBReturn() {
		if(bReturn == null) {
			bReturn = new JButton();
			bReturn.setForeground(Color.white);
			bReturn.setBackground(Color.black);
			bReturn.setText("Return");
			bReturn.setBorder(null);
			bReturn.setBounds(0,410,80,20);
			bReturn.setFont(new Font("Calibri", Font.BOLD, 14));
		}
		return bReturn;
	}
	
	public JLabel getIName() {
		if(iName == null) {
			iName = new JLabel();
			iName.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iName.setForeground(Color.white);
			iName.setBounds(190, 200, 257, 64);
		}
		return iName;
	}
	
	public JLabel getIBrand() {
		if(iBrand == null) {
			iBrand = new JLabel();
			iBrand.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iBrand.setForeground(Color.white);
			iBrand.setBounds(190, 220, 257, 64);
		}
		return iBrand;
	}
	
	public JLabel getIQualification() {
		if(iQualification == null) {
			iQualification = new JLabel();
			iQualification.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iQualification.setForeground(Color.white);
			iQualification.setBounds(190, 240, 257, 64);
		}
		return iQualification;
	}
	
	public JLabel getIPayment() {
		if(iPayment == null) {
			iPayment = new JLabel();
			iPayment.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iPayment.setForeground(Color.white);
			iPayment.setBounds(190, 260, 257, 64);
		}
		return iPayment;
	}
	
	public JLabel getIName2() {
		if(iName2 == null) {
			iName2 = new JLabel();
			iName2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iName2.setForeground(Color.white);
			iName2.setBounds(420, 200, 257, 64);
		}
		return iName2;
	}
	
	public JLabel getIBrand2() {
		if(iBrand2 == null) {
			iBrand2 = new JLabel();
			iBrand2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iBrand2.setForeground(Color.white);
			iBrand2.setBounds(420, 220, 257, 64);
		}
		return iBrand2;
	}
	
	public JLabel getIQualification2() {
		if(iQualification2 == null) {
			iQualification2 = new JLabel();
			iQualification2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iQualification2.setForeground(Color.white);
			iQualification2.setBounds(420, 240, 257, 64);
		}
		return iQualification2;
	}
	
	public JLabel getIPayment2() {
		if(iPayment2 == null) {
			iPayment2 = new JLabel();
			iPayment2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iPayment2.setForeground(Color.white);
			iPayment2.setBounds(420, 260, 257, 64);
		}
		return iPayment2;
	}
	
	public JLabel getIName3() {
		if(iName3 == null) {
			iName3 = new JLabel();
			iName3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iName3.setForeground(Color.white);
			iName3.setBounds(630, 200, 257, 64);
		}
		return iName3;
	}
	
	public JLabel getIBrand3() {
		if(iBrand3 == null) {
			iBrand3 = new JLabel();
			iBrand3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iBrand3.setForeground(Color.white);
			iBrand3.setBounds(630, 220, 257, 64);
		}
		return iBrand3;
	}
	
	public JLabel getIQualification3() {
		if(iQualification3 == null) {
			iQualification3 = new JLabel();
			iQualification3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iQualification3.setForeground(Color.white);
			iQualification3.setBounds(630, 240, 257, 64);
		}
		return iQualification3;
	}
	
	public JLabel getIPayment3() {
		if(iPayment3 == null) {
			iPayment3 = new JLabel();
			iPayment3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			iPayment3.setForeground(Color.white);
			iPayment3.setBounds(630, 260, 257, 64);
		}
		return iPayment3;
	}
	
	private JLabel getLName() {
		if(lName == null) {
			lName = new JLabel("Name: ");
			lName.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lName.setForeground(Color.white);
			lName.setBounds(100, 200, 257, 64);
		}
		return lName;
	}
	
	private JLabel getLBrand() {
		if(lBrand == null) {
			lBrand = new JLabel("Brand: ");
			lBrand.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lBrand.setForeground(Color.white);
			lBrand.setBounds(100, 220, 257, 64);
		}
		return lBrand;
	}
	
	private JLabel getLQualification() {
		if(lQualification == null) {
			lQualification = new JLabel("Qualification: ");
			lQualification.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lQualification.setForeground(Color.white);
			lQualification.setBounds(100, 240, 257, 64);
		}
		return lQualification;
	}
	
	private JLabel getLPayment() {
		if(lPayment == null) {
			lPayment = new JLabel("Payment: ");
			lPayment.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lPayment.setForeground(Color.white);
			lPayment.setBounds(100, 260, 257, 64);
		}
		return lPayment;
	}
	
	private JLabel getLName2() {
		if(lName2 == null) {
			lName2 = new JLabel("Name: ");
			lName2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lName2.setForeground(Color.white);
			lName2.setBounds(315, 200, 257, 64);
		}
		return lName2;
	}
	
	private JLabel getLBrand2() {
		if(lBrand2 == null) {
			lBrand2 = new JLabel("Brand: ");
			lBrand2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lBrand2.setForeground(Color.white);
			lBrand2.setBounds(315, 220, 257, 64);
		}
		return lBrand2;
	}
	
	private JLabel getLQualification2() {
		if(lQualification2 == null) {
			lQualification2 = new JLabel("Qualification: ");
			lQualification2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lQualification2.setForeground(Color.white);
			lQualification2.setBounds(315, 240, 257, 64);
		}
		return lQualification2;
	}
	
	private JLabel getLPayment2() {
		if(lPayment2 == null) {
			lPayment2 = new JLabel("Payment: ");
			lPayment2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lPayment2.setForeground(Color.white);
			lPayment2.setBounds(315, 260, 257, 64);
		}
		return lPayment2;
	}
	
	private JLabel getLName3() {
		if(lName3 == null) {
			lName3 = new JLabel("Name: ");
			lName3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lName3.setForeground(Color.white);
			lName3.setBounds(535, 200, 257, 64);
		}
		return lName3;
	}
	
	private JLabel getLBrand3() {
		if(lBrand3 == null) {
			lBrand3 = new JLabel("Brand: ");
			lBrand3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lBrand3.setForeground(Color.white);
			lBrand3.setBounds(535, 220, 257, 64);
		}
		return lBrand3;
	}
	
	private JLabel getLQualification3() {
		if(lQualification3 == null) {
			lQualification3 = new JLabel("Qualification: ");
			lQualification3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lQualification3.setForeground(Color.white);
			lQualification3.setBounds(535, 240, 257, 64);
		}
		return lQualification3;
	}
	
	private JLabel getLPayment3() {
		if(lPayment3 == null) {
			lPayment3 = new JLabel("Payment: ");
			lPayment3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lPayment3.setForeground(Color.white);
			lPayment3.setBounds(535, 260, 257, 64);
		}
		return lPayment3;
	}

	public JButton getbChooseDriver1() {
		if(bChooseDriver1==null) {
			bChooseDriver1 = new JButton("Choose driver");
			bChooseDriver1.setBounds(120, 360, 115, 21);
			bChooseDriver1.setBackground(Color.black);
			bChooseDriver1.setForeground(Color.gray);
		}
		return bChooseDriver1;
	}
	
	public JButton getbChooseDriver2() {
		if(bChooseDriver2==null) {
			bChooseDriver2 = new JButton("Choose driver");
			bChooseDriver2.setBounds(315, 360, 115, 21);
			bChooseDriver2.setBackground(Color.black);
			bChooseDriver2.setForeground(Color.gray);
		}
		return bChooseDriver2;
	}
	
	public JButton getbChooseDriver3() {
		if(bChooseDriver3==null) {
			bChooseDriver3 = new JButton("Choose driver");
			bChooseDriver3.setBounds(533, 360, 115, 21);
			bChooseDriver3.setBackground(Color.black);
			bChooseDriver3.setForeground(Color.gray);
		}
		return bChooseDriver3;
	}
}
