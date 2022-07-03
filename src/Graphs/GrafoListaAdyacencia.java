package Graphs;

public class GrafoListaAdyacencia implements Grafo{

	private Vertex[] vertex;
	//private Object routes[][];
	
	private ArrayStackPila pila;
	//private ColaEnlazada cola;
	
	private int n;
	private int count;

	public GrafoListaAdyacencia(int n) { 
		if(n<=0) {
			System.exit(0);
		}
		this.n=n;

		this.count=0;
		vertex = new Vertex[n];
		pila = new ArrayStackPila();
		//cola = new ColaEnlazada();
		System.out.println("Created");
	}
	@Override
	public void delete() {
		for (int i = 0; i < count; i++) {
			vertex[i]=null;
		}
		count=0;

	}
	@Override
	public boolean isEmpty() throws GrafoException {
		return count==0;
	}
	@Override
	public int getSize() throws GrafoException {
		return count;
	}
	@Override
	public void addVertex(Object element) throws GrafoException {
		if(count>=vertex.length) {
			throw new GrafoException("The graph is full");
		}
		vertex[count++]= new Vertex(element);
	}
	@Override
	public void addEdge(Object v1, Object v2) throws GrafoException {
		vertex[getPosition(v1)].listArista.insertar(v2);
		vertex[getPosition(v2)].listArista.insertar(v1);
	}
	@Override
	public boolean existVertex(Object v) throws GrafoException {
		if(isEmpty()) {
			throw new GrafoException("There is no graph");
		}

		for (int i = 0; i < count; i++) {
			if(vertex[i].element.equals(v)) {
				return true;
			}

		}
		return false;
	}

	@Override
	public void addWeight(Object v1, Object v2, Object peso) throws GrafoException {}
	
	@Override
	public boolean existEdge(Object v1, Object v2) throws GrafoException {
		if (!this.existVertex(v1)||!this.existVertex(v2)) {
			throw new GrafoException("One of the vertices does not exist"); 
		}
		if(this.vertex[this.getPosition(v1)].listArista.exists(v2)||
				this.vertex[this.getPosition(v2)].listArista.exists(v1)){
			return true; 
		}
		return false; 
	}

	@Override
	public void addEdgeWeight(Object v1, Object v2, Object peso) throws GrafoException {
		vertex[getPosition(v1)].listArista.insertar(v2);
		vertex[getPosition(v2)].listArista.insertar(v1);
		vertex[getPosition(v1)].listPesos.insertar(peso);
		vertex[getPosition(v2)].listPesos.insertar(peso);
		System.out.println("Added: "+v1.toString()+" -> "+v2.toString()+" -> "+peso.toString());

	}

	private Object showVertice(int pos) throws GrafoException{
		if(pos<0 || pos==count) {
			throw new GrafoException("It's full");
		}
		return vertex[pos].element.toString();
	}

	private int verticeAdyaVisit(int v)throws GrafoException {
		for (int i = 0; i < count; i++) {
			if(vertex[i].listArista.exists(showVertice(v)) && vertex[i].visited==false) {
				return i;
			}

		}
		return -1;
	}

	private int getPosition(Object element) {

		for (int i = 0; i < count; i++) {
			if(vertex[i].element.equals(element)) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public String dfs() throws GrafoException {
		String info="";
		vertex[0].visited=true;
		info=showVertice(0)+" ";
		pila.push(0);

		while(!pila.isEmpty()) {
			int v = verticeAdyaVisit(Integer.parseInt(pila.top().toString()));
			if(v==-1) {
				pila.pop();
			}else {
				vertex[v].visited=true;
				info+=showVertice(v)+" ";
				pila.push(v);
			}
		}
		for (int i = 0; i < count; i++) {
			vertex[i].visited=false;
		}
		return info;
	}
	public String bfs() throws GrafoException {
		String info="A,";
		String fin="";
		//String[] see = new String[1];
		String[] x = vertex[getPosition("A")].listArista.toString().split(",");
		info+=vertex[getPosition("A")].listArista.toString();
		for (int i = 0; i < x.length; i++) {
			String[] y = vertex[getPosition(x[i])].listArista.toString().split(",");
			for (int j = 1; j < y.length; j++) {
					info+=y[j]+",";
			}
		}
		String[] w = info.split(",");
		for (int i = 0; i < w.length; i++) {
			if(i+1<w.length) {
				if(!w[i].equals(w[i+1])) {
					fin+=w[i]+",";
				}
			}
			
		}
		fin+=w[w.length-1];
		return fin; 
	}
}//end class

