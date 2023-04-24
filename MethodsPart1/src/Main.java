public class Main {
    public static void main(String[] args) {
        printHello();
        printNumber(4);
        int result = giveMe10();
        System.out.println(result);

        result = addThese(3, 6);
        System.out.println(result);

        double dresult;
        dresult = square(3.14);
        System.out.println(dresult);
    }

    public static void printHello(){
        System.out.println("Hello there!");
    }

    public static void printNumber(int a){
        System.out.println("The number is " + a);
    }

    public static int giveMe10(){
        return 10;
    }

    public static int addThese(int num1, int num2){
        return num1 + num2;
    }

    public static double square(double num){
        return num * num;
    }
}