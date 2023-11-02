package bai04_fan;
//Viết chương trìnhHiển thị các đối tượng bằng cách gọi phương thức toString
public class main_fan {
    public static void main(String[] args) {
//Tạo 2 đối tượng Fan
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
//Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
//Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan1:" + fan1.toString());
        System.out.println("Fan2:" + fan2.toString());
    }
}
