/******************************************************************************
Author: Carson lam 
*******************************************************************************/
import java.util.*;
public class Monogram
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		//Setup string variables for user input and each individual lower/upper case version of each String
		//also get first character of each string
		
		String firstName = sc.nextLine();
		String lowerFirst = firstName.toLowerCase();
		String upperFirst = firstName.toUpperCase();
	    char firstCharFirst = firstName.charAt(0);

		String middleName = sc.nextLine();
		String lowerMid = middleName.toLowerCase();
		String upperMid = middleName.toUpperCase();
	    char firstCharMid = middleName.charAt(0);
		
		String lastName = sc.nextLine();
		String lowerLast = lastName.toLowerCase();
		String upperLast = lastName.toUpperCase();
	    char firstCharLast = lastName.charAt(0);
	    
	    
	    //print out first character in lowercase/uppercase version 
	    //according to first character in input
		
		if (Character.isUpperCase(firstCharFirst)) {
		    System.out.print(lowerFirst.charAt(0));		    
		} else if (Character.isLowerCase(firstCharFirst)) {
		    System.out.print(upperFirst.charAt(0));
		}
		
		if (Character.isUpperCase(firstCharMid)) {
		    System.out.print(lowerMid.charAt(0));		    
		} else if (Character.isLowerCase(firstCharMid)) {
		    System.out.print(upperMid.charAt(0));
		}
				
		if (Character.isUpperCase(firstCharLast)) {
		    System.out.print(lowerLast.charAt(0));		    
		} else if (Character.isLowerCase(firstCharLast)) {
		    System.out.print(upperLast.charAt(0));
		}
	}
}