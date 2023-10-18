package bai04_ChuViDienTichHinhChuNhat;

import java.util.Scanner;

public class ChuViDienTichHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật");
        double chieuDai = sc.nextDouble();
        System.out.println("Nhập chiều rộng hình chữ nhật");
        double chieuRong = sc.nextDouble();
        double p = (chieuDai + chieuRong) * 2;
        double s = chieuDai * chieuRong;
        System.out.println("Chu vi: " + p);
        System.out.println("Diện tích: " + s);
    }
}
