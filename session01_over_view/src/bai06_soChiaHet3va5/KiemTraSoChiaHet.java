package bai06_soChiaHet3va5;

import java.util.Scanner;

public class KiemTraSoChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Số chia hết cho cả 3 và 5");
        }else if (number % 3 == 0 && number % 5 > 0) {
            System.out.println("Số chỉ chia hết cho 3");
        }else if (number % 3 > 0 && number % 5 == 0) {
            System.out.println("Số chỉ chia hết cho 5");
        } else {
            System.out.println("Số không chia hết cho cả 3 và 5");
        }
    }
}
