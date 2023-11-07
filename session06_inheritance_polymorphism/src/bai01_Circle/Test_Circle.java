package bai01_Circle;

public class Test_Circle {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "blue");
        Cylinder cylinder = new Cylinder(3, "blue", 2);
        System.out.println("Circle: " + circle.toString());
        System.out.println("Cylinder: " + cylinder.toString());
    }
}
