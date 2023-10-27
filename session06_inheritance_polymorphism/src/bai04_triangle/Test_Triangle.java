package bai04_triangle;

import java.util.Scanner;

//Viết một chương trình để kiểm thử bằng cách hỏi người dùng nhập vào độ ba cạnh và màu sắc của tam giác.
// Chương trình phải tạo được một đối tượng Triangle với độ dài ba cạnh đã được cung cấp và đặt màu sắc cho đối tượng đó như người dùng nhập vào.
// Chương trình phải thông báo cho người dùng màu sắc, diện tích, chu vi của tam giác.
//Bước 1: Viết mã triển khai và mã kiểm thử cho lớp Shape tại hàm main()
//Bước 2: Viết mã triển khai và mã kiểm thử cho lớp Triangle tại hàm main()
public class Test_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Bước 1: Viết mã triển khai và mã kiểm thử cho lớp Shape tại hàm main()
        System.out.println("Input color of shape");
        String shapeColor = scanner.nextLine();
        Shape shape = new Shape(shapeColor);
        System.out.println("Shape: " + shape);
        System.out.println("______________");
//Bước 2: Viết mã triển khai và mã kiểm thử cho lớp Triangle tại hàm main()
        System.out.println("Input side1 of triangle");
        double side1 = scanner.nextDouble();
        System.out.println("Input side2 of triangle");
        double side2 = scanner.nextDouble();
        System.out.println("Input side3 of triangle");
        double side3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Input color of triangle");
        String triangleColor = scanner.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(triangleColor);
        System.out.println("Triangle: "+ triangle);

    }
}
