public class CircleDemo {
    public static void main(String[] args) {
        Circle unitCircle = new Circle();
        Circle bigCircle = new Circle(5.5);

        unitCircle.printCircleDetails();
        System.out.println();
        bigCircle.printCircleDetails();
    }
}
