package MathematicalAlgorithms.ObjectHeight;
/******************************************************************************

Author: Carson Lam

*******************************************************************************/
import java.util.Scanner;

public class ObjectHeight
{
	public static void main(String[] args) {
	    
	    double h = 0;
	    Scanner Scan = new Scanner (System.in);
	    double t = Scan.nextDouble();
	    
	    h = (double) 100 - (4.9 * Math.pow(t, 2));
	    
	    System.out.printf("%.1f", h);
	}
}