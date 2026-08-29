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
        }

        // Function to detect a cycle in the graph using DFS
        // Print Graph
        
    }

    // Main function
    public static void main(String[] args) {

    }
}
