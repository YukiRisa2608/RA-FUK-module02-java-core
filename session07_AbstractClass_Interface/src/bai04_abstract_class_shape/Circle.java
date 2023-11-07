package bai04_abstract_class_shape;
//2 lớp con là Rectangle và Circle kế thừa abstract class Shape và triển khai phương thức getArea() để tính diện tích tương ứng.
// Ngoài ra các lớp con cũng có các thuộc tính riêng như bán kính trong Circle hay width, height trong Rectangle.
public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.pow(radius, 2.0) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "color = " + getColor() +
                ", radius = " + radius +
                '}';
    }
}
