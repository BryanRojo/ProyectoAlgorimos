package Graphs;

public interface Grafo {

	public void delete();
	
	public boolean isEmpty() throws GrafoException;
	
	public int getSize() throws GrafoException;
	
	public void addVertex(Object element) throws GrafoException;
	
	public void addEdge(Object v1, Object v2) throws GrafoException;
	
	public boolean existVertex(Object v)throws GrafoException; 
	
	public boolean existEdge(Object v1,Object v2)throws GrafoException;
	
	public void addWeight(Object v1, Object v2, Object peso) throws GrafoException;
	
	public void addEdgeWeight(Object v1, Object v2, Object peso) throws GrafoException;
	
	public String dfs() throws GrafoException;
	
	
	
}//end class
