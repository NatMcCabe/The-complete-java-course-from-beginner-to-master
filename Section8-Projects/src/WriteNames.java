import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Nat");
        namesList.add("Matt");
        namesList.add("Jacob");
        namesList.add("Jun");

        try {
            PrintWriter pw = new PrintWriter("names.txt");

            for(String name: namesList){
                pw.println(name);
            }

            System.out.println("Successfully wrote to file!");
            pw.close();
        }

        catch(FileNotFoundException ex){
            System.out.println("Couldn't write to file!");
        }
    }
}
