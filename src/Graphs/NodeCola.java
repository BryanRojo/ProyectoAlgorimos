package Graphs;

public class NodeCola {

	public NodeCola before;
	public NodeCola sgte;
	public Object element;
	
	public NodeCola(Object element) {
		this.element=element;
		before=null;
		sgte=null;
	}
	
}//end class
