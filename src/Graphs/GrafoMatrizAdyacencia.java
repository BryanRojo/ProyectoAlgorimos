package Graphs;

public class GrafoMatrizAdyacencia implements Grafo{

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() throws GrafoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() throws GrafoException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addVertex(Object element) throws GrafoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEdge(Object v1, Object v2) throws GrafoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existVertex(Object v) throws GrafoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existEdge(Object v1, Object v2) throws GrafoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addWeight(Object v1, Object v2, Object peso) throws GrafoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEdgeWeight(Object v1, Object v2, Object peso) throws GrafoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dfs() throws GrafoException {
		// TODO Auto-generated method stub
		return null;
	}

/*	
	private Vertice[] vertices;
	private Object[][] matrixAdyacencia;
	private int contador;
	private int n;
	private ArrayStackPila pila;
	
	public GrafoMatrizAdyacencia(int n) {
		if(n <= 0) {
			System.out.println("La matriz no puede ser 0 ni negativa");
			System.exit(0);
		}
		this.n=n;
		contador=0;
		vertices= new Vertice[n];
		matrixAdyacencia = new Object[n][n];
		pila = new ArrayStackPila();
		inicializarMtriz();
	}//Constructor
	
	
	public void inicializarMtriz() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrixAdyacencia[i][j]=0;
			}
		}
	}//inicializarMatriz
	
	
	
	@Override
	public void delete() {
		for (int i = 0; i < contador; i++) {
			vertices[i]=null;
			
		}
		contador=0;
		inicializarMtriz();
	}//anular

	@Override
	public boolean isEmpty() throws GrafoException {
		return contador==0;
	}//isEmpty

	@Override
	public int getSize() throws GrafoException {
		if(isEmpty()) {
			throw new GrafoException("El grafo no existe");
		}
		return contador;
	}//getSize

	@Override
	public void addVertice(Object element) throws GrafoException {
		if(contador==vertices.length) {
			throw new GrafoException("El grafo está lleno");
		}
		vertices[contador++] = new Vertice(element);
		
	}//addVertcie

	@Override
	public void addEdge(Object v1, Object v2) throws GrafoException {
		if(!existVertice(v1) || !existVertice(v2)) {
			throw new GrafoException("Uno o ambos vertices no existen");
		}
		matrixAdyacencia[getPosicion(v1)][getPosicion(v2)] =1;
		//grafo no dirigido
		matrixAdyacencia[getPosicion(v2)][getPosicion(v1)] =1;
		
	}


	@Override
	public boolean existVertice(Object v) throws GrafoException {
		if(isEmpty()) {
			throw new GrafoException("No hay grafo");
		}
		
		for (int i = 0; i < contador; i++) {
			if(vertices[i].element.equals(v)) {
				return true;
			}
			
		}
		return false;
	}//existVertice


	@Override
	public boolean existArista(Object v1, Object v2) throws GrafoException {
		if(isEmpty()) {
			throw new GrafoException("No existe grafo");
		}
		if(matrixAdyacencia[getPosicion(v1)][getPosicion(v2)]!=(Object)0) {
			return true;
		}
		return false;
		
	}

	@Override
	public void addPeso(Object v1, Object v2, Object peso) throws GrafoException {
		
		if(!existArista(v1, v2)) {
			throw new GrafoException("No existe la arista");
		}
		matrixAdyacencia[getPosicion(v1)][getPosicion(v2)]=peso;
		matrixAdyacencia[getPosicion(v2)][getPosicion(v1)] =peso;
		
	}

	private int getPosicion(Object elemento) {
		
		for (int i = 0; i < contador; i++) {
			if(vertices[i].element.equals(elemento)) {
				return i;
			}
		}
		return -1;
	}


	public String toString() {
		String result="Vertices: ";
		for (int i = 0; i < vertices.length; i++) {
			result+=vertices[i].element+"-";
		}
		result+="\n";
		result+="Aristas";
		result+="\n";
		for (int i = 0; i < matrixAdyacencia.length; i++) {
			for (int j = 0; j < matrixAdyacencia.length; j++) {
				result+=matrixAdyacencia[i][j]+"-";
			}
			result+="\n";
		}
		return result;
	}
	@Override
	public void addAristayPeso(Object v1, Object v2, Object peso) throws GrafoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addEdge(Object v1, Object v2) throws GrafoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean existEdge(Object v1, Object v2) throws GrafoException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void addWeight(Object v1, Object v2, Object peso) throws GrafoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addEdgeWeight(Object v1, Object v2, Object peso) throws GrafoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String dfs() throws GrafoException {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	
}//end class
