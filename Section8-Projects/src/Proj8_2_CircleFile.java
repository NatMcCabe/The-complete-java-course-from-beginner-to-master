import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        {
            Scanner circleDataFile;
            PrintWriter pw;

            try {
                circleDataFile = new Scanner(new File("Section8-Projects/circle_data.txt"));
                pw = new PrintWriter("circles_output.txt");

                ArrayList<Circle> circleList = new ArrayList<>();
                double tempRadius;
                double circumference;
                int counter = 0;

                Circle tempCircle;

                while (circleDataFile.hasNext()) {

                    tempRadius = circleDataFile.nextDouble();
                    tempCircle = new Circle(tempRadius);

                    circleList.add(tempCircle);
                }
                for (Circle circle : circleList) {
                    counter++;
                    String circleDetails = "Cirlce" + counter
                            + " | Radius: " + String.format("%.1f", circle.radius)
                            + " | Circumference: " + String.format("%.2f", circle.circumference())
                            + " | Area: " + String.format("%.2f", circle.area());
                    System.out.println(circleDetails);
                    pw.println(circleDetails);
                }
                System.out.println();
                System.out.println("Successfully added to file!");

                circleDataFile.close();
                pw.close();

            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

}
