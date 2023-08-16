package skillTestJava;
/*Same Product
Given an array of distinct positive integers, return the number of tuples (a, b, c, d) such that a * b = c * d where a, b, c, and d are elements of the array, and a != b != c != d.
Input Format:
First line of input contains an integer N, representing the number of elements in array
Second line of input contains N space separated integers
Output Format:
Print the required count
Sample Input 1:
4
2 3 4 6
Sample Output 1:
8
Explanation:
There are 8 valid tuples:
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)*/

import java.util.*;

public class SameProduct {

	   public int tupleSameProduct(int[] nums) {
	        int ans = 0;
	        Map<Integer, Integer> map = new HashMap<>();
	        
	        for (int i = 0; i < nums.length - 1; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                ans += 8 * map.getOrDefault(nums[i] * nums[j], 0);
	                map.put(nums[i] * nums[j], map.getOrDefault(nums[i] * nums[j], 0) + 1);
	            }
	        }
	        
	        return ans;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int[] nums = new int[N];
	        
	        for (int i = 0; i < N; i++) {
	            nums[i] = scanner.nextInt();
	        }
	        
	        SameProduct solution = new SameProduct();
	        int result = solution.tupleSameProduct(nums);
	        System.out.println(result);
	    }
	}

/*import java.util.*;

class Solution {
    public int tupleSameProduct(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                ans += 8 * map.getOrDefault(nums[i] * nums[j], 0);
                map.put(nums[i] * nums[j], map.getOrDefault(nums[i] * nums[j], 0) + 1);
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        
        Solution solution = new Solution();
        int result = solution.tupleSameProduct(nums);
        System.out.println(result);
    }
}*/