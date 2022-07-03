package Graphs;

public class Vertex {

	Object element;
	boolean visited;
	boolean destiny;
	
	DoubleCircularLists listArista, listPesos;
	
	public Vertex(Object element) {
		this.element=element;
		this.destiny=false;
		this.visited=false;
		listArista = new DoubleCircularLists();
		listPesos=new DoubleCircularLists();
	}//Constructor
	
}//end class
