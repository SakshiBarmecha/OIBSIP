import java.util.Scanner;
public class task2 {
    public static void
    guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int K = 5;
        int i, guess;
        System.out.println("A number is chosen" + " between 1 to 100." + "\nGuess the number" + " within 5 trials.");
        for (i = 0; i < K; i++) {
            System.out.println("\nGuess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess
                     && i != K - 1) {
                System.out.println("The number is "+ "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {

                System.out.println("\nThe number is" + " less than " + guess);
            }
        }
        if (i == K) {
            System.out.println("\nYou have exhausted" + " your 5 trials."); 
            System.out.println("\nThe number was " + number);
        }
    }
   public static void main(String arg[])
    {
        guessingNumberGame();
    }
}
 