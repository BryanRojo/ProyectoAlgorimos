package Graphs;

public interface StackCola {

	public void encolar(Object n) throws FullStackException;
	
	public int getSize();
	
	public void anular() throws EmptyStackException;
	
	public Object desencolar() throws EmptyStackException;
	
	public int getPosicion(Object element);
	
	public Object frente() throws FullStackException;
	
	public boolean exist(Object value) throws EmptyStackException;
	 public boolean isEmpty();
	
}//end class


