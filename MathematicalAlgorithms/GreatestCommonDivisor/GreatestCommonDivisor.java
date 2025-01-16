package MathematicalAlgorithms.GreatestCommonDivisor;
/******************************************************************************
Name: Carson lam
*******************************************************************************/
import java.util.*;
public class GreatestCommonDivisor
{
    public static void main(String[] args) {

	    //Initialize scanner class and variables for user input

        Scanner sc = new Scanner(System.in);
        int numInput1 = sc.nextInt();
        int numInput2 = sc.nextInt();
        int fact = 1;
        int fact2 = 1;
        int remainder = 0;
        
        
        while (numInput2 > 0) {
            remainder = numInput1 % numInput2;
            
            if (remainder == 0) {
                break;
            }
            
            numInput1 = numInput2;
            numInput2 = remainder;
        }
        System.out.println(numInput2);
    }
}