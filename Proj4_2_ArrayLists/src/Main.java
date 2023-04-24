import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> realNumList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        int input = 0;

        while(input >= 0){
            System.out.println("Please enter a real number to add to the list, if you wish to exit, enter a negative number");
            input = keyboard.nextInt();
            if(input < 0){
                break;
            }
            realNumList.add(input);
        }

        System.out.println("The reversed list is:");
//        Collections.reverse(realNumList);
//        System.out.println(realNumList);
        for(int i = realNumList.size() - 1; i >= 0; i--){
            System.out.println(realNumList.get(i));
        }
    }
}