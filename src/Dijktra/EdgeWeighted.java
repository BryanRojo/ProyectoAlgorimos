package Dijktra;

public class EdgeWeighted implements Comparable<EdgeWeighted>{
	
	Vertice source;
    Vertice destination;
    double weight;

    EdgeWeighted(Vertice s, Vertice d, double w) {
        source = s;
        destination = d;
        weight = w;
    }
    
    public int compareTo(EdgeWeighted otherEdge) {
        if (this.weight > otherEdge.weight) {
            return 1;
        }
        else return -1;
    }
    
}