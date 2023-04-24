import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("output.txt");

            pw.println("Hello there");
            pw.println("My name is Nat McCabe");
            System.out.println("Successfully wrote to file!");
            pw.close();
        }

        catch(FileNotFoundException ex){
            System.out.println("Couldn't write to file!");
        }
    }
}
