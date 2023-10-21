package bai_tap_array.bai02_add_index;

import java.util.Scanner;

public class bai02_add_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số phần tử trong mảng");
        //Khai báo
        int n = scanner.nextInt();
        //Khởi tạo mảng với kích thước N
        int[] numbers = new int[n];
        //Gán từng giá trị lần lượt nhập vào mảng
        System.out.println("Nhập " + n + " số");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        //Hiển thị các phần tử trong mảng cùng vị trí index
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + " là " + numbers[i]);
        }
        //Nhập X là số cần chèn
        System.out.println("Nhập số cần chèn");
        int x = scanner.nextInt();
        //Nhập vị trí index cần chèn X vào trong mảng
        System.out.println("Nhập vị trí index cần chèn vào trong mảng");
        int addIndex = scanner.nextInt();
        //Bước 4: Nếu index <= -1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng.
        if (addIndex <= -1 || addIndex >= numbers.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            //Thực hiện chèn phần tử X ở vị trí index vào mảng
            for (int i = n - 1; i >= addIndex; i--) {
                numbers[i] = numbers[i - 1];
                n++;
            }
            numbers[addIndex - 1] = x;
        }
        //In ra mảng mới
        System.out.println("Mảng mới sau khi thêm phần tử " + x + " vào vị trí thứ " + addIndex );
        for (int i = 0; i < n ; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + " là " + numbers[i]);
        }
    }
}
