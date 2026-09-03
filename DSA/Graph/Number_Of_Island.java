// Count the number of islands in a 2D grid using BFS Algorithm Implement in a Java

import java.util.ArrayList;

public class Number_Of_Island {

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

        // Island Count Function
        public int countIslands(int[][] grid) {
            int count = 0;
            boolean[][] visited = new boolean[grid.length][grid[0].length];

            for(int i=0; i<grid.length; i++) {
                for(int j=0; j<grid[0].length; j++) {
                    if(grid[i][j] == 1 && !visited[i][j]) {
                        bfs(grid, visited, i, j);
                        count++;
                    }
                }
            }

            return count;
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
    }
}
