package bai08_static_method;
//Trong bài này, chúng ta sẽ xây dựng 1 class tên là StaticMethod  có 1 thuộc tính static là PI với giá trị = 3.14,
// các phương thức static như:
//calCircleArea(double R) để tính diện tích hình tròn.
//calRectangleArea(double width,double height) để tính diện tích hình chữ nhật.
//calTriangleArea(double a, double b, double c) để tính diện tích của tam giác
public class StaticMethod {
    //có 1 thuộc tính static là PI với giá trị = 3.14,
   public static final double PI = 3.14;
    //calCircleArea(double R) để tính diện tích hình tròn.
   public static double calCircleArea(double r) {
       return Math.pow(r, 2) * PI;
   }
    //calRectangleArea(double width,double height) để tính diện tích hình chữ nhật.
    public static double calcRectangleArea(double width,double height) {
       return width * height;
    }
    //calTriangleArea(double a, double b, double c) để tính diện tích của tam giác
    public  static double calcTriangleArea(double a, double b, double c) {
       double p = (a + b + c) / 2;
       return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
