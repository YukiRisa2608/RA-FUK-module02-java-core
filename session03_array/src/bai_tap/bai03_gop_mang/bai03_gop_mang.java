package bai_tap.bai03_gop_mang;
//Trong phần này, chúng ta sẽ phát triển một chương trình cho phép gộp 2 mảng thành một mảng thứ 3.
//        Chương trình cho phép người dùng nhập giá trị cho các phần tử trong 2 mảng số nguyên cho trước.
//        Mảng số nguyên thứ 3 được khai báo có kích thước bằng kích thước của 2 mảng số nguyên đã cho cộng lại. Mảng này chứa các phần tử trong mảng 1 và mảng 2.

import java.util.Scanner;

public class bai03_gop_mang {
    public static void main(String[] args) {
        // Nhập kích thước của 2 mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng thứ nhất");
        int n1 = scanner.nextInt();
        System.out.println("Nhập số phần tử của mảng thứ hai");
        int n2 = scanner.nextInt();

        //Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int n3 = n1 + n2;

        //Tạo mảng lưu giữ có size bằng numArray1,2,3
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];
        int[] array3 = new int[n3];

        //Nhập giá trị cho các phần tử trong mảng
        System.out.println("________________________________");
        System.out.println("Nhập " + n1 + " phần tử cho mảng thứ nhất");
        for (int i = 0; i < n1; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            array1[i] = scanner.nextInt();
        }
        System.out.println("________________");
        System.out.println("Nhập " + n2 + " phần tử cho mảng thứ hai");
        for (int i = 0; i < n2; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            array2[i] = scanner.nextInt();
        }
        // Sử dụng vòng lặp để duyệt các phần tử trong mảng 1. 
        // Lấy từng phần tử trong mảng 1 gán vào từng phần tử trong mảng thứ 3, tính từ phần tử đầu tiên.
        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }
        // Sử dụng vòng lặp để duyệt các phần tử trong mảng 2.
        // Lấy từng phần tử trong mảng 2 gán vào phần tử tiếp theo của mảng 3, tính từ phần tử array3[array1.length]
        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i];
        }
        //In ra mảng 3 sau khi gộp
        System.out.println("________________");
        System.out.println("Mảng mới sau khi gộp là:");
        for (int i : array3) {
            System.out.println(i);
        }
    }
}
