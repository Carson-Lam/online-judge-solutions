package MathematicalAlgorithms.ICSEnergy;
/******************************************************************************

* Author: Carson Lam

*******************************************************************************/
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math.*;

public class ICSEnergy {  
    public static void main(String args[]) { 
        final double C = 3 * Math.pow(10, 8);
        final int bulbEnergy = 360000;
        Scanner Scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");
        
        double M = Scan.nextDouble();
        double E = M * Math.pow(C, 2);
        double bulbAmount = E / bulbEnergy;
        
        System.out.println(df.format(E));
        System.out.println(df.format(bulbAmount));
    } 
}