package Logic;

import Graphs.GrafoException;
import Graphs.GrafoListaAdyacencia;

public class CreateGraphs {

	GrafoListaAdyacencia graph;
	
	public CreateGraphs() {
		
	}//Constructor
	
	public void createGraph(int sizes) {
		graph = new GrafoListaAdyacencia(sizes);
	}//createGrafo
	
	public void addVertex(String nodes) throws GrafoException {
		String[] vertices = nodes.split(",");
		for (int i = 0; i < vertices.length; i++) {
			graph.addVertex(vertices[i]);
		}
	}//addVertice
	
	public void addArista(String lugar, String destino, int peso) throws GrafoException {
		graph.addEdgeWeight(lugar, destino, peso);
		System.out.println(graph.existEdge(lugar, destino));
	}//addArista
	
	
	/*g.addVertice("A");
	g.addVertice("B");
	g.addVertice("C");
	g.addVertice("D");
	g.addVertice("E");
	System.out.println("Esta vacia? "+g.isEmpty());
	System.out.println("-------------------------------------");
	System.out.println("Tamaño: "+g.getSize());
	System.out.println("-------------------------------------");
	System.out.println("Añadimos aristas y pesos");
	g.addEdgeWeight("A", "B", 15);
	g.addEdgeWeight("A", "C", 43);
	g.addEdgeWeight("A", "D", 43);
	g.addEdgeWeight("B", "E", 5);
	g.addEdgeWeight("C", "E", 12);
	g.addEdgeWeight("D", "E", 45);
	
	System.out.println("-------------------------------------");
	
	System.out.println("Existe la arista?: "+g.existEdge("B", "E"));
	System.out.println("-------------------------------------");
	System.out.println("BFS");
	System.out.println(g.bfs());
	System.out.println("-------------------------------------");
	System.out.println("DFS");*/
	
}//end class
