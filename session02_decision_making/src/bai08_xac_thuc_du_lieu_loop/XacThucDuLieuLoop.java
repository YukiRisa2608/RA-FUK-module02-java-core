package bai08_xac_thuc_du_lieu_loop;

import java.util.Scanner;

public class XacThucDuLieuLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double canh1, canh2, canh3;

        while (true) {
            System.out.print("Nhập cạnh 1, độ dài lớn hơn 0: ");
            canh1 = scanner.nextDouble();
            System.out.print("Nhập cạnh 2, độ dài lớn hơn 0: ");
            canh2 = scanner.nextDouble();
            System.out.print("Nhập cạnh 3, độ dài lớn hơn 0: ");
            canh3 = scanner.nextDouble();

            if (kiemTraTamGiac(canh1, canh2, canh3)) {
                double chuVi = tinhChuVi(canh1, canh2, canh3);
                double dienTich = tinhDienTich(canh1, canh2, canh3);

                System.out.println("Chu vi của tam giác là: " + chuVi);
                System.out.println("Diện tích của tam giác là: " + dienTich);
                break;
            } else {
                System.out.println("Ba cạnh nhập vào không hợp lệ. Hãy nhập lại.");
            }
        }
        scanner.close();
    }

    public static boolean kiemTraTamGiac(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }
    public static double tinhChuVi(double a, double b, double c) {
        return a + b + c;
    }
    public static double tinhDienTich(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

