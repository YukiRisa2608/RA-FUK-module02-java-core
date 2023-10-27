package bai01_Circle;

//Thiết kế và triển khai lớp bai01_Circle.Circle (hình tròn) và lớp con của nó bai01_Circle.Cylinder (hình trụ).
// Lớp bai01_Circle.Circle có những thuộc tính mô tả bán kính, màu sắc,
// các getter/setter cho các thuộc tính đó, và những thuộc tính liên đới như diện tích.
public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return String.format(" radius = %f, color = %s, area = %f", radius, color, getArea());
    }
}
