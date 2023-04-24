import java.util.Random;
import java.util.Scanner;

public class DiceSimulation {
    public static int diceRoll(){
        Random random = new Random();
        int roll;
        roll = random.nextInt(6) + 1;
        return roll;
    }

    public static void main(String[] args) {
        int input;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter how many rolls you would like:");
        input = keyboard.nextInt();

        for(int i = 0; i < input; i++){
            System.out.println(diceRoll());
        }
    }
}
