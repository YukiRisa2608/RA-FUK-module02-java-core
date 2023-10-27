package bai04_triangle;

import bai04_triangle.Shape;

//Thiết kế lớp đối tượng Triangle mở rộng lớp Shape. Lớp này chứa:
//Ba trường dữ liệu side1, side2, side3 có kiểu là double, với giá trị mặc định 1.0 biểu thị cho độ dài ba cạnh của một tam giác.
//Một phương thức khởi tạo không có tham số giúp tạo nên tam giác mặc định.
//Một phương thức khởi tạo tạo ra ba tham số với độ dài ba cạnh cho trước.
//Các phương thức truy cập cho ba trường dữ liệu.
//Một phương thức getArea() trả về diện tích của tam giác.
//Một phương thức getPerimeter() trả về chu vi của tam giác.
//Một phương thức toString() trả về thông tin của tam giác dưới dạng chuỗi ký tự.
public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
//Một phương thức khởi tạo không có tham số giúp tạo nên tam giác mặc định.
    public Triangle() {
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    //Một phương thức khởi tạo tạo ra ba tham số với độ dài ba cạnh cho trước
    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
//Các phương thức truy cập cho ba trường dữ liệu.
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
//Một phương thức getArea() trả về diện tích của tam giác.
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
//Một phương thức getPerimeter() trả về chu vi của tam giác.
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
//Một phương thức toString() trả về thông tin của tam giác dưới dạng chuỗi ký tự
    public String toString() {
        return String.format("side1 %s, side2 %f, side3 %f,color %s, area %f, perimeter %f",side1, side2, side3, getColor(), getArea(), getPerimeter());
    }
}
