package Logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Ubers;

public class ControllerUber implements ActionListener{

	UberType ut;
	Ubers ul;

	public ControllerUber() {
		ut = new UberType();
		ul = new Ubers();

		initActions();	
	}//Controller


	public void initActions() {
		ul.getJbtnArriba().addActionListener(this);
		ul.getJbtnAbajo().addActionListener(this);
		ul.test().setText(ut.imprimir());
	}//initActions


	@Override
	public void actionPerformed(ActionEvent e) {
		if(ul.getJbtnArriba()==e.getSource()) {
			ul.test().setText(ut.next());
		}
		if(ul.getJbtnAbajo()==e.getSource()) {
			ul.test().setText(ut.before());
		}
	}//actionPerformed


}//end class
