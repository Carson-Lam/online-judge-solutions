package FinancialAlgorithms.InvestmentCalculator;
/******************************************************************************

Name: Carson lam


*******************************************************************************/

import java.util.*;
public class InvestmentCalculator
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //Setup variables, accumulators, and scanner class
	    
	    double initialValue = sc.nextDouble();
	    double desiredValue = sc.nextDouble();
	    double interestRate = sc.nextDouble();
	    int counter = 0;
	    
	    //Use while loop to increment initial value and accumulate counter
	    
	    while (initialValue < desiredValue) {
	        initialValue += (initialValue * (interestRate / 100));
	        counter += 1;
	    }
	    
	System.out.println(counter);
	    
	}
}