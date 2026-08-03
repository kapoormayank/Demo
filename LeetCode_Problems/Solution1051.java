// Leetcode Problem 1051: Height Checker

import java.util.Scanner;

public class Solution1051 {
    // Function to perform Counting Sort
    public static int heightChecker(int[] heights) {
        int max=heights[0];
        int l=heights.length;
        for(int num:heights){
            if(num > max){
                max=num;
            }
        }
        int[] count=new int[max+1];
        for(int num:heights){
            count[num]++;
        }
        int k=0;
        int[] nums=new int[l];
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                nums[k++]=i;
                count[i]--;
            }
        }
        int total=0;
        for(int i=0;i<l;i++){
            if(heights[i] != nums[i]){
                total++;
            }
        }
        return total;
    }

    // Function to print the array
    public static void printArray(int[] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println("\n");
    }

    // Main function
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter Elemnts: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(nums);
        int result=heightChecker(nums);
        System.out.println("Number of students not in correct position: " +result);
    }
}
