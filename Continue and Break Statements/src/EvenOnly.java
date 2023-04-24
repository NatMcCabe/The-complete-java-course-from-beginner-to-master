public class EvenOnly {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10){
            if(count % 2 == 1){
                count++;
                continue;
            }
            else{
                System.out.println(count);

            }
            count++;

        }
    }
}
