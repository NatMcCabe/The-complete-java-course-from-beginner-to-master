import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        {
            Scanner rectangleDataFile;

            try {
                rectangleDataFile = new Scanner(new File("Section8-Projects/rectangle_data.txt"));

                ArrayList<String> rectangleList = new ArrayList<>();
                String tempLine;
                double width;
                double length;
                double area;
                double perimeter;
                int counter = 0;

                Rectangle tempRectangle;

                while (rectangleDataFile.hasNext()) {
                    counter++;

                    tempLine = rectangleDataFile.nextLine();
                    String[] splitString = tempLine.split("\\s+");

                    length = Double.valueOf(splitString[0]);
                    width = Double.valueOf(splitString[1]);

                    tempRectangle = new Rectangle(length, width);

                    rectangleList.add("Rectangle" + counter
                            + " | Length: " + tempRectangle.getLength()
                            + " | Width: " + tempRectangle.getWidth()
                            + " | Area: " + tempRectangle.area()
                            + " | Perimeter: " + tempRectangle.perimeter()
                    );


                }
                for(String rectangle: rectangleList){
                    System.out.println(rectangle);
                }

                rectangleDataFile.close();
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
