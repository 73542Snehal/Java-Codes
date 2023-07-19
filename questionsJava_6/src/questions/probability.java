package questions;
/*Probability
Send Feedback
An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. Calculate the probability that out of n drawn balls exactly x balls are red.
Find your answer multiplied by 100 and return the integer part.
All required values for computation will be in integer range.
x is always less than equal to 4 and x is always less than equal to n.
Input format :
Two spaced integers : n and x
Output format :
Integer part of (Probability * 100). 
Sample Input 1 :
3 1
Sample Output 1:
42*/
import java.util.Scanner;

public class probability {


	    public static int calculateProbability(int n, int x) {
	        int totalOutcomes = binomialCoefficient(8, n);
	        int favorableOutcomes = binomialCoefficient(4, x) * binomialCoefficient(4, n - x);
	        int probability = (favorableOutcomes * 100) / totalOutcomes;

	        return probability;
	    }

	    private static int binomialCoefficient(int n, int k) {
	        if (k == 0 || k == n) {
	            return 1;
	        }

	        int numerator = 1;
	        int denominator = 1;

	        for (int i = 1; i <= k; i++) {
	            numerator *= (n - i + 1);
	            denominator *= i;
	        }

	        return numerator / denominator;
	    }

	    public static void main(String[] args) {
	        int n = 5; // Number of balls drawn
	        int x = 3; // Number of red balls
	        int probability = calculateProbability(n, x);
	        System.out.println("Probability: " + probability + "%");
	    }
	}

