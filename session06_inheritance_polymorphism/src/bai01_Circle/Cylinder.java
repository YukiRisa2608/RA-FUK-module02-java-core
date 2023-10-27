package bai01_Circle;

import bai01_Circle.Circle;

//Lớp bai01_Circle.Cylinder mở rộng lớp bai01_Circle.Circle bằng cách bổ sung thuộc tính chiều cao cũng như có thể có thêm phương thức lấy thể tích.
//Cả hai lớp đều phải cài đè phương thức toString để in ra thông tin chi tiết các thuộc tính của đối tượng.
public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return String.format("radius %f, color %s, height %f, area %f, volume %f", getRadius(), getColor(), height, getArea(), getVolume());
    }
}
