package session02_bai_tap.bai02_hienThiCacLoaiHinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
//        [Bài tập] Hiển thị các loại hình
//        Mục tiêu
//        Luyện tập sử dụng cấu trúc lặp lồng nhau.
//                Mô tả
//        Trong phần này, chúng ta sẽ phát triển một ứng dụng hiển thị một menu cho phép người dùng lựa chọn hiển thị các hình. Menu gồm các lựa chọn như sau
//        Menu:
//        In hình chữ nhật (Rectangle)
//                In hình tam giác vuông góc vuông ở 4 góc khác nhau:
//        Trên cùng bên trái (top-left)
//        Trên cùng bên phải( top-right)
//        Dưới cùng bên trái( bottom-left)
//        Dưới cùng bên phải(bottom-right)
//        In hình tam giác cân ( Isosceles triangle)
//        Exit
//        Lưu ý: biểu diễn các hình có thể sử dụng ký hiệu * hoặc một ký hiệu khác.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. In hình chữ nhật (Rectangle)\n" +
                    "2. In hình tam giác vuông góc vuông ở 4 góc khác nhau: \n" +
                    "3. In hình tam giác cân ( Isosceles triangle)\n" +
                    "4. Exit\n");
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    // hiển thị hình chữ nhật
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("input amount of rows");
                    int rows = sc.nextInt();
                    System.out.println("input amount of columns");
                    int colums = sc.nextInt();

                    // Vòng lặp ngoài in ra số dòng (chiều dài)
                    for (int i = 0; i < rows; i++) {
                        // Vòng lặp trong in ra số cột (chiều rộng)
                        for (int j = 0; j < colums; j++) {
                            System.out.print("* ");
                        }
                        System.out.println(); // Xuống dòng sau mỗi dòng in
                    }
                    sc.nextLine();
                    break;
                case 2:
                    // hiển thị tam giác vuông theo menu
                    System.out.println("a. Trên cùng bên trái (top-left) \n" +
                            "b. Trên cùng bên phải( top-right)\n" +
                            "c. Dưới cùng bên trái( bottom-left) \n" +
                            "d. Dưới cùng bên phải(bottom-right)\n");
                    System.out.println("nhập lựa chọn của bạn");
                    String next = sc.nextLine();
                    switch (next) {
                        case "a": //Trên cùng bên trái (top-left)
                            for (int i = 5; i >= 0; i--) {
                                System.out.print("* ");
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            sc.nextLine();
                            break;
                        case "b": //Trên cùng bên phải( top-right)
                            int chieuDai = 5;
                            // Vòng lặp ngoài in ra số dòng (chiều dài)
                            for (int i = 1; i <= chieuDai; i++) {
                                // Vòng lặp trong in ra dấu cách trước dấu '*' để dịch sang phải
                                for (int j = 1; j < i; j++) {
                                    System.out.print("  ");
                                }
                                // Vòng lặp trong in ra số lượng '*' trong mỗi dòng
                                for (int k = i; k <= chieuDai; k++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                                sc.nextLine();
                                break;
                                case "c": //Dưới cùng bên trái( bottom-left)
                                    for (int i = 1; i <= 5; i++) {
                                        System.out.print("* ");
                                        for (int j = 1; j < i; j++) {
                                            System.out.print("* ");
                                        }
                                        System.out.println();
                                    }
                                    sc.nextLine();
                                    break;
                                case "d": //Dưới cùng bên phải(bottom-right
                                    int chieuDaiD = 5;
                                    // Vòng lặp ngoài in ra số dòng (chiều dài)
                                    for (int i = 1; i <= chieuDaiD; i++) {
                                        // Vòng lặp trong in ra dấu cách trước dấu '*' để dịch sang phải
                                        for (int j = 1; j <= chieuDaiD - i; j++) {
                                            System.out.print("  ");
                                        }
                                        // Vòng lặp trong in ra số lượng '*' trong mỗi dòng
                                        for (int b = 1; b <= i; b++) {
                                            System.out.print("* ");
                                        }
                                        System.out.println(); // Xuống dòng sau mỗi dòng in
                                    }
                                    sc.nextLine();
                                    break;
                                default:
                                    System.out.println("nhập lại");

                            }
                            break;
                        case 3:
                            int chieuDai = 5;
                            // Vòng lặp ngoài in ra số dòng (chiều dài)
                            for (int i = 1; i <= chieuDai; i++) {
                                // Vòng lặp in ra dấu cách trước dấu '*' để dịch sang phải
                                for (int j = i; j < chieuDai; j++) {
                                    System.out.print(" ");
                                }
                                // Vòng lặp in ra số lượng '*' trong mỗi dòng
                                for (int k = 1; k <= (2 * i - 1); k++) {
                                    System.out.print("* ");
                                }
                                System.out.println(); // Xuống dòng sau mỗi dòng in
                            }
                            sc.nextLine();
                            break;
                        case 4:
//                    System.exit(0);
                            System.out.println("thoát chương trình");
                            break;
                        default:
                            System.out.println("nhập không hợp lệ");
                    }

                    if (choice == 4) {
                        break;
                    }
            }
            // nothing
        }
    }
