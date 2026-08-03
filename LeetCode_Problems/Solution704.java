// Leetcode Problem Number 704

import java.util.Scanner;

public class Solution704 {
    
     // Function To Print An Array
     public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
    }

    // Function To Find The Target Element Index
    public static int search(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    
    // Main function
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter Elements In An Array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Original Array Print: ");
        printArray(nums);
        System.out.print("Enter Target Element: ");
        int target=sc.nextInt();
        int result=search(nums,target);
        if(result!=-1){
            System.out.println("Target Element Index Is : "+result);
        }
        else{
            System.out.println("Target Element Not Exist In The Array");
        }
    }
}
