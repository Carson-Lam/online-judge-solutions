/******************************************************************************
*
* Author: Carson Lam
*
********************************************************************************/
import java.util.Scanner;

public class DigitMod
{
  public static void main (String[] args)
  {
    int firstDigit = 0;
    int secondDigit = 0;
    int thirdDigit = 0;
    Scanner Scan = new Scanner (System.in);
    int refNumber = Scan.nextInt();
    
    thirdDigit = (refNumber % 100) % 10;
    secondDigit = ((refNumber % 100) - thirdDigit)/10;
    firstDigit = (refNumber - (refNumber % 100))/100;
    
    System.out.println(firstDigit);
    System.out.println(secondDigit);
    System.out.println(thirdDigit);

    
  }
}