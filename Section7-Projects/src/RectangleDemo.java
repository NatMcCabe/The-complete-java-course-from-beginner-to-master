public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        System.out.println(Rectangle.getNumRectangles());

        Rectangle r3;

        System.out.println("After r3 declared: " + Rectangle.getNumRectangles());

        r3 = new Rectangle(2.5, 4);

        System.out.println("After r3 declared properly: " + Rectangle.getNumRectangles());

        System.out.println(r1.area() + " " + r1.perimeter());
        System.out.println(r2.area() + " " + r2.perimeter());
        System.out.println(r3.area() + " " + r3.perimeter());
    }
}
