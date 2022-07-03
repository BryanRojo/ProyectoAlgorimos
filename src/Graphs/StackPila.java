package Graphs;

public interface StackPila {

	//number of elements of the stack
	public int getSize();
	
	//true or false if the stack is empty
	public boolean isEmpty();
	
	//return the last value entering
	public Object top() throws EmptyStackException;
	
	//add elements to the stack
	public void push(Object element) throws FullStackException;
	
	//remove the last value from the stack
	public Object pop() throws EmptyStackException;
	
	
	
}//end class


