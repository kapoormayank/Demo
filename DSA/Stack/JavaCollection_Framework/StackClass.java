// Stack Implementation In Java By Using Java Collection Framework

import java.util.*;
public class StackClass{
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){

        // Stack Interface works with the stack class
        Stack<Integer> stack = new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter element: ");

        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            // Push Operation
            stack.push(value);
        }

        // Display Operation
        System.out.println("Display the stack data: "+stack);

        // Check Stack Is An Empty Or Not
        if (!stack.isEmpty()) {
            System.out.println("Top stack element: " + stack.peek());
            System.out.println("Popped stack element: " + stack.pop());
            if (!stack.isEmpty()) {
                System.out.println("New top stack element: " + stack.peek());
            }
        } else {
            System.out.println("Stack is empty, cannot perform peek/pop");
        }

        // Display Operation
        System.out.println("Display the stack data: "+stack);

        // Searching Operation
        System.out.print("Enter value for searching: ");
        int values=sc.nextInt();
        int pos=stack.search(values);
        if(pos != -1) {
            System.out.println("Element found at position from top: " + pos);
        }else {
            System.out.println("Element not found in stack");
        }
        
        sc.close();
    }
}
