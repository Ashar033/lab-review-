import java.util.Random;
import java.util.Scanner;

public class CrapsGame {

    // Method to roll a single die
    public static int rollDie() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    // Method to roll two dice and return their sum
    public static int rollDice(Scanner scanner) {
        System.out.print("Press Enter to roll the dice...");
        scanner.nextLine(); // Wait for user to press Enter

        int die1 = rollDie();
        int die2 = rollDie();
        int sum = die1 + die2;
        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = rollDice(scanner);

        if (sum == 7 || sum == 11) {
            System.out.println("You win");
        } else if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        } else {
            int point = sum;
            System.out.println("point is " + point);

            // Keep rolling until point or 7
            while (true) {
                sum = rollDice(scanner);
                if (sum == point) {
                    System.out.println("You win");
                    break;
                } else if (sum == 7) {
                    System.out.println("You lose");
                    break;
                }
            }
        }

        scanner.close();
    }
}
