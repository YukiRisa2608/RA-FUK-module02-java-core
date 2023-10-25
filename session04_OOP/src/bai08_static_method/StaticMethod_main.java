package bai08_static_method;
//Bước 2 : Tạo lớp Main có phương thức main () , trong phương thức main . Trong hàm main(), sử dụng các phương thức static để tính diện tích các hình  sau:
//Hình tròn có bán kính lần lượt là 3.5 và  6.
//Hình tam giác có các cạnh là (3, 4, 5), (4.5, 7, 6).
//Hình chữ nhật có kích thước (2.5, 6) và (4, 7).
public class StaticMethod_main {
    public static void main(String[] args) {
    //tính diện tích các hình
    //Hình tròn có bán kính lần lượt là 3.5 và  6.
        double circleArea1 = StaticMethod.calCircleArea(3.5);
        double circleArea2 = StaticMethod.calCircleArea(6);
    //Hình tam giác có các cạnh là (3, 4, 5), (4.5, 7, 6).
        double triangleArea1 = StaticMethod.calcTriangleArea(3, 4, 5);
        double triangleArea2 = StaticMethod.calcTriangleArea(4.5, 7, 6);
    //Hình chữ nhật có kích thước (2.5, 6) và (4, 7).
        double rectangleArea1 = StaticMethod.calcRectangleArea(2.5, 6);
        double rectangleArea2 = StaticMethod.calcRectangleArea(4, 7);

        System.out.println("Circle area 1: " + circleArea1);
        System.out.println("Circle area 2: " + circleArea2);
        System.out.println("______________");
        System.out.println("Triangle area 1: " + triangleArea1);
        System.out.println("Triangle area 2: " + triangleArea2);
        System.out.println("______________");
        System.out.println("Rectangle area 1: " + rectangleArea1);
        System.out.println("Rectangle area 2: " + rectangleArea2);


    }
}
