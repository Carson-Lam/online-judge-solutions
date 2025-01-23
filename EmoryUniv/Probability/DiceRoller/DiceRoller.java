package EmoryUniv.Probability.DiceRoller;
import java.util.*;
public class DiceRoller {
    public static void main(String[] args) {
        Random rand = new Random();
        int firstDice1 = rand.nextInt(6) + 1;
        int firstDice2 = rand.nextInt(6) + 1;
        int secondDice1 = rand.nextInt(6) + 1;
        int secondDice2 = rand.nextInt(6) + 1;
        int p1Total = firstDice1 + firstDice2;
        int p2Total = secondDice1 + secondDice2;
        if ((p1Total == 7) && (p2Total != 7)) {
            System.out.println("Player 1 dice: " + firstDice1 + " " + firstDice2);
            System.out.println("Player 2 dice: " + secondDice1 + " " + secondDice2);
            System.out.println("Player 1 wins");
        } else if ((p2Total == 7) && (p1Total != 7)) {
            System.out.println("Player 1 dice: " + firstDice1 + " " + firstDice2);
            System.out.println("Player 2 dice: " + secondDice1 + " " + secondDice2);
            System.out.println("Player 2 wins");
        } else if (p1Total < p2Total) {
            System.out.println("Player 1 dice: " + firstDice1 + " " + firstDice2);
            System.out.println("Player 2 dice: " + secondDice1 + " " + secondDice2);
            System.out.println("Player 1 wins");
        } else if (p2Total < p1Total) {
            System.out.println("Player 1 dice: " + firstDice1 + " " + firstDice2);
            System.out.println("Player 2 dice: " + secondDice1 + " " + secondDice2);
            System.out.println("Player 2 wins");
        } else {
            System.out.println("Player 1 dice: " + firstDice1 + " " + firstDice2);
            System.out.println("Player 2 dice: " + secondDice1 + " " + secondDice2);
            System.out.println("The game is draw");
        }
    }

}