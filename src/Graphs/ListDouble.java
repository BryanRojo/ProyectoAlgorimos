package Graphs;

public interface ListDouble {

	//add new data to the list
	public void insertar(Object element) ;

	//delete data to the list
	public void detele(Object element) throws ListExeptions;
	
	//number of nodes from the list
	public int getSize() throws ListExeptions;
	
	//true if the list is empty
	public boolean isEmpty();
	
	//reset all the list
	public void anular();
	
	public Object getByPosition(Object n) throws ListExeptions;
	
	public void deleteByPosition(int pos) throws ListExeptions;
	
	public void exist(Object element);
	
	public void lastInTheList();
	
	public Object firstInTheList();
	
	public void addSord(Object n);
	
	

	Object firstInList();
	
}//end class
