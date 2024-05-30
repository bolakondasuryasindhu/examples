abstract class Shape{
  abstract void calculation();
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
 void calculation() {
        double area = length * width;
        System.out.println("Area of the rectangle:" + area);
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

   void calculation() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle:" + area);
    }
}
public class Main{
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.calculation();
        Shape circle = new Circle(7);
        circle.calculation(); 
    }
}