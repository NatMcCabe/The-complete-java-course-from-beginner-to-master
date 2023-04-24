import java.util.Scanner;

public class Main {
    public static int[] integerArray = new int[5];
    public static void main(String[] args) {
        integerStorage();
        for(int SelectedInteger : integerArray){
            System.out.println(SelectedInteger * 2);
        }
    }
    public static void integerStorage(){
        Scanner keyboard = new Scanner(System.in);
        int input;
        for(int i = 0; i < integerArray.length; i++){
//        for(int i: integerArray){

                System.out.println("Please type an integer to add to the array:");
            input = keyboard.nextInt();
            integerArray[i] = input;
        }
    }
}