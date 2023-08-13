package skillTestJava;
/*Power
Ninja is given an easy task. He has to implement a function which calculates a^b. But there is a small difference, b is an extremely large positive number given in the form of an array.
Note: Since answers can be huge, print answer mod 1337.
It is given that b will not contain leading zeros.
Input Format:
 First line of input contains an integer a
 Second line of input contains an integer n, representing the size of the array.
 Third line of input contains an array (space separated).
Constraints:
1 <= a <= 2^31 - 1
1 <= b.length <= 3 * 10^6
0 <= b[i] <= 9
Time Limit: 1 second
Output Format:
Single line of output printing a^b
Sample Input 1:
5
2
1 5
Sample Output:
944
Explanation:
5 to the power 15 is 30517578125. Its mod with 1337 is 944.*/
import java.util.*;

public class Power {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int a = scanner.nextInt();
	        int n = scanner.nextInt();
	        int[] b = new int[n];
	        for (int i = 0; i < n; i++) {
	            b[i] = scanner.nextInt();
	        }
	        scanner.close();

	        int result = superPow(a, b);
	        System.out.println(result);
	    }

	    public static int superPow(int a, int[] b) {
	        int MOD = 1337;
	        int base = a % MOD;

	        int phiMOD = phi(MOD); 
	        int exp = computeExponent(b, phiMOD);

	        return fastPow(base, exp, MOD);
	    }

	    public static int fastPow(int base, int exponent, int MOD) {
	        if (exponent == 0) {
	            return 1;
	        }
	        if (exponent == 1) {
	            return base % MOD;
	        }
	        int halfPow = fastPow(base, exponent / 2, MOD);
	        int result = (halfPow * halfPow) % MOD;
	        if (exponent % 2 == 1) {
	            result = (result * base) % MOD;
	        }
	        return result;
	    }

	    public static int computeExponent(int[] b, int phiMOD) {
	        int exponent = 0;
	        for (int digit : b) {
	            exponent = (exponent * 10 + digit) % phiMOD;
	        }
	        return exponent;
	    }

	    public static int phi(int n) {
	        int result = n;
	        for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) {
	                while (n % i == 0) {
	                    n /= i;
	                }
	                result -= result / i;
	            }
	        }
	        if (n > 1) {
	            result -= result / n;
	        }
	        return result;
	    }
}
