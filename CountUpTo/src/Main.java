public class Main {
    public static void main(String[] args) {
        countUpTo(4, 8);
    }

    public static void countUpTo(int start, int end){
        if(end >= start){
            System.out.println(start);
            countUpTo(start + 1, end);
        }
    }
}