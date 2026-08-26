// Breadth First Search (BFS) Traversal Algorithm Implement in a Java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Traversal {
    
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

        // BFS Traversal of the graph
        @SuppressWarnings("SizeReplaceableByIsEmpty")
        void bfs() { // O(V+E)

            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[V];

            queue.add(0); // Start BFS from vertex 0
            visited[0] = true;

            while(queue.size() > 0) {
                int u = queue.poll();

                System.out.print(u+" ");
                for(int neighbor : adj[u]) {
                    if(!visited[neighbor]) {
                        queue.add(neighbor);
                        visited[neighbor] = true;
                    }
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
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        System.out.println("Graph representation (Adjacency List):");
        graph.printAdjList();

        System.out.print("\nBFS Traversal of the graph: ");
        graph.bfs();
    }
}
