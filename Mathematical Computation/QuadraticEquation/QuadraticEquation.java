/******************************************************************************

Name: Carson lam

*******************************************************************************/
import java.util.*;

public class QuadraticEquation
{
	public static void main(String[] args) {
	   
	    //Initialize Scanner class and variables
	    //Use the discriminant formula to calculate discriminant
	    //Use the discriminant variable to calculate roots
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    double discriminant = (Math.pow(b, 2)) - (4 * a * c);
	    double rootOne = (-b + Math.sqrt(discriminant))/(2 * a);
	    double rootTwo = (-b - Math.sqrt(discriminant))/(2 * a);
	    
	    //Use else if statements to check for all cases 
	    //Round roots to two decimal places by multiplying/dividing by 100
	    //Convert roots from double to string
	    //Use regex formatting to cut off trailing zeroes.
	    
	    if (discriminant < 0) {
	        System.out.println("No real roots.");
	    } else if (discriminant == 0) {
	        System.out.println("One real root.");
	    } else if (discriminant > 0) {
	        rootOne = Math.round(rootOne * 100);
	        rootOne /= 100; 
	        rootTwo = Math.round(rootTwo * 100);
	        rootTwo /= 100; 
	        String rootString1 = rootOne + "";
	        String rootString2 = rootTwo + "";
	        System.out.println(rootString1.replaceAll("0+$", ""));
	        System.out.println(rootString2.replaceAll("0+$", ""));
	    }
	    
	}
}