package javaFullTest;
/*Super Primes
Send Feedback
Punit is playing a game of prime numbers. Given a number N, he is assigned to form a list that contains all the primes less than or equal to N. Now, print all the elements from the list that occupy prime numbered positions.These prime indexed primes are known as super prime.
Like (2, 3, 5, 7, 11, 13, 17, 19, 23, ...) and 3 appears at second position, 2 is also prime. Similarly 5 appears at third position and 3 is a prime. And so on.
The first few super primes are: 3 5 11 17 and so on.
Input Format:
First and only line contains an integer N.
Output Format:
Print all the super primes less than or equal to N separated by a single space.
Constraints:
1 <= N <= 10^7
Sample Input 1:
7
Sample Output 1:
3 5
Sample Input 2:
17
Sample Output 2:
3 5 11 17 */
import java.util.*;

public class SuperPrimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        List<Integer> primes = generatePrimes(N);
        printSuperPrimes(primes);
    }
    
    public static List<Integer> generatePrimes(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        
        for (int p = 2; p * p <= N; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= N; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        
        return primes;
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void printSuperPrimes(List<Integer> primes) {
        for (int i = 0; i < primes.size(); i++) {
            int position = i + 1;
            if (isPrime(position)) {
                System.out.print(primes.get(i) + " ");
            }
        }
    }
}


