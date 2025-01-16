/*
Author: Carson Lam
 */
import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String T = " ";
        for (int i = 1; i<=10; i++) {
            T = sc.next();
            if (startsWith(str, T) || endsWith(str,T)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
    public static Boolean startsWith(String str, String T) {
        int Tlength = T.length();
        if (str.substring(0, Tlength).equals(T)) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean endsWith(String str, String T) {
        int Tlength = T.length();
        int compositeLength = str.length() - Tlength;
        if (str.substring(compositeLength).equals(T)) {
            return true;
        } else {
            return false;
        }
    }
}