package bai04_fan;
//Thiết kế lớp Fan to để mô tả về cái quạt.
//Vẽ sơ đồ UML cho lớp và cài đặt lớp

public class Fan {
//3 hằng được đặt tên là SLOW, MEDIUM, và FAST với giá trị 1, 2, và 3 để biểu thị tốc độ quạt.
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    //Trường speed có kiểu số nguyên (private int) để xác định tốc độ quạt, mặc định là SLOW
//Trường on có kiểu private boolean để xác định quạt đang bật hay tắt, mặc định là false (tắt).
//Trường radius có kiểu private double để xác định bán kính quạt, giá trị mặc định là 5
//Trường color có kiểu dữ liệu private String để xác định màu quạt, mặc định là blue
    private int speed;
    private boolean on;
    private int radius;
    private String color;
//Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
//Các getter và setter cho các thuộc tính
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
//Phương thức toString() trả về chuỗi chứa thông tin của quạt.
// Nếu quạt đang ở trạng thái on, phương thức trả về speed, color, và radius với chuỗi “fan is on”.
// Nếu quạt không ở trạng thái off, phương thức trả về color, radius với chuỗi “fan is off”.
    public String toString() {
        if (on) {
            return "Speed: " + speed + ", color: " + color + ", radius: " + radius + ". Fan is on";
        } else {
            return "Color: " + color + ", radius: " + radius + ". Fan is off";
        }
    }
}
