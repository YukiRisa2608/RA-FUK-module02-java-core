package bai02_tien_te;

import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD amount you want to convert: ");
        double usd = sc.nextDouble();
        double rate = 23000;
        double vnd = usd * rate;
        System.out.println(usd + "USD" + "=" + vnd + "VND");
    }
}
