import java.util.*;
public class PasswordChecker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        
        String guess1 = sc.nextLine();
        if (guess1.equals(password)) {
            System.out.println("Access granted.");
            System.exit(0);
        } else if (guess1 != password) {
            System.out.println("Incorrect.");
        }
        
        String guess2 = sc.nextLine();
        if (guess2.equals(password)) {
            System.out.println("Access granted.");
            System.exit(0);
        } else if (guess2 != password) {
            System.out.println("Incorrect.");
        }
        
        String guess3 = sc.nextLine();
        if (guess3.equals(password)) {
            System.out.println("Access granted.");
            System.exit(0);
        } else if (guess3 != password) {
            System.out.println("Incorrect.");
            System.out.println("Access denied.");
            System.exit(0);
        }
    }
}