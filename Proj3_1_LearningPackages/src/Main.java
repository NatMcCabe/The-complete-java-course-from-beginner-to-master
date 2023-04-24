import java.util.Scanner;

public class Main {
    static int packageNumber;
    static int totalCourses;
    static int monthlyCost;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What package are you using?");
        packageNumber = keyboard.nextInt();
        System.out.println("How many courses are you enrolled in?");
        totalCourses = keyboard.nextInt();

        if(packageNumber == 1){
            totalCourses -= 2;
            nonNegativeTotalCourses();
            monthlyCost = 10 + (totalCourses * 6);
        } else
        if(packageNumber == 2){
            totalCourses -= 4;
            nonNegativeTotalCourses();
            monthlyCost = 12 + (totalCourses * 4);
        } else
        if(packageNumber == 3){
            totalCourses -= 6;
            nonNegativeTotalCourses();
            monthlyCost = 15 + (totalCourses * 3);
        }
        System.out.println("Total cost is: £" + monthlyCost);
    }
    public static void nonNegativeTotalCourses(){
        if(totalCourses < 0 ){
            totalCourses = 0;
        }
    }
}