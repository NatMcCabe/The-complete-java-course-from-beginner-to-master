import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static int randomNumber = random.nextInt(100) + 1;
    static int guesses = 0;
    static int guess;
    public static void main(String[] args) {
        newGuess();
        while(guess != randomNumber){
            if (guess < randomNumber) {
                System.out.println("Your guess was too low, try again!");
                newGuess();
            }
            if (guess > randomNumber) {
                System.out.println("Your guess was too high, try again!");
                newGuess();
            }
        }
        System.out.println("Congratulations, you guessed the random number in " + guesses + " guesses!");
    }
    public static void newGuess(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please guess a number between 1 and 100:");
        guess = keyboard.nextInt();
        guesses++;
    }
}

