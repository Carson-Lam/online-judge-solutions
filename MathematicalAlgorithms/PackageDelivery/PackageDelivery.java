package MathematicalAlgorithms.PackageDelivery;
/******************************************************************************

Name: Carson lam

*******************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class PackageDelivery
{
	public static void main(String[] args) {
	    
	    //Declare variables for user input and setup Scanner
	    
	    Scanner sc = new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat("0.00");
	    
	    final int MAX_WEIGHT = 27;
	    final int MAX_SIZE = 100000;
	    //System.out.print("Enter package weight in kilograms: ");
	    int weight = sc.nextInt();
	    //System.out.print("Enter package length in kilograms: ");
	    int length = sc.nextInt();
	    //System.out.print("Enter package width in kilograms: ");
	    int width = sc.nextInt();
	    //System.out.print("Enter package height in kilograms: ");
	    int height = sc.nextInt();
	    
	    //Use if statements to check for each package case. 
	    //Place the && AND statement first so (too heavy and too large)
	    //can be confirmed as false before the code moves onto individual checks
	    
	    if ((weight > MAX_WEIGHT) && ((length * width * height) > MAX_SIZE)) {
	        System.out.println("Too heavy and too large.");
	    } else if (weight > MAX_WEIGHT) {
	        System.out.println("Too heavy.");
	    } else if ((length * width * height) > MAX_SIZE) {
	        System.out.println("Too large.");
	    } else {
	        System.out.println("Pass.");
	    }
	}
}