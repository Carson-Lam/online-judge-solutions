package FinancialAlgorithms.CarPayment;
/******************************************************************************

Name: Carson lam


*******************************************************************************/
import java.util.*;

public class CarPayment
{
	public static void main(String[] args) {
	   
	    //Initialize Scanner class and variables
	    
	    Scanner sc = new Scanner(System.in);
	    double p = sc.nextDouble();
	    double r = sc.nextDouble();
	    double m = sc.nextDouble();
	    
	    System.out.printf("%.2f", (p * (r / 12))/(1 - Math.pow((1 + (r / 12)), -m)));

	}
}