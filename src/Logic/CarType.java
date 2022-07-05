package Logic;

import TDAListas.CircularDoubleLinkedList;

import Domain.CarImage;
import GUI.Car;
public class CarType {

	CircularDoubleLinkedList c;
	Car car;
	
	public CarType() {
		c = new CircularDoubleLinkedList();
		car = new Car();
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
