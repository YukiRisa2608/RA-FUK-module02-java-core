package bai_tap_array.bai06_sum_column;

import java.util.Scanner;

//người dùng nhập vào một mảng hai chiều của các số thực, sau đó cho phép người dùng nhập vào thứ tự của một cột (tính từ 0)
// và tính ra tổng các phần tử của cột đó.
public class bai06_sum_column {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input SIZE of array1");
        int size1 = scanner.nextInt();
        System.out.println("Input SIZE of array2");
        int size2 = scanner.nextInt();

        int[][] numbers = new int[size1][size2];

        System.out.println("_________________________");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Input number at row " + (i + 1) + " column " + (j + 1));
                numbers[i][j] = scanner.nextInt();
            }
        }
        System.out.println("__________________________");
        System.out.println("your arrays");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
        //Sum of columns
        System.out.println("___________________");
        System.out.println("Input column you want to sum");
        int col = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < size1; i++) {
            sum += numbers[i][col - 1];
        }
        System.out.println("_________________");
        System.out.println("Equal: " + sum);


    }
}
