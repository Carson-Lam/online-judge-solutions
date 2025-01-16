package MathematicalAlgorithms.PrintingPrices;
/******************************************************************************

Name: Carson lam

*******************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class PrintingPrices
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat("0.00");
	    int copies = sc.nextInt();
	    
	    //Use if and else if statements to check for each interval in copy price.
	    //The DecimalFormat class is used to round the total cost to two dp 
	    //The && operator is used to ensure that the input lies within specific ranges
	    
	    if (copies >= 0 && copies <= 99) {
	        System.out.println("0.30");
	        System.out.println(df.format(copies * 0.3));
	    } else if (copies >= 100 && copies <= 499) {
	        System.out.println("0.28");
	        System.out.println(df.format(copies * 0.28));
	    } else if (copies >= 500 && copies <= 749) {
	        System.out.println("0.27");
	        System.out.println(df.format(copies * 0.27));
	    } else if (copies >= 750 && copies <= 1000) {
	        System.out.println("0.26");
	        System.out.println(df.format(copies * 0.26));
	    } else if (copies > 1000) {
	        System.out.println("0.25");
	        System.out.println(df.format(copies * 0.25));
	    }
    }
}