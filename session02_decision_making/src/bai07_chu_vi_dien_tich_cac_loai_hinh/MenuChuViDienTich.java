package bai07_chu_vi_dien_tich_cac_loai_hinh;
import java.util.Scanner;

public class MenuChuViDienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tinhChuViDienTichHinhChuNhat();
                    break;
                case 2:
                    tinhChuViDienTichHinhTamGiac();
                    break;
                case 3:
                    tinhChuViDienTichHinhTron();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void tinhChuViDienTichHinhChuNhat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật là: " + dienTich);
    }

    public static void tinhChuViDienTichHinhTamGiac() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài cạnh 1: ");
        double canh1 = scanner.nextDouble();
        System.out.print("Nhập chiều dài cạnh 2: ");
        double canh2 = scanner.nextDouble();
        System.out.print("Nhập chiều dài cạnh 3: ");
        double canh3 = scanner.nextDouble();

        double chuVi = canh1 + canh2 + canh3;
        double p = chuVi / 2; // Chu vi tam giác chia 2
        double dienTich = Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));

        System.out.println("Chu vi của hình tam giác là: " + chuVi);
        System.out.println("Diện tích của hình tam giác là: " + dienTich);
    }

    public static void tinhChuViDienTichHinhTron() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        double r = scanner.nextDouble();

        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;

        System.out.println("Chu vi của hình tròn là: " + chuVi);
        System.out.println("Diện tích của hình tròn là: " + dienTich);
    }
}

