package bai02_phuong_trinh_bac2;

public class bai02_QuadraticEquation {
    //Trường dữ liệu a, b, và c thuộc kiểu private double đại diện cho 3 hệ số.
    private double a, b, c;
    //Phương thức khởi tạo với 3 tham số để khởi tạo các giá trị cho a, b và c.
    public bai02_QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public bai02_QuadraticEquation() {

    }

    //Phương thức gettter cho a, b và c.
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
    //trả về delta theo công thức delta = b2 - 4ac.
        return Math.pow(b,2) - 4 * a * c;
    }
    //Phương thức getRoot1() và getRoot2() trả về 2 nghiệm của phương trình là:
    //Phương thức getRoot1() và getRoot2() thật sự hữu ích khi delta >= 0. Hai phương thức này trả về 0 khi delta < 0.
    // Phương thức tính nghiệm 1
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0; // Trả về 0 nếu delta âm (không có nghiệm thực)
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }
    // Phương thức tính nghiệm 2
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0; // Trả về 0 nếu delta âm (không có nghiệm thực)
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    public static void equals(double a, double b, double c) {
        bai02_QuadraticEquation phuongTrinhBacHai = new bai02_QuadraticEquation(a, b, c);
        double delta = phuongTrinhBacHai.getDiscriminant();
        if (delta > 0) {
        System.out.println("Phương trình có hai nghiệm:");
        System.out.println("Nghiệm 1: " + phuongTrinhBacHai.getRoot1());
        System.out.println("Nghiệm 2: " + phuongTrinhBacHai.getRoot2());
    } else if (delta == 0) {
        System.out.println("Phương trình có nghiệm kép: " + phuongTrinhBacHai.getRoot1());
    } else {
        System.out.println("Phương trình vô nghiệm.");
    }
    }
}
