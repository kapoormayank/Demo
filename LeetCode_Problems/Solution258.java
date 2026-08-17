// LeetCode Problem 258: Add Digits

import java.util.Scanner;
public class Solution258 {

    static class Solution {
        public int addDigits(int num) {
            if(num == 0) { return 0; }

            return 1 + (num-1) % 9;
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(solution.addDigits(num)); // Output: 2

        sc.close();
    }
}
