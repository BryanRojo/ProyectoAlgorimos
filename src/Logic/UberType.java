package Logic;

import TDAListas.CircularDoubleLinkedList;

public class UberType {

	CircularDoubleLinkedList c;
	
	public UberType() {
		c = new CircularDoubleLinkedList();
		
		insertUber();
	}//Cosntructor
	
	public void insertUber() {
		c.insert("Uber X");
		c.insert("Uber Planet");
		c.insert("Flash");
		c.insert("Uber XL");
		c.insert("Uber Confort");
		c.insert("Uber VIP");
	}//insertUber
	
	public String imprimir() {
		return c.imprimir();
	}//imprimir
	
	public String next() {
		c.siguiente();
		return c.imprimir();
	}
	
	public String before() {
		c.anterior();
		return c.imprimir();
	}
}//end class
