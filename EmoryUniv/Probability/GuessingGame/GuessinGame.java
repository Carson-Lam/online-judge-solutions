package EmoryUniv.Probability.GuessingGame;
import java.util.*;
import java.lang.*;
public class GuessinGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int tries = 1;
        int guess;
        int answer = rand.nextInt(51);
        String replay;

        do {
            System.out.println("Welcome to the guessing game.");
            do {
                System.out.println("Input #" + tries + " - Please guess a number (0-50):");
                guess = sc.nextInt();
                sc.nextLine();
                if (guess > answer) {
                    System.out.println("Your guess is too high");
                } else if (guess < answer) {
                    System.out.println("Your guess is too low");
                } else {
                    break;
                }
                tries++;
            } while (tries <= 5);
            if (guess == answer) {
                System.out.println("Your guess is correct, you won.");
            } else {
                System.out.println("You use all of your chances. The correct number is: " + answer);
            }
            tries = 1;
            answer = rand.nextInt(51);
            System.out.println("Do you want to play one more time? (Y/N)");
            replay = sc.nextLine();
        } while (replay.equals("Y"));

    }
}

