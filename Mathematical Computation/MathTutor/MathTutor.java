/******************************************************************************

Name: Carson lam

*******************************************************************************/
import java.util.*;

public class MathTutor
{
	public static void main(String[] args) {
	    
	    // Initialize scanner and random classes
	    // declare seed and check for user input, use long data type for larger size
        
	    Scanner sc = new Scanner(System.in);  	    
        long seed = sc.nextLong();
	    Random r = new Random(seed);
	    int a = (r.nextInt(100));
	    int b = (r.nextInt(100));
	    int result;
	    char operator = sc.next().charAt(0);
	    
	    //Use switch statements to check for each operator case
	    //Print results for corresponding equation
	    
	    switch (operator) {
	        case '+' :
	            result = a + b;
	            System.out.println(a + "+" + b + "=" + result);
	            break;
	        case '-':
	            result = a - b;
	            System.out.println(a + "-" + b + "=" + result);
	            break;
	        case '*':
	            result = a * b;
	            System.out.println(a + "*" + b + "=" + result);
	            break;
	        case '/':
	            result = a / b;
	            System.out.println(a + "/" + b + "=" + result);
	            break;
	    }
	}
}