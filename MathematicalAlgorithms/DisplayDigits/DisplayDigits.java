package MathematicalAlgorithms.DisplayDigits;
/******************************************************************************

Name: Carson lam

*******************************************************************************/
import java.util.Scanner;

public class DisplayDigits
{
	public static void main(String[] args) {
	    
	    //Declare variables for user input and setup Scanner
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int pow10 = 1000000000;
	    
	    //Use a while loop and divide the max variable pow10 until it reaches the 
	    //digits in the user input
		while(pow10 > num) {
		  pow10 /= 10;
		}
		
		//Use a while loop and divide the input number by the 
		//incrementing pow10 variable to get each digit
	    while (pow10 >= 1) {
	        int digits = num / pow10;
	        System.out.println(digits);
	        num = num % pow10;
	        pow10 /= 10;
	    }
	    
	}
}