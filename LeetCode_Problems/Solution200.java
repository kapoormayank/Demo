// LeetCode Problem 200: Number of Islands
public class Solution200 {
    // Graph Class
    public static class Graph {

        // Island Count Function
        public int countIslands(int[][] grid) {

            int count = 0;
            boolean[][] visited = new boolean[grid.length][grid[0].length];

            for(int i=0; i<grid.length; i++) {
                for(int j=0; j<grid[0].length; j++) {
                    if(grid[i][j] == 1 && !visited[i][j]) {
                        dfs(grid, visited, i, j);
                        count++;
                    }
                }
            }

            return count;
        }

        // Depth-First Search
        private void dfs(int[][] grid, boolean[][] visited, int i, int j) {
            if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
                return;
            }

            visited[i][j] = true;

            // Recursively visit all adjacent cells
            dfs(grid, visited, i+1, j);
            dfs(grid, visited, i-1, j);
            dfs(grid, visited, i, j+1);
            dfs(grid, visited, i, j-1);
        }
    }

    // Main function
    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1}
        };

        Graph graph = new Graph();
        
        int numberOfIslands = graph.countIslands(grid);
        System.out.println("Number of islands: " + numberOfIslands);
    }       
}
