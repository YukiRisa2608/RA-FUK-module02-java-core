package bai01_circle;

import java.util.Scanner;

public class Circle {
    double r;
    String color;
    //constructor khồng có tham số
    public Circle() {
        //Đặt giá trị mặc định
        r = 0;
        color = "white";
    }
    //constructor có tham số
    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }
    // Getter
    public String getColor() {
        return color;
    }

    public double getR() {
        return r;
    }

    // Setter
    public void setR(double r) {
        this.r = r;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Phương thúc cho người dùng nhập thông tin
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input radius of circle");
        double newRadius = scanner.nextDouble();
        this.setR(newRadius);
        scanner.nextLine();// Đọc dòng mới để loại bỏ ký tự xuống dòng
        System.out.println("Input color of circle");
        String newColor = scanner.nextLine();
        this.setColor(newColor);
    }
    //Phương thức tính diện tích
    public double getArea()
    {
        return this.r * r * Math.PI;
    }
    //Phương thức tính chu vi
    public double getPerimeter() {
        return this.r * 2 * Math.PI;
    }
    //Phương thức hiển thị toàn bộ thông tin thuộc tính hình tròn
    public void displayData() {
        System.out.println("Circle:");
        System.out.println("Radius: " + this.getR());
        System.out.println("Color: " + this.getColor());
        System.out.println("Perimeter: " + this.getPerimeter());
        System.out.println("Area: " + this.getArea());
    }
}
