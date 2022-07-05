package Dijktra;

import java.util.LinkedList;

public class Vertice {
	int n;
    String name;
    private boolean visited;
    LinkedList<EdgeWeighted> edges;

    public Vertice( String name) {
        //this.n = n;
        this.name = name;
        visited = false;
        edges = new LinkedList<>();
    }

    public String getName() {
    	return name;
    }
    boolean isVisited() {
        return visited;
    }

    void visit() {
        visited = true;
    }

    void unvisit() {
        visited = false;
    }
}
