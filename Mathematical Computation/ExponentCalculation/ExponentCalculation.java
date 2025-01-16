/******************************************************************************

Name: Carson lam


*******************************************************************************/
import java.util.*;

public class ExponentCalculation
{
	public static void main(String[] args) {
	   
	    //Initialize Scanner class and variables
	    
	    Scanner sc = new Scanner(System.in);
	    double x = sc.nextDouble();
	    double y = sc.nextDouble();
	    
	    // Use Math.exp and Math.log (provided functions) to calculate exponent
	    
	    System.out.println(Math.exp(y * Math.log(x)));
	    System.out.println(Math.pow(x, y));
	}
}