package Logic;

import TDAListas.CircularDoubleLinkedList;

import Domain.CarImage;
public class CarType {

	CircularDoubleLinkedList c;
	CarImage car;
	
	public CarType() {
		c = new CircularDoubleLinkedList();
		car = new CarImage();
		insertUber();
	}
	
	public void insertUber() {
		c.insert("Car X");
		c.insert("Car Planet");
		c.insert("Flash");
		c.insert("Car XL");
		c.insert("Car Confort");
		c.insert("Car VIP");
	}
	
	public String print() {
		return c.print();
	}
	
	public String next() {
		c.nextt();
		return c.print();
	}
	
	public String before() {
		c.beforee();
		return c.print();
	}
}
