import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> randomArray = makeArray();
        System.out.println(randomArray);
        System.out.println("Sum of randomArray is: " + sumElements(randomArray));
    }
    public static int sumElements(ArrayList<Integer> array){
        int sum = 0;
        for(Integer integer: array){
            sum += integer;
        }
        return sum;
    }
    public static ArrayList<Integer> makeArray(){
        ArrayList<Integer> randomArray = new ArrayList<>();
        Random rand = new Random();
        int arrayLength = rand.nextInt(69) + 1;
        for(int i = 0; i < arrayLength; i++){
            randomArray.add(rand.nextInt(69) + 1);
        }
        return randomArray;
    }
}