package bai04_abstract_class_shape;

public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "width = " + width +
                ", height = " + height +
                ", color = " + getColor() +
                ", area = " + getArea() +
                '}';
    }
}
