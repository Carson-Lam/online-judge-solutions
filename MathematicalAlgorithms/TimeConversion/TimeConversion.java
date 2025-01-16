package MathematicalAlgorithms.TimeConversion;
/******************************************************************************

* Author: Carson Lam

*******************************************************************************/
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        final int hourValue = 60;
        
        Scanner Scan = new Scanner(System.in);
        int timeGiven = Scan.nextInt();
        int hours = (timeGiven - (timeGiven % hourValue))/hourValue;
        int minutes = (timeGiven - (hours * hourValue));
        
        System.out.printf("%d:%02d", hours, minutes);
    }
}