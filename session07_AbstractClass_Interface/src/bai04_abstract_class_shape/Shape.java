package bai04_abstract_class_shape;
//Ở bài này, chúng ta sẽ tạo abstract class tên là Shape
// có các thuộc tính : color , các phương thức get/set, các construtor,
// 1 phương thức trừu tượng tính diện tích là getArea(),
// phương thức display() để hiển thị màu sắc của hình đó
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    public Shape() {
        this.color = null;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
// 1 phương thức trừu tượng tính diện tích là getArea(),
    public abstract double getArea();
// phương thức display() để hiển thị màu sắc của hình đó
    public void display() {
        System.out.println("Color: " + color);
    }
}
