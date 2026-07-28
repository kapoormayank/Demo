// Array Part 2 Algorithm Implementation In Java
import java.util.Scanner;
public class ArrayPart2{
    // Function to check if the game can be won
    public static boolean checkGame(int[] game,int leap) {
        return canWin(game, leap, 0);
    }
    // Recursive function to determine if the game can be won from the current position
    public static boolean canWin(int[] game,int leap, int i){
        // Base case: If the current index is beyond the last index, the game is won
        if(i >= game.length) return true;
        // Base case: If the current index is negative or the cell is blocked (1), the game cannot be won from this position
        if(i < 0 || game[i] == 1) return false;
        // Mark the current cell as visited to avoid cycles
        game[i]=1;
        // Recursive calls to check if the game can be won by jumping forward, moving forward, or moving backward
        return canWin(game, leap, i+leap) || canWin(game, leap, i+1) 
        || canWin(game, leap, i-1);
    }
    
    // Main function
    @SuppressWarnings("resource")
    public static void main(String[] args) {   
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q -- > 0) {
            int n=sc.nextInt();
            int leap=sc.nextInt();
            int[] game=new int[n];
            for(int i=0;i<n;i++) {
                game[i]=sc.nextInt();
            }
            System.out.println(checkGame(game, leap)?"YES":"NO");
        }
    }
}

