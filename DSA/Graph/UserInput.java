// Graph Algorithms Implementation In Java

import java.util.ArrayList;

public class UserInput {

    // Graph class to represent a graph using adjacency list
    public static class Graph {
        int V;
        ArrayList<Integer>[] adj;
        
        // Parameterized Constructor
        @SuppressWarnings("unchecked")
        public Graph(int V) {
            this.V = V;
            adj = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        // Method to add an edge to the graph
        void addEdge(int u, int v) {
            adj[u].add(v);
            adj[v].add(u); // For undirected graph
        }

        // Method to print the adjacency list representation of the graph
        void printAdjList() {
            for(int i=0; i<V; i++) {
                System.out.print("Vertex: "+i+": ");

                for(int neighbor : adj[i]) {
                    System.out.print(neighbor+" ");
                }
                System.out.println();
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        System.out.println("Graph representation (Adjacency List):");
        graph.printAdjList();
    }
}


