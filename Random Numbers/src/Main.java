import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("Number is:\t" + myRandomNumber);

        myRandomNumber = random.nextInt(1000);
        System.out.println("0 - 999?:\t" + myRandomNumber);

        myRandomNumber = random.nextInt(1000) + 1;
        System.out.println("1 to 1000?:\t" + myRandomNumber);
    }
}