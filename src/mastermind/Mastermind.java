package mastermind;

import java.util.Scanner;
import mastermind.game.Color;

/**
 * Mastermind game implemented in Java
 * @author 
 */
public class Mastermind {

    private static Mastermind mastermind;

    /**
     * Creates a mastermind instance and begins playing.
     * @param args Optional launch arguments.
     */
    public static void main(String[] args) {
        mastermind = new Mastermind();
        mastermind.play();
        System.out.println("Thank you for playing ");
    }
    
    /**
     * Plays a game of Mastermind.
     */
    private void play(){
        CodeManager codeManager = new CodeManager();

        codeManager.generateCode();
        System.out.println("Welcome to Mastermind. Your colors are: "
                + Color.stringValues());

        System.out.println("A 4 digit code has been generated.");
        Scanner sc = new Scanner(System.in);
        int remainingPlays = 12;
        while (remainingPlays > 0) {

            System.out.println("Your turn to guess. You have " 
                    + remainingPlays + " turn(s) left.");

            String input = sc.nextLine();
            String result = codeManager.testCode(input);

            System.out.println("The computer responded with: " + result);
            if (result.equals("RRRR")) {
                System.out.println(
                        "You have won! You guessed the correct code."
                ); // win
                return;
            }
            remainingPlays--;
        }
        System.out.println("You have ran out of guesses. The computer has won.");
        System.out.println("The correct code was: " + codeManager.sayCode());
    }

}
