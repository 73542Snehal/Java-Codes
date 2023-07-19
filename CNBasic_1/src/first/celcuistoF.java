package first;

import java.util.Scanner;

public class celcuistoF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   double fahrenheit, celsius; 
		   System.out.println("Enter temp");
           celsius = sc.nextDouble();  
           fahrenheit =( (celsius*9)/5)+32;  
           System.out.println("Temperature in fahrenheit is"+fahrenheit);  

	}

}
