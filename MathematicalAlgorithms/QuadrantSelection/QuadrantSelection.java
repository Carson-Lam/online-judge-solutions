package MathematicalAlgorithms.QuadrantSelection;
/*
 * Author: Carson Lam
 */
import java.util.*;
public class QuadrantSelection
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x > 0 && y > 9) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        }
    }
}
