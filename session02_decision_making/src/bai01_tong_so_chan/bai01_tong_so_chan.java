package bai01_tong_so_chan;

import java.util.Scanner;

public class bai01_tong_so_chan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat");
        int firstNumber = sc.nextInt();
        System.out.println("Nhap so thu hai");
        int secondNumber = sc.nextInt();
        int total = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("total = " + total);
    }
}
