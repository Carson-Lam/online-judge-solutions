package MathematicalAlgorithms.MakeChange;
/******************************************************************************

* Author: Carson Lam

*******************************************************************************/
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math.*;

public class MakeChange {  
    public static void main(String args[]) { 
        final int quarterValue = 25;
        final int dimeValue = 10;
        final int nickelValue = 5;
        final int pennyValue = 1;
        Scanner Scan = new Scanner(System.in);
        
        int moneyAmount = Scan.nextInt();
        int quarterAmount = (moneyAmount/quarterValue);
        moneyAmount %= quarterValue;
        int dimeAmount = (moneyAmount/dimeValue);
        moneyAmount %= dimeValue;
        int nickelAmount = (moneyAmount/nickelValue);
        moneyAmount %= nickelValue;
        int pennyAmount = moneyAmount;
        
        System.out.println("Quarters: " + quarterAmount);
        System.out.println("Dimes: " + dimeAmount);      
        System.out.println("Nickels: " + nickelAmount);
        System.out.println("Pennies: " + pennyAmount);
        
    }
    
}