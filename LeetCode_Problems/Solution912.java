// LeetCode Problem 912: Sort an Array using Merge Sort

import java.util.Scanner;

public class Solution912 {
    
    // Function To Display the array
    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
    }

    // Function to sort the array using Merge Sort
    public static int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    // Function to merge one unsorted array
    public static void mergeSort(int[] nums,int first,int last){
        if(first<last){
            int mid=(first+last)/2;
            System.out.println(mid);
            mergeSort(nums, first, mid); // Left half sorting
            mergeSort(nums, mid+1, last); // Right half sorting
            merge(nums, first, mid, last); // Merging both halves
        }
    }
    
    // Function to merge two sorted halves
    public static void merge(int[] nums,int first,int mid,int last){
        int n1=mid-first+1;
        int n2=last-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=nums[first+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=nums[mid+1+j];
        }
        int i=0,j=0;
        int k=first;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                nums[k]=left[i];
                i++;
            }else{
                nums[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            nums[k]=right[j];
            j++;
            k++;
        }
        System.out.print("After Merging: ");
        printArray(nums);
    }

    // Main function
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter Elemnts: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(nums);
        mergeSort(nums,0, nums.length-1);
    }
}
