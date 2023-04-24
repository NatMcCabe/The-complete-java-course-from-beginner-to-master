public class Circle {
    public double radius;

    public Circle(){
        this.radius = 1;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public void printCircleDetails(){
        System.out.println("The radius of the circle is: " + String.format("%.2f", radius));
        System.out.println("The circumference of the circle is: " + String.format("%.2f", circumference()));
        System.out.println("The area of the circle is: " + String.format("%.2f", area()));
    }
}
