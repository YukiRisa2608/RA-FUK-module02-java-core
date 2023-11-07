package bai04_abstract_class_shape;

public class Test_main_shape {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "blue");
        Rectangle rectangle = new Rectangle(2, 2, "red");
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());

    }
}
