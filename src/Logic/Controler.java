package Logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Domain.User;
import GUI.NewUser;
import GUI.Principal;
import GUI.Start;

public class Controler implements ActionListener{

	private Start start;
	private NewUser newUser;
	private Principal principal;
	private Files file;
	private String password = "";
	private String name = "";
	private boolean condition = false, condition2 = false;

	public Controler() {
		start = new Start();
		newUser = new NewUser();
		principal = new Principal();
		file = new Files();
		init();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {}
	
	private void verifyNewUser() {
		if(newUser.getTPassword().getText().equals(newUser.getTConfirmPassword().getText())) {
			this.password = newUser.getTPassword().getText();
			if(this.password.length() >= 8) {
				this.condition = true;
			}else {
				JOptionPane.showMessageDialog(null, "Passwords contain less than 8 characters.", "Warning", JOptionPane.WARNING_MESSAGE);	
			}
		}else {
			JOptionPane.showMessageDialog(null, "Passwords do not match, try again.", "Warning", JOptionPane.WARNING_MESSAGE);	
			}
		if(newUser.getTName().getText().equals("") || newUser.getTLastName().getText().equals("")||newUser.getTAdress().getText().equals("") || this.password.equals("") || newUser.getTPhoneNumber().getText().equals("")) {
			JOptionPane.showMessageDialog(null, "One or more fields are empty, try again.", "Warning", JOptionPane.WARNING_MESSAGE);	
		}else {
			this.condition2 = true;
		}
	}
	
	private void saveUser() {
		if(this.condition== true && condition2 == true) {
		User user = new User(newUser.getTName().getText(), newUser.getTLastName().getText(), newUser.getTAdress().getText(), this.password, newUser.getTPhoneNumber().getText());
		this.name = user.getName();
		file.addUser(user);
		file.saveNamePassword(this.name, this.password);
		JOptionPane.showMessageDialog(null, "Saved successfully.\nYour user is: "+ user.getName()+"\nYour password is: "+user.getPassword());	
		}
	}
	
	private void verifyUser() {
		if(start.getTUsername().getText().equals(null)&& start.getTPassword().getText().equals(null)){
			JOptionPane.showMessageDialog(null, "User or password are empty, try again.", "Warning", JOptionPane.WARNING_MESSAGE);	
		}else {
			boolean condition3 = false;
			condition3 = file.verifyUser(start.getTUsername().getText(), start.getTPassword().getText());
			if(condition3 == true) {
				JOptionPane.showMessageDialog(null, "Successful start.", "Information", JOptionPane.INFORMATION_MESSAGE);	
				start.setVisible(false);
				principal.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, "User or passwrod is wrong, try again.", "Warning", JOptionPane.WARNING_MESSAGE);	
			}
		}
	}

	private void visible() {
		newUser.setVisible(true);
		start.setVisible(false);
	}
	
	private void visible2() {
		if(this.condition == true && this.condition2 == true) {
			newUser.setVisible(false);
			start.setVisible(true);
			newUser.getTName().setText(null);
			newUser.getTLastName().setText(null); 
			newUser.getTAdress().setText(null);
			newUser.getTPassword().setText(null);
			newUser.getTConfirmPassword().setText(null);
			newUser.getTPhoneNumber().setText(null);
		}
	}
	
	private void init() {
		start.getBNewUser().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visible();
			}
		});
		
		newUser.getBVerify().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verifyNewUser();
				saveUser();
				visible2();
			}
		});
		
		start.getBEnter().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verifyUser();
			}
		});
		
	}
}
