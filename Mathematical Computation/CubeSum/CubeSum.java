/******************************************************************************

Name: Carson lam

*******************************************************************************/
import java.util.*;
public class CubeSum
{
    public static void main(String[] args) {

	//Initialize scanner class and variables/accumulators

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int cubeOutput = 0;

	//Seperate each digit to be added and accumulate its cube onto the 
	//cubeOutput variable for printing

        while (num > 0) {
            int digit = num % 10;
            cubeOutput = cubeOutput + (digit * digit * digit);
            num = num / 10;
        }
        
        System.out.println(cubeOutput);
    }
}