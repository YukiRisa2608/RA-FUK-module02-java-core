package bai01_circle;

import java.util.Scanner;
//Xây dựng lớp Circle gồm các thuộc tính : Bán kính và Màu sắc. các phương thức khởi tạo (constructor) 0 tham số và có tham số, các phương thức getter và setter, phương thức chuVi() trả về chu vi của hình tròn , phương thức dienTich() trả về diện tích hình tròn ,phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của đối tượng, phương thức displayData() cho phép hiển thị toàn bộ thông tin các thuộc tính.
//Yêu cầu vẽ biểu đồ lớp Circle trước khi triển khai.
//Hướng dẫn
//Bước 1: Tạo lớp Circle, khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (constructors).
//Bước 2: Tạo lớp Main chưa phương thức main() để chạy chương trình.
//Bước 3: Trong lớp Main , khởi tạo các đối tượng hình tròn với bán kính khác nhau, tính chu vi và diện tích của các hình đó.
//Bước 4: Chạy chương trình và quan sát kết quả.
public class Circle {
    private double r;
    private String color;
    //constructor khồng có tham số
    public Circle() {
        //Đặt giá trị mặc định
        this.r = 0;
        this.color = "white";
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
        scanner.nextLine();// Đọc dòng mới tránh nuốt dòng
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
