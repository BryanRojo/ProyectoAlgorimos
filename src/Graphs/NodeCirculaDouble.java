package Graphs;

public class NodeCirculaDouble {

	public Object element;
	public NodeCirculaDouble sgte;
	public NodeCirculaDouble ant;
	
	public NodeCirculaDouble(Object element) {
		this.element=element;
		this.ant=this.sgte=null;
	}//Node
	
	
}//end class
