package Dijktra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import Graphs.GrafoListaAdyacencia;

public class GraphWeighted {
	private Set<Vertice> nodes;
	GrafoListaAdyacencia g;
	private boolean directed;

	public GraphWeighted(boolean directed) {
		this.directed = directed;
		nodes = new HashSet<>();
	}

	public void addNode(Vertice n) {
		nodes.addAll(Arrays.asList(n));
	}

	public void addEdge(Vertice source, Vertice destination, double weight) {
		nodes.add(source);
		nodes.add(destination);

		addEdgeHelper(source, destination, weight);

		if (!directed && source != destination) {
			addEdgeHelper(destination, source, weight);
		}
	}

	private void addEdgeHelper(Vertice a, Vertice b, double weight) {
		for (EdgeWeighted edge : a.edges) {
			if (edge.source == a && edge.destination == b) {
				edge.weight = weight;
				return;
			}
		}
		a.edges.add(new EdgeWeighted(a, b, weight));
	}

	public void printEdges() {
		for (Vertice node : nodes) {
			LinkedList<EdgeWeighted> edges = node.edges;

			if (edges.isEmpty()) {
				System.out.println("Node " + node.name + " has no edges.");
				continue;
			}
			System.out.print("Node " + node.name + " has edges to: ");

			for (EdgeWeighted edge : edges) {
				System.out.print(edge.destination.name + "(" + edge.weight + ") ");
			}
			System.out.println();
		}
	}

	public boolean hasEdge(Vertice source, Vertice destination) {
		LinkedList<EdgeWeighted> edges = source.edges;
		for (EdgeWeighted edge : edges) {
			if (edge.destination == destination) {
				return true;
			}
		}
		return false;
	}

	public void resetNodesVisited() {
		for (Vertice node : nodes) {
			node.unvisit();
		}
	}

	//DIJKTRA
	public void DijkstraShortestPath(Vertice start, Vertice end) {
		HashMap<Vertice, Vertice> changedAt = new HashMap<>();
		changedAt.put(start, null);
		HashMap<Vertice, Double> shortestPathMap = new HashMap<>();

		//este for se cambia por el returnVertice
		for (Vertice node : nodes) {
			if (node == start)//AQUI SE VALIDA QUE EXISTA EL VERTICE
				shortestPathMap.put(start, 0.0);
			else shortestPathMap.put(node, Double.POSITIVE_INFINITY);
		}

		for (EdgeWeighted edge : start.edges) {//AQUI SE BUSCA CUALES SON LAS CONEXIONES DEL NODO SELECCIONADO
			//System.out.println("put: "+edge.destination.name+" - "+edge.weight);
			shortestPathMap.put(edge.destination, edge.weight);//SE AÑADE EL DESTINO Y EL PESO DEL VERTICE
			//System.out.println("put2: "+edge.destination.name+" - "+start.name);
			changedAt.put(edge.destination, start);//SE AÑADE A LA LISTA
		}

		start.visit();
		while (true) {
			Vertice currentNode = closestReachableUnvisited(shortestPathMap);
			if (currentNode == null) {
				System.out.println("There isn't a path between " + start.name + " and " + end.name);
				return;
			}
			if (currentNode == end) {
				System.out.println("The path with the smallest weight between "+ start.name + " and " + end.name + " is:");
				Vertice child = end;
				String path = end.name;
				while (true) {
					Vertice parent = changedAt.get(child);
					if (parent == null) {
						break;
					}
					path = parent.name + " " + path;
					child = parent;
				}
				System.out.println("Path: "+path);
				System.out.println("The path costs: " + shortestPathMap.get(end));
				return;
			}
			currentNode.visit();
			for (EdgeWeighted edge : currentNode.edges) {
				if (edge.destination.isVisited())
					//System.out.println("Ya pasado"+edge.destination.name);
					continue;
				if (shortestPathMap.get(currentNode)+ edge.weight< shortestPathMap.get(edge.destination)) {
					shortestPathMap.put(edge.destination,shortestPathMap.get(currentNode) + edge.weight);
					System.out.println("No se: "+edge.destination.name+" - "+shortestPathMap.get(currentNode)+" - "+edge.weight);
					changedAt.put(edge.destination, currentNode);
				}
			}
		}
	}

	private Vertice closestReachableUnvisited(HashMap<Vertice, Double> shortestPathMap) {
		double shortestDistance = Double.POSITIVE_INFINITY;
		Vertice closestReachableNode = null;
		for (Vertice node : nodes) {
			if (node.isVisited())
				continue;

			double currentDistance = shortestPathMap.get(node);
			if (currentDistance == Double.POSITIVE_INFINITY)
				continue;

			if (currentDistance < shortestDistance) {
				shortestDistance = currentDistance;
				closestReachableNode = node;
			}
		}
		return closestReachableNode;
	}
	/*public void DijkstraShortestPath(Vertice start, Vertice end) {
		HashMap<Vertice, Vertice> changedAt = new HashMap<>();
		changedAt.put(start, null);

		HashMap<Vertice, Double> shortestPathMap = new HashMap<>();

		for (Vertice node : nodes) {
			if (node == start)
				shortestPathMap.put(start, 0.0);
			else shortestPathMap.put(node, Double.POSITIVE_INFINITY);
		}

		for (EdgeWeighted edge : start.edges) {
			shortestPathMap.put(edge.destination, edge.weight);
			changedAt.put(edge.destination, start);
		}

		start.visit();

		while (true) {
			Vertice currentNode = closestReachableUnvisited(shortestPathMap);
			if (currentNode == null) {
				System.out.println("There isn't a path between " + start.name + " and " + end.name);
				return;
			}

			if (currentNode == end) {
				System.out.println("The path with the smallest weight between "+ start.name + " and " + end.name + " is:");

				Vertice child = end;

				String path = end.name;
				while (true) {
					Vertice parent = changedAt.get(child);
					if (parent == null) {
						break;
					}

					path = parent.name + " " + path;
					child = parent;
				}
				System.out.println(path);
				System.out.println("The path costs: " + shortestPathMap.get(end));
				return;
			}
			currentNode.visit();

			for (EdgeWeighted edge : currentNode.edges) {
				if (edge.destination.isVisited())
					continue;
				if (shortestPathMap.get(currentNode)
						+ edge.weight
						< shortestPathMap.get(edge.destination)) {
					shortestPathMap.put(edge.destination,
							shortestPathMap.get(currentNode) + edge.weight);
					changedAt.put(edge.destination, currentNode);
				}
			}
		}
	}

	private Vertice closestReachableUnvisited(HashMap<Vertice, Double> shortestPathMap) {

		double shortestDistance = Double.POSITIVE_INFINITY;
		Vertice closestReachableNode = null;
		for (Vertice node : nodes) {
			if (node.isVisited())
				continue;

			double currentDistance = shortestPathMap.get(node);
			if (currentDistance == Double.POSITIVE_INFINITY)
				continue;

			if (currentDistance < shortestDistance) {
				shortestDistance = currentDistance;
				closestReachableNode = node;
			}
		}
		return closestReachableNode;
	}*/
}
