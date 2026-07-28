// Big Integer Implementation In Java

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDemo {
    
    // Main function
    public static void main(String[] args){
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            BigInteger n=sc.nextBigInteger();
            System.out.print("Enter second number: ");
            BigInteger n1=sc.nextBigInteger();
            System.out.println("Sum of two big integer is: "+n.add(n1));
            System.out.println("Multiply two big integer numbers: "+n.multiply(n1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
