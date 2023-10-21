package bai_tap_array.bai04_max_number_in_matrix;

import java.util.Scanner;

public class MaxNumberInMatrix {
    public static void main(String[] args) {
        //Khởi tạo
        Scanner scanner = new Scanner(System.in);
        System.out.println("in put amount of rows");
        int rows = scanner.nextInt();
        System.out.println("in put amount columns");
        int columns = scanner.nextInt();
        //Khai báo
        int[][] matrix = new int[rows][columns];

        //Gán giá trị
        System.out.println("________________________________");
            System.out.println("---input numbers in matrix---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Input number at row " + (i + 1) + " column " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        //In ra matrix
        System.out.println("__________________________");
        System.out.println("your matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //tìm ra tọa độ cũng như giá trị của phần tử lớn nhất.
//        Khai báo một biến số thực để chứa giá trị lớn nhất tìm kiếm được,
//        đặt cho những biến đó giá trị tương ứng của một phần tử ở tọa độ bất kỳ trong ma trận.
//        và hai số nguyên để chứa tọa độ của giá trị lớn nhất tìm kiếm được,
//        Sử dụng vòng lặp để duyệt qua hết các phần tử của ma trận, cập nhật kết quả mỗi khi tìm thấy giá trị lớn hơn.
        int maxNumInRow = 0;
        int maxNumInColumn = 0;
        int maxNumber = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxNumber) {
                    maxNumber = matrix[i][j];
                    maxNumInRow = i;
                    maxNumInColumn = j;
                }
            }
        }
        //In ra kết quả
        System.out.println("________________________________");
        System.out.println("Max number of matrix is: " + maxNumber);
        System.out.println("at: " + "row " + (maxNumInRow + 1) + " column " + (maxNumInColumn + 1));
    }
}
