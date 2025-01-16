package MathematicalAlgorithms.CarRecall;
/******************************************************************************

Name: Carson lam

*******************************************************************************/
import java.util.Scanner;

public class CarRecall
{
	public static void main(String[] args) {
	    
	    //Declare variables for user input and setup Scanner
	    
	    Scanner sc = new Scanner(System.in);
	    
	    //Use a single if statement and the || OR operator to check for all instances of 
	    //recallable cars. For the interval, use >= and <= for inclusivity.
	    
	    int model = sc.nextInt();
	    if (model == 119 || model == 179 || (model >= 189 && model <= 198) || model == 221 || model == 780) {
	        System.out.println("NOT Safe.");
	    } else {
	        System.out.println("Safe.");
	    }
	}
}