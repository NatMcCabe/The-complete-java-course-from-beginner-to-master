public class Main {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("While loop");
        while(count < 10){
            System.out.println(count);
            count++;
        }

        System.out.println();
        System.out.println("DoWhile loop");
        int count2 = 0;
        do{
            System.out.println(count2);
            count2++;
        }
        while(count2 < 10);

        System.out.println();
        System.out.println("For loop");
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }
}

