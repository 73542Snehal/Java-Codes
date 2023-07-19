package first;

import java.util.Scanner;

public class FarenheittoC {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			   double fahrenheit, celsius; 
			   System.out.println("Enter temp");
			   fahrenheit = sc.nextDouble();  
			   celsius  = ((fahrenheit-32)*5)/9;   
	           System.out.println("Temperature in celsius is"+celsius);  

		}
	}


