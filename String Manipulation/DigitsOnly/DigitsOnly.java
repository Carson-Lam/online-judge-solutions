/*
Author: Carson Lam
 */
import java.util.*;
public class DigitsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (hasDigits(sc.nextLine())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean hasDigits(String str) {
        int stringLength = str.length();
        for (int i = 0; i < stringLength; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}