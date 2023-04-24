import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        int sum = 0;
        System.out.println("Enter a non-negative integer to add to the tally");
        System.out.println("or a negative number to complete the tally");

        input = keyboard.nextInt();
        while(input >= 0){
            System.out.println(input);
            sum += input;

            System.out.println("Enter a non-negative integer to add to the tally");
            System.out.println("or a negative number to complete the tally");
            input = keyboard.nextInt();
        }
        System.out.print("Done! Tally is: ");
        System.out.println(sum);
    }
}
