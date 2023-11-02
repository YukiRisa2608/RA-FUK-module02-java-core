package bai09_access_modifier;
//Hãy tạo lớp TestCircle, tạo đối tượng Circle và truy cập đến các phương thức getRadius() và getArea().
public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("R = " + circle.getRadius());
        System.out.println("S = " + circle.getArea());
//Thay đổi access modifier cho các phương thức getRadius() và getArea(), sau đó test lại.
        //Bị lỗi
    }
}
