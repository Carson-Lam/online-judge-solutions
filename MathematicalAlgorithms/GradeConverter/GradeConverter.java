package MathematicalAlgorithms.GradeConverter;
/******************************************************************************

Name: Carson lam

*******************************************************************************/
import java.util.Scanner;

public class GradeConverter
{
	public static void main(String[] args) {
	    
	    //Declare variables for user input and setup Scanner
	    
	    Scanner sc = new Scanner(System.in);
	    int grade = sc.nextInt();
	    
	    //Use if and else if statements to check for case intervals.
	    //Use >=, AND && operators, and <= to declare inclusive grade intervals
	    
	    if (grade >= 80 && grade <= 100) {
	        System.out.println("Level 4");
	    } else if (grade >= 70 && grade <= 79) {
	        System.out.println("Level 3");
	    } else if (grade >= 60 && grade <= 69) {
	        System.out.println("Level 2");
	    } else if (grade >= 50 && grade <= 59) {
	        System.out.println("Level 1");
	    } else if (grade < 50) {
	        System.out.println("Level R");
	    }
	}
}