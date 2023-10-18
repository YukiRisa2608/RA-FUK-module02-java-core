package session02_bai_tap.bai06_menu_chuc_nang;

import java.util.Scanner;

public class MenuChucNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    ktraChanLe();
                    break;
                case 2:
                    ktraSoNguyenTo();
                    break;
                case 3:
                    ktraChiaHetCho3();
                    break;
                case 4:
                    System.out.println("Ứng dụng kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (luaChon != 4);
    }

    public static void ktraChanLe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int so = scanner.nextInt();

        if (so % 2 == 0) {
            System.out.println(so + " là số chẵn.");
        } else {
            System.out.println(so + " là số lẻ.");
        }
    }

    public static void ktraSoNguyenTo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int so = scanner.nextInt();

        if (so <= 1) {
            System.out.println(so + " không phải là số nguyên tố.");
            return;
        }

        boolean laSoNguyenTo = true;
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (so % i == 0) {
                laSoNguyenTo = false;
                break;
            }
        }

        if (laSoNguyenTo) {
            System.out.println(so + " là số nguyên tố.");
        } else {
            System.out.println(so + " không phải là số nguyên tố.");
        }
    }

    public static void ktraChiaHetCho3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int so = scanner.nextInt();

        if (so % 3 == 0) {
            System.out.println(so + " chia hết cho 3.");
        } else {
            System.out.println(so + " không chia hết cho 3.");
        }
    }
}

