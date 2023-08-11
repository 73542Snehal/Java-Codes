package javaFullTest;
/*Game
Send Feedback
There are n people standing in a circle (numbered clockwise 1 to n) waiting to be executed. The counting begins at point 1 in the circle and proceeds around the circle in a fixed direction (clockwise). In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom.
Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle.
Find the position of last person to survive.
Sample input 1:
4 2
Sample output 1:
1
(Skip 1 , kill 2 , Skip 3 , Kill 4)
(Skip 1 , Kill 4, So 1 survives)
Sample input 2:
50 10
Sample output 2:
36*/
import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int k = s.nextInt();
        
        int survivorPosition = findSurvivor(n, k);
        System.out.println(survivorPosition);
    }

    public static int findSurvivor(int n, int k) {
        LinkedList<Integer> circle = new LinkedList<>();
        
        // Initialize the circle with people numbered 1 to n
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }
        
        int index = 0;
        while (circle.size() > 1) {
            // Find the next person to be eliminated
            index = (index + k - 1) % circle.size();
            
            // Remove the person from the circle
            circle.remove(index);
        }
        
        // Return the position of the last surviving person
        return circle.get(0);
    }
}
