package bai09_access_modifier;
//Hai thuộc tính có access modifier là private: radius (double) có giá trị khởi tạo là 1.0, color (String) có giá trị khởi tạo là "red".
//Hai hàm tạo: một không có tham số và một có tham số là radius.
//Hai phương thức có access modifier là public: getRadius và getArea.
public class Circle {
    private double radius;
    public String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
//        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }
}
