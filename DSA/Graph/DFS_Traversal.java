// Depth First Search (DFS) Traversal Algorithm Implement in a Java

import java.util.ArrayList;

public class DFS_Traversal {
    
    // Graph Class
    @SuppressWarnings("unused")
    public static class Graph {

        // Data Members And Public Specifiers
        public int V;
        public ArrayList<Integer>[] adj;

        // Parameterized Constructor
        @SuppressWarnings("unchecked")
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
            adj[v].add(u); // For undirected graph
        }

        // DFS Traversal of the graph
        void DFS(int start, boolean[] visited) {
            System.out.print(start + " ");
            visited[start] = true;

            for(int neighbor : adj[start]) {
                if(!visited[neighbor]) {
                    DFS(neighbor, visited);
                }
            }
        }

        // Print the adjacency list representation of the graph
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

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4); 

        System.out.println("Graph representation (Adjacency List):");
        graph.printAdjList();

        System.out.print("\nDFS Traversal of the graph: ");
        boolean[] visited = new boolean[graph.V];
        graph.DFS(0, visited);
    }
}
