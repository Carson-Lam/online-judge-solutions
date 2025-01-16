package MathematicalAlgorithms.PizzaCost;
/******************************************************************************
 
* Author: Carson Lam

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math.*;

public class PizzaCost
{
	public static void main(String[] args) {
	    Scanner Scan = new Scanner(System.in);
	    final double labour = 0.75;
	    final double rent = 1.00;
	   
	    double diameter = Scan.nextInt();
	    double materials = 0.05 * Math.pow(diameter, 2);
	    double finalCost = Math.round((labour + rent + materials) * 100)/(double)100;
	    System.out.println("$" + finalCost);

	}
}