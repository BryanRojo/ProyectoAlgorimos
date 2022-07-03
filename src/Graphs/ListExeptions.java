package Graphs;



public class ListExeptions extends Exception{

	public ListExeptions(String error) {
		super(error);
	}//ListExeption
	
	public void anyTypeofError() {
		System.out.println("This is an error");
	}//anyTypeofError
	
}//end class
