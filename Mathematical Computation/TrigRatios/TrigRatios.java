/******************************************************************************

Name: Carson lam

*******************************************************************************/
import java.util.*;
import java.text.DecimalFormat;

public class TrigRatios
{
	public static void main(String[] args) {
	   
	    //Initialize Scanner class, DecimalFormat class, and double variables
	    
	    DecimalFormat df = new DecimalFormat("0.##");
	    Scanner sc = new Scanner(System.in);
	    double angle = sc.nextDouble();
	    
	    //Use the Math.toRadians method to convert the angle to radians 
	    //Use df.format to eliminate trailing zeroes.
	    
	    angle = Math.toRadians(angle);
	    System.out.println(df.format(Math.sin(angle)));
	    System.out.println(df.format(Math.cos(angle)));
	    System.out.println(df.format(Math.tan(angle)));
	}
}