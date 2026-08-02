// Permutation Algorithm Implementation in Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    // Function to generate Permutation
    public static void generatePermutation(int[] set,List<List<Integer>> result,List<Integer> temp) {
        // Add the current subset to the result list
        if(temp.size()==set.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < set.length; i++) {
            // Skip if the element is already included in the current permutation
            if(temp.contains(set[i])) continue;
            // Include the current element in the permutation(make a choice)
            temp.add(set[i]);
            // Recursively generate permutations including the current element
            generatePermutation(set, result, temp);
            // Backtrack to explore other permutations(undo the last choice)
            temp.remove(temp.size() - 1);
        }
    }

    // Main function
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the number of elements in the permutation: ");
            int n = Integer.parseInt(br.readLine());
            int[] set = new int[n];
            System.out.println("Enter the elements of the set: ");
            for (int i = 0; i < n; i++) {
                set[i] = Integer.parseInt(br.readLine());
            }
            System.out.println("Permutations:");
            List<List<Integer>> result = new ArrayList<>();
            generatePermutation(set, result,new ArrayList<>());
            for(List<Integer> num:result) {
                System.out.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

