// Combination Sum III Algorithm Implementation in Java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Combination_Sum3 {
    // Function to find all possible combinations of k numbers that add up to n
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }
    
    // Backtracking function to explore all combinations
    public void backtrack(List<List<Integer>> result, List<Integer> tempList, int k, int n, int start) {
        if (tempList.size() == k && n == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i <= 9; i++) {
            tempList.add(i);
            backtrack(result, tempList, k, n - i, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    // Main function to test the algorithm
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k,n ;
        System.out.print("Enter the number of elements (k): ");
        k = scanner.nextInt();
        System.out.print("Enter the target sum (n): ");
        n = scanner.nextInt();
        Combination_Sum3 cs3 = new Combination_Sum3();
        List<List<Integer>> combinations = cs3.combinationSum3(k, n);
        System.out.println("Combinations of " + k + " numbers that sum up to " + n + ": " + combinations);
    }
}


