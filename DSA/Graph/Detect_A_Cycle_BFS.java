// Detect a cycle in a directed graph using BFS Algorithm Implement in a Java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Detect_A_Cycle_BFS {

    // Graph Class
    public static class Graph {
        
        // Data Members And Public Access Specifier
        public int V; // Number of vertices in the graph
        public ArrayList<Integer>[] adj; // Adjacency list representation of the graph

        @SuppressWarnings("unchecked")
        // Parameterized Constructor
        public Graph(int V) {
            this.V = V;
            adj = new ArrayList[V];

            for(int i=0; i<V; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        // Add an edge to the graph
        void addEdge(int u,int v) {
            adj[u].add(v);
            adj[v].add(u);
        }

        @SuppressWarnings("SizeReplaceableByIsEmpty")
        // Function to detect a cycle in the graph using BFS
        boolean bfsCyclicUtil() {
            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[V];

            visited[0] = true;
            queue.add(0);

            while(queue.size() > 0) {
                int u = queue.poll();

                for(int neigbor : adj[u]) {
                    
                    if(!visited[neigbor]) {
                        visited[neigbor] = true;
                        queue.add(neigbor);
                    } 
                    
                    else {
                        return true; // Cycle detected
                    }
                }
            }
            return false;
        }

        // Print Adjanency Graph
        public void printGraph() {
            for(int i=0; i<V; i++) {
                System.out.print("Vertex: "+i+": ");
                for(int neighbor : adj[i]) {
                    System.out.print(neighbor+" ");
                }
                System.err.print("\n");
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

        graph.addEdge(0,1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Graph representation (Adjacency List):");
        graph.printGraph();

        if(graph.bfsCyclicUtil()) {
            System.out.println("\nCycle detected in the graph.");
        } else {
            System.out.println("\nNo cycle detected in the graph.");
        }
    }
}
