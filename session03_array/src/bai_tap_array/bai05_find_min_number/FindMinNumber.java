package bai_tap_array.bai05_find_min_number;

import java.util.Scanner;

public class FindMinNumber {
    public static void main(String[] args) {
        //cho phép người dùng khai báo một mảng số nguyên với các giá trị trong mảng được khởi tạo sẵn hoặc được nhập từ bàn phím.
        // Chương trình sẽ hiển thị ra giá trị nhỏ nhất trong mảng.
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array's SIZE");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("input " + size + " numbers");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("________________________");
        System.out.println("Your arrays: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        int minNumber = array[0];
        for (int i = 0; i < size - 1; i++) {
            if (array[i + 1] < minNumber) {
                minNumber = array[i+1];
            }
        }
        System.out.println("Min number in your array is: " + minNumber);
    }
}
