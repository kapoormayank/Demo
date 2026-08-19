// Graph User Input Algorithm Implementation In Java

import java.util.Scanner;

public class UserInput {
    // Graph Class
    public static class Graph {
        int V; // Number of vertices
        int[][] adj; // Adjacency matrix
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of vertices: ");
            int vertices = sc.nextInt();
        }
    }
}
