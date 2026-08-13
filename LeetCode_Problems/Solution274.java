// Leetcode Problem 274: H-Index

import java.util.Scanner;

public class Solution274{

    // Function to print array
    public static void printArray(int[] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println("\n");
    }

    // Function to find H-Index
    public static int hIndex(int[] citations) {
        int max=citations[0];
        for(int num:citations){
            if(num > max){
                max=num;
            }
        }
        int[] count=new int[max+1];
        for(int num:citations){
            count[num]++;
        }
        int k=0;
        for(int i=max;i>0;i--){
            k=k+count[i];
            if(k>=i){
                return i;
            }
        }
        return 0;
    }

    // Main function
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
        int result=hIndex(nums);
        System.out.println("H-Index: " +result);
    }
}

