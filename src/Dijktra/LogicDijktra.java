package Dijktra;

public class LogicDijktra {
	GraphWeighted graphWeighted;
	Vertice[] v;
	
	public LogicDijktra() {
		graphWeighted = new GraphWeighted(true);
	}//Constructor
	
	
	public void crearVertice(String nombres) {
		String[] names=nombres.split(",");
    	v = new Vertice[names.length];
    	for (int i = 0; i < names.length; i++) {
			v[i] = new Vertice(names[i]);
			System.out.println("Añadio: "+names[i]);
		}
    	//validDijktra(names);
	}//crearVertices
	public void createArista(String vertices,String inicio, String fin, int peso) {
		Vertice i= new Vertice(null);
    	Vertice f = new Vertice(null);
    	String[] vertex = vertices.split(",");
    	for (int j = 0; j < vertex.length; j++) {
    		if(v[j].getName().equals(inicio)) {
    			i=v[j];
    		}
		}
    	for (int j = 0; j < vertex.length; j++) {
    		if(v[j].getName().equals(fin)) {
    			f=v[j];
    		}
		}
    	graphWeighted.addEdge(i, f, peso);
    	System.out.println("Se creo de: "+inicio+" - "+fin+" : "+peso);
	}//createArista
	
	
	public void validDijktra(String names[],String salida,String destino) {
		Vertice inicio= new Vertice(null);
    	Vertice fin = new Vertice(null);
    	for(int i = 0; i<names.length; i++) {
    		if(v[i].getName().equals(salida)) {
    			inicio=v[i];
    		}
    	}
    	for (int i = 0; i < names.length; i++) {
    		if(v[i].getName().equals(destino)) {
    			fin=v[i];
    		}
		}
    	graphWeighted.DijkstraShortestPath(inicio, fin);
	}//validDijktra
	
}//end class
