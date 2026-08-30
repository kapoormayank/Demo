// Detect a cycle in a directed graph using DFS Algorithm Implement in a Java

import java.util.ArrayList;

public class Detect_A_Cycle {

    // Graph Class
    @SuppressWarnings("unused")
    public static class Graph {

        // Data Members And Public Specifiers
        public int V; // Number of vertices in the graph
        public ArrayList<Integer>[] adj; // Adjacency list representation of the graph

        // Parameterized Constructor
        @SuppressWarnings("unchecked")
        public Graph(int V) {
            this.V = V;
            adj = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        // Add an edge to the graph
        public void addEdge(int u, int v) {
            adj[u].add(v);
            adj[v].add(u); // For undirected graph, add this line. For directed graph, comment this line.
        }

        // Function to detect a cycle in the graph using DFS
        public boolean isCyclicUtil(int v, boolean[] visited, boolean[] recStack) {
            if (recStack[v]) {
                return true; // Cycle detected
            }
            if (visited[v]) {
                return false; // Already visited
            }

            visited[v] = true;
            recStack[v] = true;

            for (int neighbor : adj[v]) {
                if (isCyclicUtil(neighbor, visited, recStack)) {
                    return true;
                }
            }

            recStack[v] = false; // Remove the vertex from recursion stack
            return false;
        }

        // Function to check if the graph contains a cycle
        public boolean isCyclic() {
            boolean[] visited = new boolean[V];
            boolean[] recStack = new boolean[V];

            for (int i = 0; i < V; i++) {
                if (isCyclicUtil(i, visited, recStack)) {
                    return true; // Cycle detected
                }
            }
            return false; // No cycle detected
        }

        // Print Graph
        void printAdjList() {
            for (int i = 0; i < V; i++) {
                System.out.print("Vertex " + i + ": ");
                for (int j : adj[i]) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }        
    }

    // Main function
    public static void main(String[] args) {
         
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4); 

        System.out.println("Graph representation (Adjacency List):");
        graph.printAdjList();

        if (graph.isCyclic()) {
            System.out.print( "\nGraph contains a cycle.");
        } else {
            System.err.println("\nGraph does not contain a cycle.");
        }
    }
}
