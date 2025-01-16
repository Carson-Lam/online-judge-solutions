/******************************************************************************

Name: Carson lam

*******************************************************************************/
import java.util.*;
public class IsPrime
{
    public static void main(String[] args) {

	//Initialize scanner class and variables/accumulators

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = true;

    //Use a for loop based on 2 to check for prime,
    //Change boolean variable when prime is confirmed to be false
    
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
    
    //Print yes and no based on boolean variable
        
        if (prime == false) {
            System.out.println("NO");
        } else if (prime == true) {
            System.out.println("YES");
        }
    }
}