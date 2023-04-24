import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        {
            Scanner numsFile;
            PrintWriter pw;

            try {
                numsFile = new Scanner(new File("Section8-Projects/nums.txt"));
                pw = new PrintWriter("twice_nums.txt");

                int tempNum;

                while (numsFile.hasNext()) {
                    tempNum = numsFile.nextInt();
                    pw.println(tempNum + " multiplied by 2 is " + tempNum * 2 + ".");
                }

                System.out.println("Successfully wrote to file!");
                numsFile.close();
                pw.close();
            } 
            catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
